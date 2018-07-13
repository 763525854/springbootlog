/**
 *  Created by weiping.gong on 2018年7月13日
 */
package springbootlog.controller;

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
		logger.info("haha,i am info");
		return "hello";
	}
}
