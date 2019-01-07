package biz.ghs.imez.monitor.common.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseBodyVO<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1346257623957672823L;

	private int docCnt = 0;
	
	private List<T> docs = new ArrayList<T>();

	public int getDocCnt() {
		return docCnt;
	}

	public void setDocCnt(int docCnt) {
		this.docCnt = docCnt;
	}

	public List<T> getDocs() {
		return docs;
	}

	public void setDocs(List<T> docs) {
		this.docs = docs;
	}
	
	public void setDoc(T doc) {
		this.docs.add(doc);
	}
}
