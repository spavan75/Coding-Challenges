package com.acme.mytrader.price;

import static org.junit.Assert.*;

import org.junit.Test;

import com.acme.mytrader.strategy.TradingStrategy;

public class PriceListenerTest {
	
	PriceListener pl = new TradingStrategy(null, 0);

	@Test
	public void test() {
		pl.priceUpdate(null, 0);
	}

	 
}
