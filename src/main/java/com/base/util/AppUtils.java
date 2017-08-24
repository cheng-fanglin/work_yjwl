package com.base.util;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.dgc.VMID;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.PropertyUtils;
import org.hibernate.util.StringHelper;

import com.bstek.bdf2.core.business.IUser;
import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.bdf2.core.model.DefaultUser;
import com.bstek.bdf2.core.orm.IDao;
import com.bstek.dorado.core.Configure;

/**
 * @ClassName AppUtils
 * @Description 公用方法
 * @author 魏甘
 * @Date 2016-10-28 上午11:14:50
 * @version 1.0.0
 */
@SuppressWarnings("unchecked")
public final class AppUtils {
	
	/** 
     * 处理的最大数字达千万亿位 精确到分 
     * @return 
     */  
    public static String digitUppercase(BigDecimal num) throws Exception{  
        String fraction[] = {"角", "分"};  
        String digit[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };  
        String unit1[] = {"", "拾", "佰", "仟"};//把钱数分成段,每四个一段,实际上得到的是一个二维数组  
        String unit2[] = {"元", "万", "亿","万亿"}; //把钱数分成段,每四个一段,实际上得到的是一个二维数组  
        num=num.multiply(new BigDecimal(100));  
//        Double bigDecimal = new Double(name*100);     存在精度问题 eg：145296.8  
        String strVal = String.valueOf(num.toBigInteger());  
        String head = strVal.substring(0,strVal.length()-2);         //整数部分  
        String end = strVal.substring(strVal.length()-2);              //小数部分  
        String endMoney="";  
        String headMoney = "";  
        if("00".equals(end)){  
            endMoney = "整";  
        }else{  
            if(!end.substring(0,1).equals("0")){  
                endMoney+=digit[Integer.valueOf(end.substring(0,1))]+"角";  
            }else if(end.substring(0,1).equals("0") && !end.substring(1,2).equals("0")){  
                endMoney+= "零";  
            }  
            if(!end.substring(1,2).equals("0")){  
                endMoney+=digit[Integer.valueOf(end.substring(1,2))]+"分";  
            }  
        }  
        char[] chars = head.toCharArray();  
        Map<String,Boolean> map = new HashMap<String,Boolean>();//段位置是否已出现zero  
        boolean zeroKeepFlag = false;//0连续出现标志  
        int vidxtemp = 0;  
        for(int i=0;i<chars.length;i++){  
            int idx = (chars.length-1-i)%4;//段内位置  unit1  
            int vidx = (chars.length-1-i)/4;//段位置 unit2  
            String s = digit[Integer.valueOf(String.valueOf(chars[i]))];  
            if(!"零".equals(s)){  
                headMoney += s +unit1[idx]+unit2[vidx];  
                zeroKeepFlag = false;  
            }else if(i==chars.length-1 || map.get("zero"+vidx)!=null){  
                headMoney += "" ;  
            }else{  
                headMoney += s;  
                zeroKeepFlag = true;  
                map.put("zero"+vidx,true);//该段位已经出现0；  
            }  
            if(vidxtemp!=vidx || i==chars.length-1){  
                headMoney = headMoney.replaceAll(unit2[vidx],"");  
                headMoney+=unit2[vidx];  
            }  
            if(zeroKeepFlag && (chars.length-1-i)%4==0){  
                headMoney = headMoney.replaceAll("零","");  
            }  
        }  
        return headMoney+endMoney;  
    }  
	
	public static Date getCurrentDate() {
		return new Date();
	}
	
	public static String getCurrentDateString(String formatStr) {
		SimpleDateFormat sd = new SimpleDateFormat(formatStr);
		return sd.format(new Date());
	}
	
	/**
	 * @Description 获取唯一ID
	 * @return
	 */
	public static String generateUniqueKey() {
		return new VMID().toString();
	}
	
	/**
	 * @Description 获取登录人信息
	 * @return
	 */
	public static IUser getUserInfo(){ 
		IUser iuser = ContextHolder.getLoginUser();
		if(iuser==null){
			DefaultUser user = new DefaultUser();
			return (IUser)user;
		}
		return iuser;
	}
	
	/**
	 * @Description 获取登录人名字
	 * @return
	 */
	public static String getUserName(){ 
		return ContextHolder.getLoginUserName();
	}
	
	/**
	 * @Description 获取登录人公司别
	 * @return
	 */
	public static String getCompId() {
		IUser userInfo = getUserInfo();
		String compId = Configure.getString(IDao.FIXED_COMPANY_ID);
		if(null==userInfo){
			return compId;
		}else{
			if(AppUtils.isEmpty(userInfo.getCompanyId())){
				return compId;
			}else{
				return userInfo.getCompanyId();
			}
			
		}
	}
	
	/**
	 * @Description ISO转码
	 * @param s
	 * @param charsetName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String translateFromISO(String s, String charsetName)
			throws UnsupportedEncodingException {
		if (s != null) {
			return new String(s.getBytes("ISO8859-1"), charsetName);
		}
		return null;
	}

	public static String translate(String s, String originCharsetName,
			String charsetName) throws UnsupportedEncodingException {
		if (!(originCharsetName.equals(charsetName))) {
			if (s != null) {
				return new String(s.getBytes(originCharsetName), charsetName);
			}
			return null;
		}
		return s;
	}

	/**
	 * @Description 判断字符串是否为空
	 * @param s
	 * @return
	 */
	public static boolean isNotEmpty(String s) {
		return ((s != null) && (s.length() > 0));
	}
	/**
	 * @Description 判断对象是否为null或空字符串
	 * @param s
	 * @return
	 */
	public static boolean isNotEmpty(Object s) {
		if(s==null){
			return false;
		}else if(s.toString().length() > 0){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * @Description 判断字符串是否为空
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s) {
		return ((s == null) || (s.length() == 0));
	}

	public static String validate(String s) {
		if (s == null) {
			return "";
		}
		return s;
	}
	
	/////////////////////////////////
	
	/**
	 * @Description 判断字符串是否为空
	 * @param s
	 * @return
	 */
	public static boolean isNotEmpty(List list) {
		return ((list != null) && (list.size() > 0));
	} 
	/**
	 * @Description 判断字符串是否为空
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(List list) {
		return ((list == null) || (list.size() == 0));
	}
 

	@SuppressWarnings("rawtypes")
	public static String[] split(String s, String separator) {
		int slen = s.length();
		int reglen = separator.length();
		int index = 0;
		int nextIndex = 0; 
		List stringList = new ArrayList();
		while (index < slen) {
			nextIndex = s.indexOf(separator, index);
			if (nextIndex < 0)
				break;
			stringList.add(s.substring(index, nextIndex));
			index = nextIndex + reglen;
		}
		String[] result = new String[stringList.size()];
		return ((String[]) (String[]) stringList.toArray(result));
	}

	public static String toValidString(Object o) {
		if (o == null) {
			return "";
		}
		return o.toString();
	}
	
	/** 
	* @Description: 格式化字符串 主要是后台日期格式为yyyyMMddHHmm的数据
	* @Title: formatDare 
	* @param date
	* @return
	* @throws Exception 
	* @time: 2017年4月5日下午3:03:59
	* @author: wg
	*/ 
	public static String formatDare(String date) throws Exception{
		if(AppUtils.isEmpty(date)){
			return null;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String a = date.replace("/", "");
		String b = a.replace("-", "");
		String c = b.replace(":", "");
		String d = c.replace(" ", "");
		int index = d.length();
		String e ="";
		if(8==index){
			e = d+"000000";
		}else if(12==index){
			e = d+"00";
		}else{
			e = d;
		}
		Date dd = formatter.parse(e);
		return ""+dd.getTime();
	}
	
	
	public static String toValidStringTrim(Object o) {
		if (o == null) {
			return "";
		}
		return o.toString().trim();
	}
	public static String toValidUtf8String(String str) throws Exception {
		str =toValidString(str);
		return new String(str.getBytes("iso-8859-1"), "utf-8");
	}
	/**
	 * @Description 转为字符串，为空就返回0
	 * @param o
	 * @return
	 */
	public static String toValidStringForZero(Object o) {
		if (o == null) {
			return "0";
		}
		if(isEmpty(o.toString())){
			return "0";
		}
		return o.toString();
	}
	
	/**
	 * @Description 对象转BigDecimal
	 * @param value
	 * @return
	 */
	public static BigDecimal getBigDecimal( Object value ) {
        BigDecimal ret = null;
        if( value != null ) {
            if( value instanceof BigDecimal ) {
                ret = (BigDecimal) value;
            } else if( value instanceof String ) {
                ret = new BigDecimal(toValidStringForZero(value));
            } else if( value instanceof BigInteger ) {
                ret = new BigDecimal( (BigInteger) value );
            } else if( value instanceof Number ) {
                ret = new BigDecimal( ((Number)value).doubleValue() );
            } else {
                throw new ClassCastException("Not possible to coerce ["+value+"] from class "+value.getClass()+" into a BigDecimal.");
            }
        }else{
        	ret = BigDecimal.ZERO;
        }
        return ret;
    }
	
	/**
	 * @Description 对象赋值
	 * @param sourceObject 数据源对象
	 * @param destObject 目的对象
	 * @param excludedPropertyNames 字段名
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static final void copyProperties(Object sourceObject,
			Object destObject, String[] excludedPropertyNames)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		if (ClassUtils.isAssignable(sourceObject.getClass(), Map.class)) {
			Map<String, Object> mapObject = (Map<String, Object>) sourceObject;
			for (Map.Entry<String, Object> entry : mapObject.entrySet()) {
				String propertyName = entry.getKey();
				Object objectValue = entry.getValue();
				if (StringUtils.equals("class", propertyName)) {
					continue;
				}
				if (null != excludedPropertyNames) {
					boolean skip = false;
					for (String n : excludedPropertyNames) {
						if (StringUtils.equals(n, propertyName)) {
							skip = true;
							break;
						}
					}if (skip) {
						continue;
					}

				}try {
					PropertyUtils.setProperty(destObject, propertyName,
							objectValue);
				} catch (NoSuchMethodException e) {
				}
			}
		} else {
			PropertyDescriptor[] propertyDescriptors = PropertyUtils
					.getPropertyDescriptors(sourceObject);
			if (null != propertyDescriptors) {
				for (PropertyDescriptor pd : propertyDescriptors) {
					String propertyName = pd.getName();
					if (StringUtils.equals("class", propertyName)) {
						continue;
					}
					try {
						Object objectValue = PropertyUtils.getProperty(
								sourceObject, propertyName);

						PropertyUtils.setProperty(destObject, propertyName,
								objectValue);
					} catch (NoSuchMethodException e) {
					}
				}
			}
		}

	}

	/**
	 * @param sourceObject
	 * @param destObject
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static final void copyProperties(Object sourceObject,
			Object destObject) throws NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		copyProperties(sourceObject, destObject, null);
	}
	
	/*
	 * 自定义方法,转换数据库字段为类字段 若结果有重复key(如xc01_id_,xc01_id),结果将保存包含value的那一个
	 */
	public static List<Map<String, Object>> convertKey(List<Map<String, Object>> list) {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (Map<String, Object> map : list) {
			Map resultMap = new HashMap<String, Object>();
			Set<Entry<String, Object>> set = map.entrySet();
			for (Entry<String, Object> entry : set) {
				String key = entry.getKey();
				String resultKey = parseKey(key);
				if (resultMap.containsKey(resultKey)
						&& StringHelper.isNotEmpty((String) resultMap
								.get(resultKey))) {

				} else {
					resultMap.put(resultKey, entry.getValue());
				}
			}
			result.add(resultMap);
		}
		return result;
	}

	/*
	 * 字符串转换，Comp_Id_ to compId
	 */
	public static String parseKey(String key) {
		String[] arr = key.split("_");
		String result = "";
		int index = 0;
		for (String string : arr) {
			if ((index++) == 0) {
				result += string.toLowerCase();
			} else {
				result += ((string.substring(0, 1).toUpperCase()) + (string
						.substring(1).toLowerCase()));
			}
		}
		return result;
	}
	
 
	/**
	 * @Description 字符串补0
	 * @param str 字符串
	 * @param count 字符总长度
	 * @return String
	 */
	public static String addZero(String str , int count){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < count - str.length(); i++) {
			sb.append("0");
		}
		sb.append(str);
		str = sb.toString();
		return str;
	}
	

	/**
	 * 判断输入字符串是否为科学计数法
	 * */
    public static boolean isENum(String input){
    	String regx = "^((-?\\d+.?\\d*)[Ee]{1}(-?\\d+))$";//科学计数法正则表达式
        Pattern pattern = Pattern.compile(regx);
    	return pattern.matcher(input).matches();
    }
    
    /**
	 * 去除数字里多余的0
	 * */
    public static String getPrettyNumber(Object number) {  
    	if(null!=number){
    		return BigDecimal.valueOf(Double.parseDouble(number.toString()))  
                    .stripTrailingZeros().toPlainString();
    	}else{
    		return "0";
    	}
          
    }
    
	/**
	 * 生成6位数验证码
	 * 
	 * @return
	 */
	public static String createCode() {
		Long xx = Math.round(Math.random() * 1000000);
		while (xx < 100000) {
			xx = Math.round(Math.random() * 1000000);
		}
		return String.valueOf(xx);
	}
	
	 /**
	 * 将时间类型转变为yyyyMMddHHmmss
	 * */
    public static String getCleanDateFormat(String date) {  
    	String dateFormat = "";
    	if(StringHelper.isNotEmpty(date)){
    		if(date.contains("/")){
    			date = date.replace("/", "");
    		}
    		if(date.contains("-")){
    			date = date.replace("-", "");
    		}
    		if(date.contains(":")){
    			date = date.replace(":", "");
    		}
    		if(date.contains(" ")){
    			date = date.replace(" ", "");
    		}
    		if(date.length()<14){
    			dateFormat = addZero(date, 14);
    		}else if(date.length()>14){
    			dateFormat = date.substring(0, 14);
    		}else dateFormat = date;
    	}else{
    		dateFormat=AppUtils.getCurrentDateString("yyyyMMddHHmmss");
    	}
    	return dateFormat;
    }
}
