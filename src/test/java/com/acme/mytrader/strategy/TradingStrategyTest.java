package com.acme.mytrader.strategy;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TradingStrategyTest {
	TradingStrategy ts = new TradingStrategy(null, 0);

	   //test to check Security
	   @Test
	   public void testSecurity() {
		   ts.setSecurity("SSL-Security-Token-asjJkks244KmcwKJ");
		   ts.setPrice(25);
	     
	      assertNotEquals(ts.getSecurity(), "");
	   }

	   // test to check Price
	   @Test
	   public void testPrice() {
		   ts.setSecurity("SSL-Security-Token-asjJkks244KmcwKJ");
		   ts.setPrice(25);
	     
	      assertNotEquals(ts.getPrice(), 0);
	   }
	   
	   @Test
	   public void testPriceUpdate() {
		   ts.priceUpdate("SSL-Security-Token-asjJkks244KmcwKJ", 0.34);
	     
		  assertNotEquals(ts.toString(), "");
	   }
}
