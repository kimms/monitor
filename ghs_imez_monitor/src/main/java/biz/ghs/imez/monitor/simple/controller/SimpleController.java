package biz.ghs.imez.monitor.simple.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import biz.ghs.imez.monitor.common.base.CommonController;
import biz.ghs.imez.monitor.common.response.CommonResultDataVO;
import biz.ghs.imez.monitor.common.response.ResponseVO;

@RestController
public class SimpleController extends CommonController{

	@RequestMapping(value = "/getSimple", method = RequestMethod.GET)
	public ResponseVO<CommonResultDataVO> getSimple() {
		boolean result = true;
		
		return super.makeResponseData(HttpStatus.OK, result ? super.getSuccessCode() : super.getFailCode());
	}
}
