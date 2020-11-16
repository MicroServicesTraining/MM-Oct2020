/**
 * 
 */
package com.sb.jpa.mysql.demo.model;

import org.springframework.hateoas.RepresentationModel;

/**
 * @author dorak
 *
 */
public class Wish extends RepresentationModel<Wish> {
	
	private String wishMessage;

	
	/**
	 * @param wishMessage
	 */
	public Wish(String wishMessage) {
		this.wishMessage = wishMessage;
	}

	/**
	 * @return the wishMessage
	 */
	public String getWishMessage() {
		return wishMessage;
	}

	/**
	 * 
	 */
	public Wish() {
	}

	/**
	 * @param wishMessage the wishMessage to set
	 */
	public void setWishMessage(String wishMessage) {
		this.wishMessage = wishMessage;
	}
	
}

