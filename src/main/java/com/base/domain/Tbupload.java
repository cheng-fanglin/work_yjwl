package com.base.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import com.bstek.dorado.annotation.PropertyDef;

/**
 * tbupload:
 */
@Entity
@Table(name = "tbupload")
public class Tbupload implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * ID_:
	 */
	@PropertyDef(label = "ID_", description = "ID_:")
	private String id;

	/**
	 * USER_ID_:
	 */
	@PropertyDef(label = "USER_ID_", description = "USER_ID_:")
	private BigDecimal userId;

	/**
	 * 上传时间:上传时间
	 */
	@PropertyDef(label = "上传时间", description = "上传时间:上传时间")
	private Date uploadTime;

	/**
	 * 上传文件名称:上传文件名称
	 */
	@PropertyDef(label = "上传文件名称", description = "上传文件名称:上传文件名称")
	private String fileName;

	/**
	 * 上传文件路径:上传文件路径
	 */
	@PropertyDef(label = "上传文件路径", description = "上传文件路径:上传文件路径")
	private String filePath;

	public Tbupload() {
		super();
	}

	public Tbupload(String id, BigDecimal userId, Date uploadTime,
			String fileName, String filePath) {
		super();
		this.id = id;
		this.userId = userId;
		this.uploadTime = uploadTime;
		this.fileName = fileName;
		this.filePath = filePath;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Id
	@Column(name = "ID_", length = 50, nullable = false)
	public String getId() {
		return id;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	@Column(name = "USER_ID_")
	public BigDecimal getUserId() {
		return userId;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPLOAD_TIME_")
	public Date getUploadTime() {
		return uploadTime;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "FILE_NAME_", length = 100)
	public String getFileName() {
		return fileName;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name = "FILE_PATH_", length = 500)
	public String getFilePath() {
		return filePath;
	}

	public String toString() {
		return "Tbupload [id=" + id + ",userId=" + userId + ",uploadTime="
				+ uploadTime + ",fileName=" + fileName + ",filePath="
				+ filePath + "]";
	}

}
