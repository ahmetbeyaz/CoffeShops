package Entity;

import java.sql.Date;
import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateofBirth;
	private Long nationalityid;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, LocalDate dateofBirth, Long nationalityid) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth=dateofBirth;
	   this.nationalityid = nationalityid;
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



	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public Long getNationalityid() {
		return nationalityid;
	}

	public void setNationalityid(Long nationalityid) {
		this.nationalityid = nationalityid;
	}



}
