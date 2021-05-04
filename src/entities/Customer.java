package entities;

import abstracts.IEntity;

public class Customer implements IEntity{

	private int id;
	private String firstName;
	private String lastName;
	private String dataOfBirthYear;
	private String nationalityId;
	
	public Customer(int id, String firstName, String lastName, String dataOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirthYear = dataOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDataOfBirthYear() {
		return dataOfBirthYear;
	}
	public void setDataOfBirthYear(String dataOfBirthYear) {
		this.dataOfBirthYear = dataOfBirthYear;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
