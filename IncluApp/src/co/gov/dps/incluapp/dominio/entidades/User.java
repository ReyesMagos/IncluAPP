package co.gov.dps.incluapp.dominio.entidades;

import android.graphics.Bitmap;

public class User {
	
	private String name;
	private String lastName;
	private String age;
	private String profession;
	private Bitmap profilePicture;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Bitmap getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(Bitmap profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	
	

}
