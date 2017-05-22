package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import rocketDomain.RateDomainModel;

public class rate_test {

	@Test
	public void Rate_test() {
		ArrayList <RateDomainModel> allRates= RateDAL.getAllRates();
			System.out.println("Rate's size: "+ allRates.size());
		assert(allRates.size()>0);
		
		assertEquals(allRates.get(0).getdInterestRate(), 1.00, 0.03);
		assertEquals(allRates.get(1).getdInterestRate(), 1.50,  0.03);
		assertEquals(allRates.get(2).getdInterestRate(), 2.00,  0.03);
		assertEquals(allRates.get(3).getdInterestRate(), 2.50, 0.03);
		assertEquals(allRates.get(4).getdInterestRate(), 3.00,  0.03);	
		
	}
	@Test
	public void test() {
		
		ArrayList <RateDomainModel> rate= RateDAL.getAllRates();
			System.out.println("Rate's size: "+ rate.size());
		assert(rate.size()>0);
	}
}