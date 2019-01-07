package biz.ghs.imez.monitor.common.error;

public enum CommonErrorCode implements ErrorCode{
    BAD_REQUEST("CMN0N01-400"),
    FORBIDDEN("CMN0N02-403"),
    NOT_FOUND("CMN0N03-404"),
    METHOD_NOT_ALLOWED("CMN0N04-405"),
    NOT_ACCEPTABLE("CMN0N05-406"),
    REQUEST_TIMEOUT("CMN0N06-408"),
    CONFLICT("CMN0N07-409"),
    REQUEST_ENTITY_TOO_LONG("CMN0N08-413"),
    REQUEST_URI_TOO_LONG("CMN0N09-414"),
    UNSUPPORTED_MEDIA_TYPE("CMN0N10-415"),
    INTERNAL_SERVER_ERROR("CMN0N11-500");
	
	private String errorCode;
	
	CommonErrorCode(String errorCode){
		this.errorCode = errorCode;
	}
	
	@Override
	public String getErrorCode() {
		return errorCode;
	}
}
