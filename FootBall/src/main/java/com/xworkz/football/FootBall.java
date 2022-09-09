package com.xworkz.football;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootBall {
	
	
	private String brandName;
	
	private Double price;
	
	
	public FootBall() {
		
		System.out.println(this.getClass().getSimpleName()+ "Bean Created");
	}
	
	
	
	public String getBrandName() {
		return brandName;
	}


	@Value("Reebok")
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public Double getPrice() {
		return price;
	}


	@Value("3500.00D")
	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "FootBall [brandName=" + brandName + ", price=" + price + "]";
	}
	
	

	
}
