package com.yada.ncpkj.treaty.back.reqmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 非消费请求信息
 * 
 * @author liang.zhao
 * 
 */
@XmlRootElement
public class QueryInfo {

	// 平台业务号
	private String pid;
	// 商户代码
	private String merId;
	// 终端号
	private String termId;
	// 商户订单号
	private String orderId;
	// 订单发送时间
	private String txnTime;
	// 交易金额
	private String txnAmt;
	// 交易类型
	private String txnType;
	// 交易子类型
	private String txnSubType;
	// 原始交易流水号
	private String origQryId;
	// 交易卡号
	private String cardNo;
	// 密码
	private String password;
	// CVN2
	private String cvn2;
	// 卡有效期
	private String cardExpire;
	// 证件类型
	private String credentialType;
	// 证件号
	private String credentialNo;
	// 姓名
	private String credentialName;
	// 银行预留手机号
	private String mobileNo;
	// 短信验证码
	private String smsAuthCode;

	// MAC值
	private String mac;

	public String getPid() {
		return pid;
	}

	@XmlElement
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getMerId() {
		return merId;
	}

	@XmlElement
	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getOrderId() {
		return orderId;
	}

	public String getTermId() {
		return termId;
	}

	@XmlElement
	public void setTermId(String termId) {
		this.termId = termId;
	}

	@XmlElement
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTxnTime() {
		return txnTime;
	}

	@XmlElement
	public void setTxnTime(String txnTime) {
		this.txnTime = txnTime;
	}

	public String getTxnAmt() {
		return txnAmt;
	}

	@XmlElement
	public void setTxnAmt(String txnAmt) {
		this.txnAmt = txnAmt;
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

	public String getOrigQryId() {
		return origQryId;
	}

	@XmlElement
	public void setOrigQryId(String origQryId) {
		this.origQryId = origQryId;
	}

	public String getCardNo() {
		return cardNo;
	}

	@XmlElement
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPassword() {
		return password;
	}

	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCvn2() {
		return cvn2;
	}

	@XmlElement
	public void setCvn2(String cvn2) {
		this.cvn2 = cvn2;
	}

	public String getCardExpire() {
		return cardExpire;
	}

	@XmlElement
	public void setCardExpire(String cardExpire) {
		this.cardExpire = cardExpire;
	}

	public String getCredentialType() {
		return credentialType;
	}

	@XmlElement
	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getCredentialNo() {
		return credentialNo;
	}

	@XmlElement
	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
	}

	public String getCredentialName() {
		return credentialName;
	}

	@XmlElement
	public void setCredentialName(String credentialName) {
		 try {
			 if(credentialName != null)
			 this.credentialName = URLDecoder.decode(credentialName, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			this.credentialName = credentialName;
		}
	}

	public String getMobileNo() {
		return mobileNo;
	}

	@XmlElement
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSmsAuthCode() {
		return smsAuthCode;
	}

	@XmlElement
	public void setSmsAuthCode(String smsAuthCode) {
		this.smsAuthCode = smsAuthCode;
	}

	public String getMac() {
		return mac;
	}

	@XmlElement
	public void setMac(String mac) {
		this.mac = mac;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryInfo [pid=");
		builder.append(pid);
		builder.append(", merId=");
		builder.append(merId);
		builder.append(", termId=");
		builder.append(termId);
		builder.append(", orderId=");
		builder.append(orderId);
		builder.append(", txnTime=");
		builder.append(txnTime);
		builder.append(", txnAmt=");
		builder.append(txnAmt);
		builder.append(", txnType=");
		builder.append(txnType);
		builder.append(", txnSubType=");
		builder.append(txnSubType);
		builder.append(", origQryId=");
		builder.append(origQryId);
		builder.append(", cardNo=");
		builder.append(cardNo);
		builder.append(", password=");
		builder.append(password);
		builder.append(", credentialType=");
		builder.append(credentialType);
		builder.append(", credentialNo=");
		builder.append(credentialNo);
		builder.append(", credentialName=");
		builder.append(credentialName);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", smsAuthCode=");
		builder.append(smsAuthCode);
		builder.append(", mac=");
		builder.append(mac);
		builder.append("]");
		return builder.toString();
	}	
}
