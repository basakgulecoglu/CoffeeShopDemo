package coffeeShopDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
			
		baseCustomerManager.save(new Customer(1,"Baþak","Güleçoðlu",LocalDate.of(1999, 12, 4),"2565161556"));
		

		
	}

}
