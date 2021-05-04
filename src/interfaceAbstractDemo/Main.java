package interfaceAbstractDemo;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "firstName", "LastName", "dataOfBirthYear", "getNationalityId"));

	}

}
