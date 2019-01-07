package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;

public class ResponseVO<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3962509028498195786L;
	
	private ResponseHeaderVO header = new ResponseHeaderVO();
	private ResponseBodyVO<T> body = new ResponseBodyVO<T>();
	
	public ResponseHeaderVO getHeader() {
		return header;
	}
	public void setHeader(ResponseHeaderVO header) {
		this.header = header;
	}
	public ResponseBodyVO<T> getBody() {
		return body;
	}
	public void setBody(ResponseBodyVO<T> body) {
		this.body = body;
	}

}
