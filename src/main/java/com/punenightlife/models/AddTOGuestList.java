package com.punenightlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_list")
public class AddTOGuestList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingID;

	@Column(name = "guest1Name")
	String guest1Name;

	@Column(name = "guest2Name")
	String guest2Name;

	@Column(name = "bookingType")
	String bookingType;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "party_title")
	private String party_title;

	@Column(name = "location")
	private String location;

	@Column(name = "start_date")
	private String start_date;

	@Column(name = "guestListClsoingTime")
	private String guestListClsoingTime;

	@Column(name = "entry_fees")
	private int entry_fees;

	@Column(name = "category")
	private String category;

	@Column(name = "description")
	private String description;

	@Column(name = "userID")
	int userID;

	@Column(name = "partyID")
	int partyID;

	public AddTOGuestList(int bookingID, String guest1Name, String guest2Name, String bookingType, String clubName,
			String party_title, String location, String start_date, String guestListClsoingTime, int entry_fees,
			String category, String description, int userID, int partyID) {
		super();
		this.bookingID = bookingID;
		this.guest1Name = guest1Name;
		this.guest2Name = guest2Name;
		this.bookingType = bookingType;
		this.clubName = clubName;
		this.party_title = party_title;
		this.location = location;
		this.start_date = start_date;
		this.guestListClsoingTime = guestListClsoingTime;
		this.entry_fees = entry_fees;
		this.category = category;
		this.description = description;
		this.userID = userID;
		this.partyID = partyID;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public String getGuest1Name() {
		return guest1Name;
	}

	public void setGuest1Name(String guest1Name) {
		this.guest1Name = guest1Name;
	}

	public String getGuest2Name() {
		return guest2Name;
	}

	public void setGuest2Name(String guest2Name) {
		this.guest2Name = guest2Name;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getParty_title() {
		return party_title;
	}

	public void setParty_title(String party_title) {
		this.party_title = party_title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getGuestListClsoingTime() {
		return guestListClsoingTime;
	}

	public void setGuestListClsoingTime(String guestListClsoingTime) {
		this.guestListClsoingTime = guestListClsoingTime;
	}

	public int getEntry_fees() {
		return entry_fees;
	}

	public void setEntry_fees(int entry_fees) {
		this.entry_fees = entry_fees;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getPartyID() {
		return partyID;
	}

	public void setPartyID(int partyID) {
		this.partyID = partyID;
	}

}
