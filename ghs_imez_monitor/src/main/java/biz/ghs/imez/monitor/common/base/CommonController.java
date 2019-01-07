package biz.ghs.imez.monitor.common.base;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;

import biz.ghs.imez.monitor.common.response.CommonResultDataVO;
import biz.ghs.imez.monitor.common.response.ResponseVO;

public abstract class CommonController {
	
	@Autowired
	@Qualifier("messageSource")
	private MessageSource messageSource; 
	
	protected String defaultPageViewSize;

	/**
	 * 성공 responseData 생성
	 */
	protected CommonResultDataVO getSuccessCode() {
		String resultStr = messageSource.getMessage("RESULT.OK", null, new Locale("ko"));
		CommonResultDataVO result = new CommonResultDataVO();
		result.setResult(resultStr);
		
		return result;
	}
	
	/**
	 * 실패 responseData 생성
	 */
	protected CommonResultDataVO getFailCode() {
		String resultStr = messageSource.getMessage("RESULT.FAIL", null, new Locale("ko"));
		CommonResultDataVO result = new CommonResultDataVO();
		result.setResult(resultStr);
		
		return result;
	}
	
	/**
	 * List 타입의 responseData 생성
	 * @param status
	 * @param resultDataList
	 * @return
	 */
	protected <T> ResponseVO<T> makeResponseData(HttpStatus status, List<T> resultDataList) {
		ResponseVO<T> response = new ResponseVO<T>();
		
		response.getHeader().setStatus(status.value());
		response.getBody().setDocCnt(resultDataList.size());
		response.getBody().setDocs(resultDataList);
		
		return response;
	}
	
	/**
	 * 단일 데이터(VO) 타입의 responseData 생성
	 * @param status
	 * @param resultData
	 * @return
	 */
	protected <T> ResponseVO<T> makeResponseData(HttpStatus status, T resultData) {
		ResponseVO<T> response = new ResponseVO<T>();
		response.getHeader().setStatus(status.value());
		response.getBody().setDocCnt(1);
		response.getBody().setDoc(resultData);
		
		return response;
	}
	
	/**
	 * List타입 + 페이징 처리된 responseData 생성
	 * @param status
	 * @param resultDataList
	 * @param currentPageNum
	 * @param pageViewSize
	 * @param totalCount
	 * @return
	 */
//	protected <T> ResponseVO<T> makeResponseData(HttpStatus status, List<T> resultDataList, int currentPageNum, int pageViewSize, int totalCount) {
//		ResponseVO<T> response = this.makeResponseData(status, resultDataList);
//		ResponsePaginationBodyVO<T> body = new ResponsePaginationBodyVO<T>();
//		
//		PaginationVO pagination = new PaginationVO();
//		
//		pagination.setTotalCount(totalCount);
//		pagination.setCurrentPageNum(currentPageNum);
//		pagination.setPageViewSize(pageViewSize == 0 ? Integer.parseInt(defaultPageViewSize) : pageViewSize);
//		
//		body.setPagination(pagination);
//		body.setBody(response.getBody());
//		
//		response.setBody(body);
//		
//		return response;
//	}
}
