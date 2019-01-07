package biz.ghs.imez.monitor.common.error.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import biz.ghs.imez.monitor.common.error.CommonErrorCode;
import biz.ghs.imez.monitor.common.error.CommonException;

@Controller
public class ErrorController {
	
	@RequestMapping(value = "/error/400", produces = {"application/json"})
	public void badRequest() {
		throw new CommonException(CommonErrorCode.BAD_REQUEST);
	}
	@RequestMapping(value = "/error/403", produces = {"application/json"})
	public void forbidden() {
		throw new CommonException(CommonErrorCode.FORBIDDEN);
	}
//	@RequestMapping(value = "/error/404", produces = {"application/json"})
//	public void notFound() {
//		throw new CommonException(CommonErrorCode.NOT_FOUND);
//	}
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such 404")
	public void notFound() {
		throw new CommonException(CommonErrorCode.NOT_FOUND);
	}
	@RequestMapping(value = "/error/405", produces = {"application/json"})
	public void methodNotAllowed() {
		throw new CommonException(CommonErrorCode.METHOD_NOT_ALLOWED);
	}
	@RequestMapping(value = "/error/406", produces = {"application/json"})
	public void notAcceptable() {
		throw new CommonException(CommonErrorCode.NOT_ACCEPTABLE);
	}
	@RequestMapping(value = "/error/408", produces = {"application/json"})
	public void requestTimeout() {
		throw new CommonException(CommonErrorCode.REQUEST_TIMEOUT);
	}
	@RequestMapping(value = "/error/409", produces = {"application/json"})
	public void conflict() {
		throw new CommonException(CommonErrorCode.CONFLICT);
	}
	@RequestMapping(value = "/error/413", produces = {"application/json"})
	public void requestEntityTooLong() {
		throw new CommonException(CommonErrorCode.REQUEST_ENTITY_TOO_LONG);
	}
	@RequestMapping(value = "/error/414", produces = {"application/json"})
	public void requestUriTooLong() {
		throw new CommonException(CommonErrorCode.REQUEST_URI_TOO_LONG);
	}
	@RequestMapping(value = "/error/415", produces = {"application/json"})
	public void unSupportedMediaType() {
		throw new CommonException(CommonErrorCode.UNSUPPORTED_MEDIA_TYPE);
	}
	@RequestMapping(value = "/error/500", produces = {"application/json"})
	public void internalServerError() {
		throw new CommonException(CommonErrorCode.INTERNAL_SERVER_ERROR);
	}
	@RequestMapping(value = "/error", produces = {"application/json"})
	public void etcError() {
		throw new CommonException(CommonErrorCode.FORBIDDEN);
	}
}