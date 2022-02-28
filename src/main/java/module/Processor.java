package module;

import model.Bank;

public class Processor {

    public void run() {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomer("Adelaide", "Tim", 199.09);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "Chad", 50.05);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 4.56);
        bank.addCustomerTransaction("Adelaide", "Mike", 12.11);
        bank.addCustomerTransaction("Sydney", "Chad", 21.09);

        bank.listCustomers("Adelaide", false);
        bank.listCustomers("Sydney", true);

        System.out.println("Showing detailed info for Adelaide: ");
        bank.listCustomers("Adelaide", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error! Melbourne branch does not exist!");
        }

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error! Melbourne branch does not exist!");
        } else {
            System.out.println("Branch found, customer added!");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists!");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 124.04)) {
            System.out.println("Customer does not exist at branch!");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists!");
        }
    }
}
