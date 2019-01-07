package biz.ghs.imez.monitor.common.error;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CommonException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7588307768785104924L;

	private ErrorCode errorCode;
	private Object[] errorParams;
	private String message;
	private List<ConcurrentHashMap<String, String>> errDataList;

	public CommonException(ErrorCode errorCode) {
		super();
		
		this.errorCode = errorCode;
	}
	
	public CommonException(Throwable e) {
		super(e);
		
		if(e instanceof CommonException) {
			CommonException exception = (CommonException) e;
			
			this.errorCode = exception.getErrorCode();
			this.message = exception.getMessage();
			this.errorParams = exception.getErrorParams();
			this.errDataList = exception.getErrDataList();
		}
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ConcurrentHashMap<String, String>> getErrDataList() {
		return errDataList;
	}
	public void setErrDataList(List<ConcurrentHashMap<String, String>> errDataList) {
		this.errDataList = errDataList;
	}
	public ErrorCode getErrorCode() {
		return errorCode;
	}
	public Object[] getErrorParams() {
		return errorParams;
	}
	
}
