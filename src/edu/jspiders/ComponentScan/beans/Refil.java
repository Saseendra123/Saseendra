package edu.jspiders.ComponentScan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Refil 
{
	@Value("Reylonds")
	private String brand;
	@Value("Ball Point")
	private  String type;
	@Value("10.56")
	private double price;
	
	public Refil()
	{
		System.out.println(this.getClass().getSimpleName()+"Object created");
		
	}

	public Refil(String brand, String type, double price) 
	{
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Refil [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
