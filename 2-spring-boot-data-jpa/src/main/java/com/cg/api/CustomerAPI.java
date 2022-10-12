package com.cg.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.EmailUpdateDto;
import com.cg.entity.Customer;
import com.cg.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer c){
		return new ResponseEntity<Customer>(customerService.addCustomerService(c), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{custId}", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int custId, @RequestBody Customer c){
		return new ResponseEntity<Customer>(customerService.updateCustomerService(custId, c), HttpStatus.OK);
	}
	
	@GetMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<List<Customer>> readAllCustomer(){
		return new ResponseEntity<List<Customer>>(customerService.readAllCustomerService(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{custId}", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int custId){
		return new ResponseEntity<Customer>(customerService.getCustomerByIdService(custId), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{custId}", produces = "application/json", consumes = "application/json")
	public ResponseEntity<Customer> removeCustomer(@PathVariable int custId){
		return new ResponseEntity<Customer>(customerService.removeCustomerService(custId), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Customer> updateEmail(@RequestBody EmailUpdateDto emailUpdateDto){
		Customer c = customerService.updateEmailService(emailUpdateDto.getCustId(), emailUpdateDto.getNewEmail());
		return new ResponseEntity<Customer>(c, HttpStatus.OK);
	}
	
	@GetMapping(value = "/search", produces = "application/json", consumes = "application/json")
	public ResponseEntity<List<Customer>> getCustomerById(@RequestParam("cname") String cityName){
		
		List<Customer> customers = customerService.readAllCustomerByCityService(cityName);
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		
//		http://localhost:9999/customers/search?cname=Mumbai --> @RequestParam
	}
	
//	@GetMapping(value = "/search/customerType",  produces = "application/json")
//		ResponseEntity<List<Customer>> searchByType(@RequestParam("ctype") String ctype){
//		List<Customer> customers = customerService.searchByType(ctype);
//		return new ResponseEntity<List<Customer>> (customers, HttpStatus.OK);
//	}
}
