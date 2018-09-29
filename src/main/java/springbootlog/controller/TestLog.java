/**
 *  Created by weiping.gong on 2018年7月13日
 */
package springbootlog.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weiping.gong
 * @Description:
 * @Date: created in 2018年7月13日
 */
@RestController
@RequestMapping("/testLog")
public class TestLog {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(TestLog.class);

	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public String hello(@RequestBody String param1) {
		logger.debug("haha,i am debug");
		boolean b = true;
		while (b) {
			logger.info("haha,i am info asdfasdfsdfasdfasdfsadfas");
		}
		return "hello";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		logger.info(request.getParameter("name"));
		String name=request.getParameter("name");
		logger.debug("haha,i am debug");
		System.out.println(name);
		return "hello";
	}
}
