package com.exam.crud;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String transportName="";
	@Column
	private String source="";
	@Column
	private String destination="";
	@Column
	private String startCounter="";
	@Column
	private String endCounter="";
	@Column
	private String coachNo="";
	@Column
	private String coachType="";
	@Column
	private Date journeyDate;
	@Column
	private String departingTime="";
	@Column
	private String arivalTime="";
	@Column
	private float unitFare=0;
	@Column
	private float totalFare=0;
	@Column
	private float discount=0;
	@Column
	private String status="";
	@Column
	private String seat01="";
	@Column
	private String seat02;
	@Column
	private String seat03="";
	@Column
	private String seat04="";
	@Column
	private String seat05="";
	@Column
	private String seat06="";
	@Column
	private String seat07="";
	@Column
	private String seat08="";
	@Column
	private String seat09="";
	@Column
	private String seat10="";
	@Column
	private String seat11="";
	@Column
	private String seat12="";
	@Column
	private String seat13="";
	@Column
	private String seat14="";
	@Column
	private String seat15="";
	@Column
	private String seat16="";
	@Column
	private int totalSeats=0;
	@Column
	private int bookedSeats=0;
	@Column
	private int availableSeats=0;
	@Column
	private String description1="";
	public Ticket() {
		super();
		
	}

	public Ticket(long id, String transportName, String source, String destination, String startCounter,
			String endCounter, String coachNo, String coachType, Date journeyDate, String departingTime,
			String arivalTime, float unitFare, float totalFare, float discount, String status, String seat01,
			String seat02, String seat03, String seat04, String seat05, String seat06, String seat07, String seat08,
			String seat09, String seat10, String seat11, String seat12, String seat13, String seat14, String seat15,
			String seat16, int totalSeats, int bookedSeats, int availableSeats, String description1) {
		super();
		this.id = id;
		this.transportName = transportName;
		this.source = source;
		this.destination = destination;
		this.startCounter = startCounter;
		this.endCounter = endCounter;
		this.coachNo = coachNo;
		this.coachType = coachType;
		this.journeyDate = journeyDate;
		this.departingTime = departingTime;
		this.arivalTime = arivalTime;
		this.unitFare = unitFare;
		this.totalFare = totalFare;
		this.discount = discount;
		this.status = status;
		this.seat01 = seat01;
		this.seat02 = seat02;
		this.seat03 = seat03;
		this.seat04 = seat04;
		this.seat05 = seat05;
		this.seat06 = seat06;
		this.seat07 = seat07;
		this.seat08 = seat08;
		this.seat09 = seat09;
		this.seat10 = seat10;
		this.seat11 = seat11;
		this.seat12 = seat12;
		this.seat13 = seat13;
		this.seat14 = seat14;
		this.seat15 = seat15;
		this.seat16 = seat16;
		this.totalSeats = totalSeats;
		this.bookedSeats = bookedSeats;
		this.availableSeats = availableSeats;
		this.description1 = description1;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTransportName() {
		return transportName;
	}
	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartCounter() {
		return startCounter;
	}
	public void setStartCounter(String startCounter) {
		this.startCounter = startCounter;
	}
	public String getEndCounter() {
		return endCounter;
	}
	public void setEndCounter(String endCounter) {
		this.endCounter = endCounter;
	}
	public String getCoachNo() {
		return coachNo;
	}
	public void setCoachNo(String coachNo) {
		this.coachNo = coachNo;
	}
	public String getCoachType() {
		return coachType;
	}
	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}
	public String getDepartingTime() {
		return departingTime;
	}
	public void setDepartingTime(String departingTime) {
		this.departingTime = departingTime;
	}
	public String getArivalTime() {
		return arivalTime;
	}
	public void setArivalTime(String arivalTime) {
		this.arivalTime = arivalTime;
	}
	public float getUnitFare() {
		return unitFare;
	}
	public void setUnitFare(float unitFare) {
		this.unitFare = unitFare;
	}
	public float getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(float totalFare) {
		this.totalFare = totalFare;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSeat01() {
		return seat01;
	}
	public void setSeat01(String seat01) {
		this.seat01 = seat01;
	}
	public String getSeat02() {
		return seat02;
	}
	public void setSeat02(String seat02) {
		this.seat02 = seat02;
	}
	public String getSeat03() {
		return seat03;
	}
	public void setSeat03(String seat03) {
		this.seat03 = seat03;
	}
	public String getSeat04() {
		return seat04;
	}
	public void setSeat04(String seat04) {
		this.seat04 = seat04;
	}
	public String getSeat05() {
		return seat05;
	}
	public void setSeat05(String seat05) {
		this.seat05 = seat05;
	}
	public String getSeat06() {
		return seat06;
	}
	public void setSeat06(String seat06) {
		this.seat06 = seat06;
	}
	public String getSeat07() {
		return seat07;
	}
	public void setSeat07(String seat07) {
		this.seat07 = seat07;
	}
	public String getSeat08() {
		return seat08;
	}
	public void setSeat08(String seat08) {
		this.seat08 = seat08;
	}
	public String getSeat09() {
		return seat09;
	}
	public void setSeat09(String seat09) {
		this.seat09 = seat09;
	}
	public String getSeat10() {
		return seat10;
	}
	public void setSeat10(String seat10) {
		this.seat10 = seat10;
	}
	public String getSeat11() {
		return seat11;
	}
	public void setSeat11(String seat11) {
		this.seat11 = seat11;
	}
	public String getSeat12() {
		return seat12;
	}
	public void setSeat12(String seat12) {
		this.seat12 = seat12;
	}
	public String getSeat13() {
		return seat13;
	}
	public void setSeat13(String seat13) {
		this.seat13 = seat13;
	}
	public String getSeat14() {
		return seat14;
	}
	public void setSeat14(String seat14) {
		this.seat14 = seat14;
	}
	public String getSeat15() {
		return seat15;
	}
	public void setSeat15(String seat15) {
		this.seat15 = seat15;
	}
	public String getSeat16() {
		return seat16;
	}
	public void setSeat16(String seat16) {
		this.seat16 = seat16;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", transportName=" + transportName + ", source=" + source + ", destination="
				+ destination + ", startCounter=" + startCounter + ", endCounter=" + endCounter + ", coachNo=" + coachNo
				+ ", coachType=" + coachType + ", departingTime=" + departingTime + ", arivalTime=" + arivalTime
				+ ", unitFare=" + unitFare + ", totalFare=" + totalFare + ", discount=" + discount + ", status="
				+ status + ", seat01=" + seat01 + ", seat02=" + seat02 + ", seat03=" + seat03 + ", seat04=" + seat04
				+ ", seat05=" + seat05 + ", seat06=" + seat06 + ", seat07=" + seat07 + ", seat08=" + seat08
				+ ", seat09=" + seat09 + ", seat10=" + seat10 + ", seat11=" + seat11 + ", seat12=" + seat12
				+ ", seat13=" + seat13 + ", seat14=" + seat14 + ", seat15=" + seat15 + ", seat16=" + seat16
				+ ", totalSeats=" + totalSeats + ", bookedSeats=" + bookedSeats + ", availableSeats=" + availableSeats
				+ ", description1=" + description1 + "]";
	}

	
}
