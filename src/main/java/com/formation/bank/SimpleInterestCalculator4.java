package com.formation.bank;

public class SimpleInterestCalculator4 implements InterestCalculator {

    private double rate;
    public String ratename;

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculate(double amount, double year) {
    	if(amount < 0 || year < 0) {
            throw new IllegalArgumentException(
                    "Le monmtant et la duree doivent etre positifs");
        }
    	
    	if(amount < 0 || year < 0) {
            throw new IllegalArgumentException(
                    "Le monmtant et la duree doivent etre positifs");
        }
    	
    	if(amount < 0 || year < 0) {
            throw new IllegalArgumentException(
                    "Le monmtant et la duree doivent etre positifs");
        }


        return amount * year * rate;
    }

}