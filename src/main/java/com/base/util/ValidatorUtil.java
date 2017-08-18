package com.base.util;

/**
 * 验证工具类
 * @date 2014-12-29
 * @author xuJie
 */
public class ValidatorUtil {
	
	/**
	 * 校验会员用户名，必须只能包含字母和数字
	 * @param memberName
	 * @return
	 */
	public static boolean checkMemberName(String memberName) {
		if(isEmpty(memberName)) {
			if(memberName.matches("^[a-zA-Z0-9]*(([a-zA-Z]+[0-9]+)|([0-9]+[a-zA-Z]+))[a-zA-Z0-9]*$")) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * 方法描述：校验会员用户名，必须只能包含字母和数字,手机号，邮箱
	 * @date 2015-2-5 上午9:31:34
	 * @author  cg
	 * @param memberName
	 * @return boolean
	 */
	public static boolean checkMemberName1(String memberName) {
		if(isEmpty(memberName)) {
			if(memberName.matches("^[a-zA-Z0-9]*(([a-zA-Z]+[0-9]+)|([0-9]+[a-zA-Z]+))[a-zA-Z0-9]*$")||memberName.matches("^1[3-8]+\\d{9}$") || memberName.matches("^(([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.[a-zA-Z0-9_-])")) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 非空校验
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(null==str || "".equals(str)) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * 校验字符串长度
	 * @param str
	 * @param min
	 * @param max
	 * @return
	 */
	public static boolean checkLength(String str,int min, int max) {
		if(isEmpty(str)) {
			if(str.length()>=min && str.length()<=max) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 校验身份证
	 * @param cardId
	 * @return
	 */
	public static boolean checkCardId(String cardId) {
		if(isEmpty(cardId)) {
			if(cardId.matches("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)")) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 验证车牌号
	 * @date 2015-1-4 下午2:42:28
	 * @author lulu
	 * @param plateNumber 车牌号
	 * @return boolean
	 */
	public static boolean checkPlateNumber(String plateNumber){
		if(isEmpty(plateNumber)){
			if(plateNumber.matches("^[\u4e00-\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{4}[\u4e00-\u9fa5]{1}$")||plateNumber.matches("^[\u4e00-\u9fa5]{1}[A-Z]{1}[A-Z_0-9]{5}$")){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断是否为数字字符串
	 * @param numberStr
	 * @return
	 */
	public static boolean isNumberStr(String numberStr) {
		if(isEmpty(numberStr)) {
			if(numberStr.matches("(\\d*)(\\.\\d+)?")) {
				return true;
			}
		}
		
		return false;
	}
	/**
	 * 判断载重 number(12,3)
	 * @param numberStr
	 * @return
	 */
	public static boolean checkWeight(String numberStr) {
		if(isEmpty(numberStr)) {
			if(numberStr.matches("(\\d{1,9})(\\.\\d{0,3})?")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 判断长度 number(10,2)
	 * @param numberStr
	 * @return
	 */
	public static boolean checkLength(String numberStr) {
		if(isEmpty(numberStr)) {
			if(numberStr.matches("(\\d{1,8})(\\.\\d{0,2})?")) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 判断是否为金额数字字符串
	 * 0~9999999999.99
	 * @param numberStr
	 * @return
	 */
	public static boolean isMoneyNumberStr(String numberStr) {
		if(isEmpty(numberStr)) {
			if(numberStr.matches("(\\d{1,10})(\\.\\d{1,2})?")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 判断是否为数字字符串
	 * @param numberStr
	 * @return
	 */
	public static boolean isLongStr(String longStr) {
		if(isEmpty(longStr)) {
			if(longStr.matches("\\d*")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 检验手机号
	 * @param mobilephoneNumber
	 * @return
	 */
	public static boolean checkMobilephoneNumber(String mobilephoneNumber) {
		if(isEmpty(mobilephoneNumber)) {
			if(mobilephoneNumber.matches("^1[3-8]+\\d{9}$")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 校验电话号码
	 * @param phoneNumber
	 * @return
	 */
	public static boolean checkPhoneNumber(String phoneNumber) {
		if(isEmpty(phoneNumber)) {
			if(phoneNumber.matches("^((0\\d{2,3})-)(\\d{7,8})(-(\\d{3,}))?$")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 检验邮箱地址
	 * @param emailAddr
	 * @return
	 */
	public static boolean checkEmailAddress(String emailAddr) {
		if(isEmpty(emailAddr)) {
			if(emailAddr.matches("^(([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.[a-zA-Z0-9_-])")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 校验日期（yyyy-MM-dd）
	 * @param dateStr
	 * @return
	 */
	public static boolean checkDate(String dateStr) {
		if(isEmpty(dateStr)) {
			if(dateStr.matches("^[0-9]{4}-[0-1]?[0-9]{1}-[0-3]?[0-9]{1}$")) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * 校验中文（简/繁）
	 * @param chStr
	 * @return
	 */
	public static boolean checkChinese(String chStr) {
		if(isEmpty(chStr)) {
			if(chStr.matches("[\u4e00-\u9fff]*")) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 检验Long数值的大小
	 * @param value Long数值对象
	 * @param minValue 最小值，可为空
	 * @param maxValue 最大值，可为空
	 * @return false-不符合最值要求/true-符合最值要求
	 */
	public static boolean checkValueOfLong(Long value,Integer minValue,Integer maxValue){
		boolean flag = false ;
		if(null != minValue){
			if(value>minValue){
				flag = true ;
			}else{
				flag = false ;
			}
		}
		if(null != maxValue){
			if(value<=maxValue){
				flag = true ;
			}else{
				flag = false ;
			}
		}	
		return flag ;
	}
	/**
	 * 检验double数值的大小
	 * @param value Long数值对象
	 * @param minValue 最小值，可为空
	 * @param maxValue 最大值，可为空
	 * @return false-不符合最值要求/true-符合最值要求
	 */
	public static boolean checkValueOfDouble(Double value,Double minValue,Double maxValue){
		boolean flag = false ;
		if(null != minValue){
			if(value>=minValue){
				flag = true ;
			}else{
				flag = false ;
			}
		}
		if(null != maxValue){
			if(value<=maxValue){
				flag = true ;
			}else{
				flag = false ;
			}
		}	
		return flag ;
	}
	
	/**
	 * 检验图片后缀名,常用后缀名-png,jepg,jpg,bmp
	 * @param fileName 含后缀名的文件名
	 * @return
	 */
	public static boolean checkPicFormat(String fileName){
		String fileNameLowerCase = fileName.toLowerCase() ;
		if(fileNameLowerCase.endsWith(".png") 
				|| fileNameLowerCase.endsWith(".jpg") 
				|| fileNameLowerCase.endsWith(".gif") 
				|| fileNameLowerCase.endsWith(".jepg")
				|| fileNameLowerCase.endsWith(".bmp")
				|| fileNameLowerCase.endsWith(".jpeg")){
			return true ;
		}else{
			return false ;
		}
	}
	
	/**
	 * 对字符串进行非法字符与敏感词的过滤
	 * @param str
	 * @return
	 */
	public static String charactorFilter(String str){
		if(isEmpty(str)){
			str = str.replaceAll("\\||\\$|%|\\^|&|\\*|--|\\'|#", " ");
		}
		return str ;
	}
	
	/**
	 * 对字符串进行非法字符与敏感词的过滤
	 * @param str
	 * @return
	 */
	public static String[] charactorFilter(String[] str){
		for (int i = 0,length = str.length; i < length; i++) {
			if(isEmpty(str[i])){
				str[i] = str[i].replaceAll("\\||\\$|%|\\^|&|\\*|--|\\'|#", " ");
			}
		}
		return str ;
	}
}
