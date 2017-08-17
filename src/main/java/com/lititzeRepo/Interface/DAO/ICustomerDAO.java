package com.lititzeRepo.Interface.DAO;

import com.lititzeRepo.Interface.Domain.Customer;

import java.util.List;

public interface ICustomerDAO {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int customerId);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    boolean customerExists(String name, String zipCode);

}
