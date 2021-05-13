package coffeeShopDemo;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kspPublicSoapProxy = new KPSPublicSoapProxy();
		boolean r= false;
		
		try {
			r = kspPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBornDate().getYear());
		}
		catch (Exception e) {
			System.out.println("Not a valid natioanlity id.");
		}
		
		return r;
	}
	

}
