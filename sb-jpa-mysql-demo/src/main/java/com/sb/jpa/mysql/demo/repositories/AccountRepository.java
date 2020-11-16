/**
 * 
 */
package com.sb.jpa.mysql.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.jpa.mysql.demo.model.Account;

/**
 * @author dorak
 *
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
