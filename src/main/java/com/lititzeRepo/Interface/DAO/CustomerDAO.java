package com.lititzeRepo.Interface.DAO;

import com.lititzeRepo.Interface.Domain.Customer;

import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(int customerId) {

    }

    @Override
    public boolean customerExists(String name, String zipCode) {
        return false;
    }
}
