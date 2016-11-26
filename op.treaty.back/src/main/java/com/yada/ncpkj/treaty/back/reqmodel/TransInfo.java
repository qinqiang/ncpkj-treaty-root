package com.yada.ncpkj.treaty.back.reqmodel;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 消费请求信息
 * 
 * @author Administrator
 *
 */
@XmlRootElement
public class TransInfo {

	private String pid;// 平台业务号
	private String merId;// 商户代码
	private String termId;// 终端号
	private String orderId;// 商户订单号
	private String txnTime;// 订单发送时间
	private String txnAmt;// 现金支付金额
	private String txnType;// 交易类型
	private String txnSubType;// 交易子类型
	private String jfNum; // 扣减积分数
	private String ccyCode; // 交易币种
	private String planId; // 分期计划
	private String planNum; // 分期期数
	private String cardNo;// 交易卡号
	private String password;// 密码
	private String cvn2;// CVN2
	private String cardExpire;// 卡有效期
	private String credentialType;// 证件类型
	private String credentialNo;// 证件号
	private String credentialName;// 姓名
	private String mobileNo;// 银行预留手机号
	private String smsAuthCode;// 短信验证码
	private String merNameExt; // 二级商户名称

	private String origQryId; // 原始交易流水号
	
	private String jfAmt; // 积分抵扣金额
	private String payMap; // 支付位图


	private String mac; // MAC

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

	public String getMerNameExt() {
		return merNameExt;
	}

	@XmlElement
	public void setMerNameExt(String merNameExt) {
		try {
			if(merNameExt != null)
			this.merNameExt = URLDecoder.decode(merNameExt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			this.merNameExt = merNameExt;
		}
	}

	public String getOrigQryId() {
		return origQryId;
	}

	@XmlElement
	public void setOrigQryId(String origQryId) {
		this.origQryId = origQryId;
	}

	public String getPlanId() {
		return planId;
	}

	@XmlElement
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getMac() {
		return mac;
	}

	@XmlElement
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public String getJfNum() {
		return jfNum;
	}

	public void setJfNum(String jfNum) {
		this.jfNum = jfNum;
	}

	public String getCcyCode() {
		return ccyCode;
	}

	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}

	public String getPlanNum() {
		return planNum;
	}

	public void setPlanNum(String planNum) {
		this.planNum = planNum;
	}

	public String getJfAmt() {
		return jfAmt;
	}

	public void setJfAmt(String jfAmt) {
		this.jfAmt = jfAmt;
	}

	public String getPayMap() {
		return payMap;
	}

	public void setPayMap(String payMap) {
		this.payMap = payMap;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransInfo [pid=");
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
		builder.append(", jfNum=");
		builder.append(jfNum);
		builder.append(", ccyCode=");
		builder.append(ccyCode);
		builder.append(", planId=");
		builder.append(planId);
		builder.append(", planNum=");
		builder.append(planNum);
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
		builder.append(", merNameExt=");
		builder.append(merNameExt);
		builder.append(", origQryId=");
		builder.append(origQryId);
		builder.append(", jfAmt=");
		builder.append(jfAmt);
		builder.append(", payMap=");
		builder.append(payMap);
		builder.append(", mac=");
		builder.append(mac);
		builder.append("]");
		return builder.toString();
	}
}
