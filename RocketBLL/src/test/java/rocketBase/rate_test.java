package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	
	@Test
	public void Interest_rate_test() throws RateException {
		assertEquals(RateBLL.getRate(600), 8, 0.01);
		assertEquals(RateBLL.getRate(675), 7, 0.01);
		assertEquals(RateBLL.getRate(750), 6.5, 0.01);
		assertEquals(RateBLL.getRate(795), 6, 0.01);
		assertEquals(RateBLL.getRate(810), 5.7, 0.01);
	}
	
	
	@Test (expected = RateException.class)
	public void Interest_rate_test2() throws RateException {
		RateBLL.getRate(500);
	}

}