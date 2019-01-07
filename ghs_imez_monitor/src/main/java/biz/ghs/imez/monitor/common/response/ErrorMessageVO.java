package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ErrorMessageVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1662626963399223114L;

	private String errCode;
	private String errMessage;
	private List<ConcurrentHashMap<String, String>> errDataList;
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMessage() {
		return errMessage;
	}
	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}
	public List<ConcurrentHashMap<String, String>> getErrDataList() {
		return errDataList;
	}
	public void setErrDataList(List<ConcurrentHashMap<String, String>> errDataList) {
		this.errDataList = errDataList;
	}
}
