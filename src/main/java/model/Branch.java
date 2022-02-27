package model;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch() {
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();

    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transactionAmount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            /*
            refactor this code:
             (this.customers.get(i).getName().equals(customerName)) {

                return this.customers.get(i);
            }              */
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
