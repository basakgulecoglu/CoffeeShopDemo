package coffeeShopDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
			
		baseCustomerManager.save(new Customer(1,"Ba�ak","G�le�o�lu",LocalDate.of(1999, 12, 4),"2565161556"));
		

		
	}

}
