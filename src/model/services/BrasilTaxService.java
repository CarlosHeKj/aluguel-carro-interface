package model.services;

public class BrasilTaxService {
	
	public double tax(double amount) {
	amount = (amount <= 100.0 ?  amount *  0.2 :  amount * 0.15);
	return amount;
	}
}
