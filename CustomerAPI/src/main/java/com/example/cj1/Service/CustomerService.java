package com.example.cj1.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cj1.CustomerDTO.CustomerDTO;
import com.example.cj1.CustomerDTO.LoanDTO;
import com.example.cj1.Repository.MyRepositiory;
import com.example.cj1.Response.ReponseValueObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CustomerService {
 
	@Autowired
	MyRepositiory repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ReponseValueObject respValObj;
	
	
	public CustomerDTO saveCustomer(CustomerDTO dto) {
		return repo.save(dto);
	}
	public CustomerDTO getCustomerById(int id) {
	    return repo.findById(id).orElse(null);		
	}
	public CustomerDTO deleteCustomer(int id) {
	 CustomerDTO deleteById = repo.findById(id).orElse(null);
	    repo.delete(deleteById);
	    return deleteById;
	}
	
	@HystrixCommand(fallbackMethod = "handleLoanApi")
	public ReponseValueObject fetchUserLoanById(int loanid) {
		System.out.println("fetchUserLoanById");
		CustomerDTO userDto = repo.findById(loanid).orElse(null);
		LoanDTO loanDTO = restTemplate.getForObject("http://LOAN-SERVICE/api/Loan/fetchLoanById/"+ userDto.getLoanid(),LoanDTO.class);
		System.out.println("loanDto");
		respValObj.setLoan(loanDTO);
		respValObj.setUser(userDto);
		return respValObj;
	}	
	public  ReponseValueObject handleLoanApi(int loanid) {
		System.out.println("handleLoanApi");
		CustomerDTO userDto = repo.findById(loanid).orElse(null);
		respValObj.setUser(userDto);
		return respValObj;
	}
}

 