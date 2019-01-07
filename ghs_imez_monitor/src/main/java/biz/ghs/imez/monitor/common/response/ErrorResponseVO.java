package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;

public class ErrorResponseVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1459151323691193884L;

	private ResponseHeaderVO header = new ResponseHeaderVO();
	private ErrorResponseBodyVO body = new ErrorResponseBodyVO();
	public ResponseHeaderVO getHeader() {
		return header;
	}
	public void setHeader(ResponseHeaderVO header) {
		this.header = header;
	}
	public ErrorResponseBodyVO getBody() {
		return body;
	}
	public void setBody(ErrorResponseBodyVO body) {
		this.body = body;
	}
}
