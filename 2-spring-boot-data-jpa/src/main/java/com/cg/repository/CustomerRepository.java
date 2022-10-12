package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	@Query("select c from Customer c where c.address = :c")
	List<Customer> filterCustomerByCity(@Param("c") String city);
	
	@Query("update Customer c set c.email = :email where c.custId = :custId")
	@Modifying
	int updateEmail(@Param("custId") int custId, @Param("email") String newEmail);

//	List<Customer> findByCustomerType(String ctype);
//	Customer findByEmail(String ctype);
}
