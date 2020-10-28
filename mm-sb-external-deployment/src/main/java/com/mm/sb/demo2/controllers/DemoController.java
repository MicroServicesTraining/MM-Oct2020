/**
 * 
 */
package com.mm.sb.demo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("exdep")
public class DemoController {
	
	@GetMapping("startup")
	public String getStartupPage() {
		return "<h1>WELCOME</h1>";
	}
	
}
