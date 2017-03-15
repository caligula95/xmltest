package com.spring.domain;

public class Contacts {

	private String typeOfContact;
	private String contact;
	private String dateOfContact;
	private int type;
	
	

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTypeOfContact() {
		return typeOfContact;
	}

	public void setTypeOfContact(String typeOfContact) {
		this.typeOfContact = typeOfContact;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDateOfContact() {
		return dateOfContact;
	}

	public void setDateOfContact(String dateOfContact) {
		this.dateOfContact = dateOfContact;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contact == null) ? 0 : contact.hashCode());
		result = prime * result + ((dateOfContact == null) ? 0 : dateOfContact.hashCode());
		result = prime * result + type;
		result = prime * result + ((typeOfContact == null) ? 0 : typeOfContact.hashCode());
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
		Contacts other = (Contacts) obj;
		if (contact == null) {
			if (other.contact != null)
				return false;
		} else if (!contact.equals(other.contact))
			return false;
		if (dateOfContact == null) {
			if (other.dateOfContact != null)
				return false;
		} else if (!dateOfContact.equals(other.dateOfContact))
			return false;
		if (type != other.type)
			return false;
		if (typeOfContact == null) {
			if (other.typeOfContact != null)
				return false;
		} else if (!typeOfContact.equals(other.typeOfContact))
			return false;
		return true;
	}


}
