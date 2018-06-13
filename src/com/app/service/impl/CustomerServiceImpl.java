package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;



@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerDao dao;
	
	
	@Override
	public int saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}
	
	@Override
	public Customer getCustByUserName(String cust) {
		return dao.getCustByUserName(cust);
	}
	
}
