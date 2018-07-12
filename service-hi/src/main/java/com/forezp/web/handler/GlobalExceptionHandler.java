package com.forezp.web.handler;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * GlobalExceptionHandler,According HttpServletRequest Content-Type choose error
 * message format(json/wup/error page)
 * 
 * @Note if HttpServletRequest.Content-Type value is blank,forward to error page
 * @author chenqi
 * @date 2017年1月5日 下午11:30:39
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);


	/**
	 * 异常
	 * 
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Object exception(HttpServletRequest req, HttpServletResponse resp, Exception e) {

		System.out.println("hello,world");

		return "Hello";

	}


}
