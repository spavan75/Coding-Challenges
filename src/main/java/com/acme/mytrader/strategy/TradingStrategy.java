package com.acme.mytrader.strategy;

import com.acme.mytrader.price.*;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy implements PriceListener {

	public String security;

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double price;
	TradingStrategy ts;

	public TradingStrategy(String security, double price) {
		this.security = security;
		this.price = price;

	}

	@Override
	public void priceUpdate(String security, double price) {

		ts = new TradingStrategy(security, price);

	}

	public String toString() {
		return "(" + getClass() + " price:" + ts.getPrice() + " secutiry:" + ts.getSecurity() + ")";
	}
}
