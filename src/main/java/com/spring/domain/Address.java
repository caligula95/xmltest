package com.spring.domain;

public class Address {

	private String flatNumber;
	private String homeNumber;
	private String street;
	private String city;
	private String state;
	private String country;
	private String typeRef;
	private String languageRef;
	private String dateOfChange;
	private String index;
	

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTypeRef() {
		return typeRef;
	}

	public void setTypeRef(String typeRef) {
		this.typeRef = typeRef;
	}

	public String getLanguageRef() {
		return languageRef;
	}

	public void setLanguageRef(String languageRef) {
		this.languageRef = languageRef;
	}

	public String getDateOfChange() {
		return dateOfChange;
	}

	public void setDateOfChange(String dateOfChange) {
		this.dateOfChange = dateOfChange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dateOfChange == null) ? 0 : dateOfChange.hashCode());
		result = prime * result + ((flatNumber == null) ? 0 : flatNumber.hashCode());
		result = prime * result + ((homeNumber == null) ? 0 : homeNumber.hashCode());
		result = prime * result + ((languageRef == null) ? 0 : languageRef.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((typeRef == null) ? 0 : typeRef.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateOfChange == null) {
			if (other.dateOfChange != null)
				return false;
		} else if (!dateOfChange.equals(other.dateOfChange))
			return false;
		if (flatNumber == null) {
			if (other.flatNumber != null)
				return false;
		} else if (!flatNumber.equals(other.flatNumber))
			return false;
		if (homeNumber == null) {
			if (other.homeNumber != null)
				return false;
		} else if (!homeNumber.equals(other.homeNumber))
			return false;
		if (languageRef == null) {
			if (other.languageRef != null)
				return false;
		} else if (!languageRef.equals(other.languageRef))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (typeRef == null) {
			if (other.typeRef != null)
				return false;
		} else if (!typeRef.equals(other.typeRef))
			return false;
		return true;
	}

}
