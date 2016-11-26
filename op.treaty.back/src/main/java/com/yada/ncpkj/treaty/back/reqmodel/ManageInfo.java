package com.yada.ncpkj.treaty.back.reqmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 管理类交易信息
 * 
 * @author ZL
 * 
 */
@XmlRootElement
public class ManageInfo {

	private String pid;
	private String txnType;
	private String txnSubType;
	private String checkValue;

	public String getPid() {
		return pid;
	}
	
	@XmlElement
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTxnType() {
		return txnType;
	}

	@XmlElement
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getTxnSubType() {
		return txnSubType;
	}

	@XmlElement
	public void setTxnSubType(String txnSubType) {
		this.txnSubType = txnSubType;
	}

	public String getCheckValue() {
		return checkValue;
	}

	@XmlElement
	public void setCheckValue(String checkValue) {
		this.checkValue = checkValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManageInfo [pid=");
		builder.append(pid);
		builder.append(", txnType=");
		builder.append(txnType);
		builder.append(", txnSubType=");
		builder.append(txnSubType);
		builder.append(", checkValue=");
		builder.append(checkValue);
		builder.append("]");
		return builder.toString();
	}
}
