package com.cg.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.entity.Customer;
import com.cg.repository.CustomerRepository;

@Component
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer addCustomerService(Customer c) {
		Customer cust = customerRepository.save(c);
		return cust;
	}

	@Override
	public Customer updateCustomerService(int custId, Customer c) {
	
		Customer cust = customerRepository.findById(custId).get();
		if (cust != null) {
			cust.setCustName(c.getCustName());
			cust.setEmail(c.getEmail());
			cust.setCustomerType(c.getCustomerType());
			cust.setAddress(c.getAddress());
			customerRepository.save(cust);
		}
		return cust;
	}

	@Override
	public List<Customer> readAllCustomerService() {
		
		List<Customer> custList = new ArrayList<>();
		
		Iterable<Customer> customers = customerRepository.findAll();
		customers.forEach(c -> custList.add(c));
		
		return custList;
	}

	@Override
	public Customer getCustomerByIdService(int custId) {
		Customer cust = customerRepository.findById(custId).get();
		if (cust != null) {
			return cust;
		}
		return null;
	}

	@Override
	public Customer removeCustomerService(int custId) {
		Customer cust = customerRepository.findById(custId).get();
		if (cust != null) {
			customerRepository.delete(cust);
			return cust;
		}
		return null;
//		customerRepository.deleteById(custId);
	}

	@Override
	@Transactional
	public Customer updateEmailService(int custId, String newEmail) {
		int c = customerRepository.updateEmail(custId, newEmail);
		if (c > 0){
			return getCustomerByIdService(custId);
		}
		return null;
	}

	@Override
	public List<Customer> readAllCustomerByCityService(String cityName) {
		List<Customer> customers = customerRepository.filterCustomerByCity(cityName);
		return customers;
	}
	
//	@Override
//	public List<Customer> searchByType(String custType) {
//		return customerRepository.findByCustomerType(custType);
//	}

}
