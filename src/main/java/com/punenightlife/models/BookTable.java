package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_booking")
public class BookTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int tableBookingID;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "eventDate")
	String eventDate;

	@Column(name = "typeOfParty")
	String typeOfParty;

	@Column(name = "totalNoOfGuests")
	String totalNoOfGuests;

	@Column(name = "tentative_males")
	String tentative_males;

	@Column(name = "tentative_females")
	String tentative_females;

	@Column(name = "guestName")
	String guestName;

	@Column(name = "mobNumber")
	long mobNumber;

	@Column(name = "email")
	String email;

	@Column(name = "budgetPerPerson")
	String budgetPerPerson;

	public BookTable(int tableBookingID, String clubName, String eventDate, String typeOfParty,
			String totalNoOfGuests, String tentative_males, String tentative_females, String guestName, long mobNumber,
			String email, String budgetPerPerson) {
		super();
		this.tableBookingID = tableBookingID;
		this.clubName = clubName;
		this.eventDate = eventDate;
		this.typeOfParty = typeOfParty;
		this.totalNoOfGuests = totalNoOfGuests;
		this.tentative_males = tentative_males;
		this.tentative_females = tentative_females;
		this.guestName = guestName;
		this.mobNumber = mobNumber;
		this.email = email;
		this.budgetPerPerson = budgetPerPerson;
	}
	
	

	public BookTable() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getTableBookingID() {
		return tableBookingID;
	}

	public void setTableBookingID(int tableBookingID) {
		this.tableBookingID = tableBookingID;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getTypeOfParty() {
		return typeOfParty;
	}

	public void setTypeOfParty(String typeOfParty) {
		this.typeOfParty = typeOfParty;
	}

	public String getTotalNoOfGuests() {
		return totalNoOfGuests;
	}

	public void setTotalNoOfGuests(String totalNoOfGuests) {
		this.totalNoOfGuests = totalNoOfGuests;
	}

	public String getTentative_males() {
		return tentative_males;
	}

	public void setTentative_males(String tentative_males) {
		this.tentative_males = tentative_males;
	}

	public String getTentative_females() {
		return tentative_females;
	}

	public void setTentative_females(String tentative_females) {
		this.tentative_females = tentative_females;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBudgetPerPerson() {
		return budgetPerPerson;
	}

	public void setBudgetPerPerson(String budgetPerPerson) {
		this.budgetPerPerson = budgetPerPerson;
	}

	@Override
	public String toString() {
		return "BookTable [tableBookingID=" + tableBookingID + ", clubName=" + clubName + ", eventDate=" + eventDate
				+ ", typeOfParty=" + typeOfParty + ", totalNoOfGuests=" + totalNoOfGuests + ", tentative_males="
				+ tentative_males + ", tentative_females=" + tentative_females + ", guestName=" + guestName
				+ ", mobNumber=" + mobNumber + ", email=" + email + ", budgetPerPerson=" + budgetPerPerson + "]";
	}

}
