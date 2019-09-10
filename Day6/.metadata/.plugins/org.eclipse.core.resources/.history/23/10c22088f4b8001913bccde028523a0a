package com.hcl.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer>lstcustomer=null; 
	static {
		lstcustomer=new ArrayList<Customer>();
	}
	public String addCustomerDao(Customer customer){
		lstcustomer.add(customer);
		return "customer added successfully";
		
	}
	public List<Customer> showcustomer(){
		return lstcustomer;
	}
	public Customer searchCustomerDao(int custId){
		Customer objcustomer=null;
		for (Customer customer: lstcustomer) {
			if(customer.getCustId()==custId){
				objcustomer=customer;
			}
		}
		return objcustomer;		
	}
	public String deleteCustomerDao(int custId){
		Customer customer=searchCustomerDao(custId);
		if(customer!=null){
			lstcustomer.remove(customer);
			return "customer removed";
		}else {
			return "customer not found";
		}
		
	}
	public String updateCustomerDao(Customer objcustomer){
		Customer customer=searchCustomerDao(objcustomer.getCustId());
		if(customer!=null){
			for (Customer c : lstcustomer) {
				if(c.getCustId()==objcustomer.getCustId()){
					c.setCustName(objcustomer.getCustName());
					c.setAnnualPremium(objcustomer.getAnnualPremium());
					c.setModalPremium(objcustomer.getModalPremium());
					c.setPaymentMode(objcustomer.getPaymentMode());					
				}
				
			}
		return "customer updated";
		}else{
			return "not found";
		}
	}
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fout);
			obj.writeObject(lstcustomer);
			obj.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/customer.txt");
			ObjectInputStream obj=new ObjectInputStream(fin);
			lstcustomer =(List<Customer>)obj.readObject();
			obj.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

