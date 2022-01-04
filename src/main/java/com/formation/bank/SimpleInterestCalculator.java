package com.formation.bank;

public class SimpleInterestCalculator implements InterestCalculator {
	
	private double rate;

	@Override
	public void setRate(double rate) {
		this.rate=rate;

	}

	@Override
	public double calculate(double amount, double year) {
		if(amount<0||year <0) {
			throw new IllegalArgumentException("Montant et durée doivent être positifs");
		}
		if(amount<0||year <0) {
			throw new IllegalArgumentException("Montant et durée doivent être positifs");
		}
		
		return amount*year*rate;
	}

}
