package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;

public class ResponseHeaderVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3775378862367436599L;

	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
