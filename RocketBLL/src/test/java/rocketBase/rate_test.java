package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void test() throws RateException {
		double cs1 = RateBLL.getRate(601);
		double cs2 = RateBLL.getRate(651);
		double cs3 = RateBLL.getRate(701);
		double cs4 = RateBLL.getRate(751);
		double cs5 = RateBLL.getRate(801);
		assertEquals(cs1, 5, 0.01);
		assertEquals(cs2, 4.5, 0.01);
		assertEquals(cs3, 4, 0.01);
		assertEquals(cs4, 3.75, 0.01);
		assertEquals(cs5, 3.5, 0.01);
	}
	
	@Test(expected = RateException.class)
	public void rateexceptiontest() throws RateException {
		int cs = 300;
		RateBLL.getRate(cs);
	}
	
	@Test
	public void getPayment() {
		double r = .04;
		double pmt = RateBLL.getPayment(r, 360, 300000, 0.0, true);
		assertEquals(pmt, 1432.25, 0.01);
				
	}

}
