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

	@Column(name = "entry_fees")
	private int entry_fees;

	@Lob
	@Column(name = "image_data")
	private byte[] imageData;

	public AddClub() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddClub(int clubID, String clubName, String description, String location, String latitude,String longitude, 
			String guestListclosingTime,String tags,
			boolean isGuestListAvailable, String min_age, int entry_fees, byte[] imageData) {
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
		this.entry_fees = entry_fees;
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
				+ guestListclosingTime + ", isGuestListAvailable=" + isGuestListAvailable + ", min_age=" + min_age
				+ ", entry_fees=" + entry_fees + ", imageData=" + Arrays.toString(imageData) + ", getClubID()="
				+ getClubID() + ", getClubName()=" + getClubName() + ", getDescription()=" + getDescription()
				+ ", getLocation()=" + getLocation() + ", getLatitude()=" + getLatitude() + ", getLongitude()="
				+ getLongitude() + ", getGuestListclosingTime()=" + getGuestListclosingTime()
				+ ", isGuestListAvailable()=" + isGuestListAvailable() + ", getMin_age()=" + getMin_age()
				+ ", getEntry_fees()=" + getEntry_fees() + ", getImageData()=" + Arrays.toString(getImageData())
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	

	 

}
