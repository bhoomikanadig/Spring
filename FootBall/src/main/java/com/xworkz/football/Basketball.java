package com.xworkz.football;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	
public class Basketball {

//	@Value("Nivea")
	private String brandName;
//	@Value("true")
	private Boolean airFilled;
//	@Autowired
	private FootBall football;
//	@Autowired
	private SkyDiving skydiving;
	
	
	public Basketball() {
		
		System.out.println(this.getClass().getSimpleName()+ " Bean Created");
	}
	
	

	public String getBrandName() {
		return brandName;
	}


	@Value("Nivea")
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public Boolean getAirFilled() {
		return airFilled;
	}


	@Value("true")
	public void setAirFilled(Boolean airFilled) {
		this.airFilled = airFilled;
	}



	public FootBall getFootball() {
		return football;
	}


	@Autowired
	public void setFootball(FootBall football) {
		this.football = football;
	}



	public SkyDiving getSkydiving() {
		return skydiving;
	}


	@Autowired
	public void setSkydiving(SkyDiving skydiving) {
		this.skydiving = skydiving;
	}



	@Override
	public String toString() {
		return "Basketball [brandName=" + brandName + ", airFilled=" + airFilled + "]";
	}

	}
