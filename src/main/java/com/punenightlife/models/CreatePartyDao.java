package com.punenightlife.models;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "createParty")
public class CreatePartyDao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partyID;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "party_title")
	private String party_title;

	@Column(name = "location")
	private String location;

	@Column(name = "start_date")
	private String start_date;

	@Column(name = "start_time")
	private String start_time;

	@Column(name = "end_date")
	private String end_date;

	@Column(name = "entry_fees")
	private int entry_fees;

	@Column(name = "guestlist_closingtime")
	private String guestlist_closingtime;

	@Column(name = "category")
	private String category;

	@Column(name = "tags")
	private String tags;

	@Column(name = "description")
	private String description;

	@Column(name = "min_age")
	private int min_age;

	@Lob
	@Column(name = "image_data")
	private byte[] imageData;

	public CreatePartyDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreatePartyDao(int partyID, String clubName, String party_title, String location, String start_date,
			String start_time, String end_date, int entry_fees, String guestlist_closingtime, String category,
			String tags, String description, int min_age, byte[] imageData) {
		super();
		this.partyID = partyID;
		this.clubName = clubName;
		this.party_title = party_title;
		this.location = location;
		this.start_date = start_date;
		this.start_time = start_time;
		this.end_date = end_date;
		this.entry_fees = entry_fees;
		this.guestlist_closingtime = guestlist_closingtime;
		this.category = category;
		this.tags = tags;
		this.description = description;
		this.min_age = min_age;
		this.imageData = imageData;
	}

	public int getPartyID() {
		return partyID;
	}

	public void setPartyID(int partyID) {
		this.partyID = partyID;
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

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGuestlist_closingtime() {
		return guestlist_closingtime;
	}

	public void setGuestlist_closingtime(String guestlist_closingtime) {
		this.guestlist_closingtime = guestlist_closingtime;
	}

	public int getMin_age() {
		return min_age;
	}

	public void setMin_age(int min_age) {
		this.min_age = min_age;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	@Override
	public String toString() {
		return "CreatePartyDao [partyID=" + partyID + ", party_title=" + party_title + ", location=" + location
				+ ", start_date=" + start_date + ", start_time=" + start_time + ", end_date=" + end_date
				+ ", entry_fees=" + entry_fees + ", guestlist_closingtime=" + guestlist_closingtime + ", category="
				+ category + ", tags=" + tags + ", description=" + description + ", imageData="
				+ Arrays.toString(imageData) + "]";
	}

}
