/**
 * 
 */
package com.mm.sb.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author dorak
 *
 */
@SpringBootApplication
public class ExternalDeploymentDemo extends SpringBootServletInitializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ExternalDeploymentDemo.class, args);
	}

}
