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
@Table(name = "list_of_clubs")
public class AddClub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int clubID;

	@Column(name = "clubName")
	String clubName;

	@Column(name = "description")
	String description;

	@Column(name = "location")
	String location;
	
	@Column(name = "latitude")
	String latitude;

	
	@Column(name = "longitude")
	String longitude;
	
	@Column(name = "guestListclosingTime")
	String guestListclosingTime;

	@Column(name = "tags")
	String tags;
	
	@Column(name = "isGuestListAvailable")
	boolean isGuestListAvailable = false;

	@Column(name = "min_age")
	String min_age;
	
	@Column(name = "offers")
	String offers;

	@Column(name = "walkinCoverCharges")
	String walkinCoverCharges;
	
	@Column(name = "guestlistCoverCharges")
	String guestlistCoverCharges;
	
	@Column(name = "guestlistAvailableDays")
	String guestlistAvailableDays;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "entry_fees")
	private int entry_fees;

	@Lob
	@Column(name = "image_data")
	private byte[] imageData;

	public AddClub() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	public AddClub(int clubID, String clubName, String description, String location, String latitude, String longitude,
			String guestListclosingTime, String tags, boolean isGuestListAvailable, String min_age, String offers,
			String walkinCoverCharges, String guestlistCoverCharges, String guestlistAvailableDays, int entry_fees, String note,
			byte[] imageData) {
		super();
		this.clubID = clubID;
		this.clubName = clubName;
		this.description = description;
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
		this.guestListclosingTime = guestListclosingTime;
		this.tags = tags;
		this.isGuestListAvailable = isGuestListAvailable;
		this.min_age = min_age;
		this.offers = offers;
		this.walkinCoverCharges = walkinCoverCharges;
		this.guestlistCoverCharges = guestlistCoverCharges;
		this.guestlistAvailableDays = guestlistAvailableDays;
		this.entry_fees = entry_fees;
		this.note = note;
		this.imageData = imageData;
	}



	public int getClubID() {
		return clubID;
	}

	public void setClubID(int clubID) {
		this.clubID = clubID;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGuestListclosingTime() {
		return guestListclosingTime;
	}

	public void setGuestListclosingTime(String guestListclosingTime) {
		this.guestListclosingTime = guestListclosingTime;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public boolean isGuestListAvailable() {
		return isGuestListAvailable;
	}

	public void setGuestListAvailable(boolean isGuestListAvailable) {
		this.isGuestListAvailable = isGuestListAvailable;
	}

	public String getMin_age() {
		return min_age;
	}

	public void setMin_age(String min_age) {
		this.min_age = min_age;
	}

	public int getEntry_fees() {
		return entry_fees;
	}

	public void setEntry_fees(int entry_fees) {
		this.entry_fees = entry_fees;
	}
	
	

	public String getWalkinCoverCharges() {
		return walkinCoverCharges;
	}



	public void setWalkinCoverCharges(String walkinCoverCharges) {
		this.walkinCoverCharges = walkinCoverCharges;
	}



	public String getGuestlistCoverCharges() {
		return guestlistCoverCharges;
	}



	public void setGuestlistCoverCharges(String guestlistCoverCharges) {
		this.guestlistCoverCharges = guestlistCoverCharges;
	}



	public String getGuestlistAvailableDays() {
		return guestlistAvailableDays;
	}



	public void setGuestlistAvailableDays(String guestlistAvailableDays) {
		this.guestlistAvailableDays = guestlistAvailableDays;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}



	@Override
	public String toString() {
		return "AddClub [clubID=" + clubID + ", clubName=" + clubName + ", description=" + description + ", location="
				+ location + ", latitude=" + latitude + ", longitude=" + longitude + ", guestListclosingTime="
				+ guestListclosingTime + ", tags=" + tags + ", isGuestListAvailable=" + isGuestListAvailable
				+ ", min_age=" + min_age + ", offers=" + offers + ", walkinCoverCharges=" + walkinCoverCharges
				+ ", guestlistCoverCharges=" + guestlistCoverCharges + ", guestlistAvailableDays="
				+ guestlistAvailableDays + ", note=" + note + ", entry_fees=" + entry_fees + ", imageData="
				+ Arrays.toString(imageData) + "]";
	}

	 

}
