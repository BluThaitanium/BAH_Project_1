package com.bah.data.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.data.repositories.CustomersRepository;
import com.bah.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerApi {
	
	@Autowired
	CustomersRepository repo;
	
	@GetMapping
	public Iterable<Customer> getAll() {
		//  Workshop:  Write an implementation that replies with all customers.
		//  Your implementation should be no more than a few lines, at most, and make use of the 'repo' object
		return null;   
	}

	@GetMapping("/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable("customerId") long id) {
		//  Workshop:  Write an implementation that looks up one customer.  What do you return if the requested 
		//  customer ID does not exists?  This implementation could be as short as a single line.
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer newCustomer, UriComponentsBuilder uri) {
		//  Workshop:  Write an implementation that adds a new customer.  Your
		//  implementation should check to make sure that the name and email fields are
		//  not null and that no id was passed (it will be auto generated when the record
		//  is inserted.  Remember REST semantics - return a reference to the newly created 
		//  entity as a URI.
		return null;
	}

	//lookupCustomerByName GET
	@GetMapping("/byname/{username}")
	public ResponseEntity<?> lookupCustomerByNameGet(@PathVariable("username") String username,
			UriComponentsBuilder uri) {
		//  Workshop:  Write an implementation to look up a customer by name.  Think about what
		//  your response should be if no customer matches the name the caller is searching for.
		//  With the data model implemented in CustomersRepository, do you need to handle more than
		//  one match per request?
		return null;
	}
	
	//lookupCustomerByName POST
	@PostMapping("/byname")
	public ResponseEntity<?> lookupCustomerByNamePost(@RequestBody String username, UriComponentsBuilder uri) {
		//  Workshop:  Write an implementation to look up a customer by name, using POST semantics
		//  rather than GET.  You should be able to make use of most of your implmentation for
		//  lookupCustomerByNameGet().  
		return null;
	}	
	
	
	@PutMapping("/{customerId}")
	public ResponseEntity<?> putCustomer(
			@RequestBody Customer newCustomer,
			@PathVariable("customerId") long customerId) 
	{
		//  Workshop:  Write an implementation to update or create a new customer with an HTTP PUT, with the 
		//  requestor specifying the customer ID.  Are there error conditions to be handled?  How much data
		//  validation should you implement considering that customers are stored in a CustomersRepository object.
		return null;
	}	
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<?> deleteCustomerById(@PathVariable("customerId") long id) {
		//  Implement a method to delete a customer.  What is an appropriate response? 
		//
		//  For discussion (do not worry about implementation):  What are some ways of handling 
		//  a "delete"?  Is it always the right thing from a business point of view to literally 
		//  delete a customer entry?  If you did actually delete a customer entry, are there issues
		//  you could potentially run into later? 
		return null;
	}	

/*	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerApi() {
		Customer c1 = new Customer(1, "Austin", "pass", "austin@bah.com");
		Customer c2 = new Customer(2, "Michael", "pass", "michael@bah.com");
		Customer c3 = new Customer(3, "Timothy", "pass", "timothy@bah.com");
		Customer c4 = new Customer(4, "Chris", "pass", "chris@bah.com");
		Customer c5 = new Customer(5, "Corey", "pass", "corey@bah.com");
		Customer c6 = new Customer(6, "Jay", "pass", "jay@bah.com");
		Customer c7 = new Customer(7, "Phu", "pass", "Phu@bah.com");
		Customer c8 = new Customer(8, "Dipendra", "pass", "dipendra@bah.com");
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		customerList.add(c8);
	}
	
	@GetMapping
	public Collection<Customer> getAll(){
		return this.customerList;
	}
	
	@GetMapping("/{customerID}")
	public Customer getCustomerByID(@PathVariable("customerID") long id) {
		for (Customer c : customerList) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
*/
}
