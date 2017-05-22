package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void test() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assertEquals(rates.size(), 5);
		
		
		
		assertEquals(rates.get(4).getdInterestRate(), 1.00,  0.03);
		assertEquals(rates.get(3).getdInterestRate(), 1.50, 0.03); 
		assertEquals(rates.get(2).getdInterestRate(), 2.00,  0.03); 
		assertEquals(rates.get(1).getdInterestRate(), 2.50,  0.03); 
		assertEquals(rates.get(0).getdInterestRate(), 3.00,  0.03); 

		}
	@Test
	public void test() {
	
		ArrayList <RateDomainModel> rate= RateDAL.getAllRates();
			System.out.println("Rate's size: "+ rate.size());
		assert(rate.size()>0);
	}
}
	
	