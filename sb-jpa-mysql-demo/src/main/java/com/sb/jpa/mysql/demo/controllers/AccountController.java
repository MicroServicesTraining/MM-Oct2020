/**
 * 
 */
package com.sb.jpa.mysql.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.jpa.mysql.demo.model.Account;
import com.sb.jpa.mysql.demo.model.Wish;
import com.sb.jpa.mysql.demo.repositories.AccountRepository;

/**
 * @author dorak
 *
 */
@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;
	
	@Value("${app.user.name}")
	private String userName;

	@GetMapping("/message")
	public String showMessage() {
		return "Hello from AccountController";
	}

	@GetMapping("/accounts")
	public List<Account> findAllAccounts() {
		return accountRepository.findAll();
	}

	@RequestMapping("/wish")
	public HttpEntity<Wish> wish(@RequestParam(value = "name", defaultValue = "Sekhar") String name) {

		Wish wish = new Wish();
		wish.setWishMessage("Hello " + name +", User Name :: " + userName);
		wish.add(
				WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(AccountController.class).wish(name)).withSelfRel());
		return new ResponseEntity<>(wish, HttpStatus.OK);
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
