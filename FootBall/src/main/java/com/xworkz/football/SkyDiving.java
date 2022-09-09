package com.xworkz.football;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SkyDiving {

	
	private String location;
	
	private Double height;
	
	private Double price;
	

	public SkyDiving() {
		
		System.out.println(this.getClass().getSimpleName() + "Bean Created");
	}
	
	

	public String getLocation() {
		return location;
	}


	@Value("Dubhai")
	public void setLocation(String location) {
		this.location = location;
	}



	public Double getHeight() {
		return height;
	}


	@Value("60000")
	public void setHeight(Double height) {
		this.height = height;
	}



	public Double getPrice() {
		return price;
	}


	@Value("80000D")
	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "SkyDiving [height=" + height + ", price=" + price + "]";
	}
	
	

}