package biz.ghs.imez.monitor.common.response;

public class ResponsePaginationBodyVO<T> extends ResponseBodyVO<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5328599410700986008L;

	public void setBody(ResponseBodyVO<T> body) {
		super.setDocCnt(body.getDocCnt());
		super.setDocs(body.getDocs());
	}
}
