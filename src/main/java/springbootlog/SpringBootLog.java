/**
 *  Created by weiping.gong on 2018年7月13日
 */
package springbootlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: weiping.gong
 * @Description: 
 * @Date: created in 2018年7月13日
 */
@SpringBootApplication(scanBasePackages = "springbootlog")
public class SpringBootLog {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog.class, args);
	}
}
