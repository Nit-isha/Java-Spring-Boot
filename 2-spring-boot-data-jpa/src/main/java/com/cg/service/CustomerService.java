package com.cg.service;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.cg.entity.Customer;

public interface CustomerService {
	
	public Customer addCustomerService(@RequestBody Customer c);
	
	public Customer updateCustomerService(@PathVariable int custId, @RequestBody Customer c);
	
	public List<Customer> readAllCustomerService();
	
	public Customer getCustomerByIdService(@PathVariable int custId);
	
	public Customer removeCustomerService(@PathVariable int custId);
	
	public Customer updateEmailService(@PathVariable int custId, String newEmail);
	
	public List<Customer> readAllCustomerByCityService(String cityName);
	
//	public List<Customer> searchByType(String custType);
}
