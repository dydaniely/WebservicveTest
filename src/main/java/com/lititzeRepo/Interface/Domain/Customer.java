package com.lititzeRepo.Interface.Domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    private int customerId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String mobilePhone;
    private String businessPhone;
    private String email;
    private String preference;/* TODO * this should be Object, include  Notification */
    /* Todo Languge  , it is periodicall , Invoice Delivery Method  a customer may want to get notified by email and he may change the next month, the  effect wil be*/
    /* Todo extmonth becouse the notification status will be captured in preference table */

    @OneToMany(mappedBy = "customer")
    private List<Account> accountList;

    public Customer() {
    }

    public Customer(int customerId, String firstName, String lastName, String mobilePhone, String businessPhone, String email   ) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.businessPhone=businessPhone;
        this.email = email;

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

}
