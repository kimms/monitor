package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;

public class ErrorResponseBodyVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -288661227221799717L;

	private ErrorMessageVO docs = new ErrorMessageVO();

	public ErrorMessageVO getDocs() {
		return docs;
	}

	public void setDocs(ErrorMessageVO docs) {
		this.docs = docs;
	}
}
