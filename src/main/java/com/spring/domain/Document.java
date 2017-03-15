package com.spring.domain;

public class Document {

	private String dateOfCreation;
	private String whoGave;
	private String number;
	private String seria;
	private String type;
	private String languageRef;
	private String dateOfChange;
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public String getWhoGave() {
		return whoGave;
	}
	public void setWhoGave(String whoGave) {
		this.whoGave = whoGave;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSeria() {
		return seria;
	}
	public void setSeria(String seria) {
		this.seria = seria;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		result = prime * result + ((dateOfChange == null) ? 0 : dateOfChange.hashCode());
		result = prime * result + ((dateOfCreation == null) ? 0 : dateOfCreation.hashCode());
		result = prime * result + ((languageRef == null) ? 0 : languageRef.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((seria == null) ? 0 : seria.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((whoGave == null) ? 0 : whoGave.hashCode());
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
		Document other = (Document) obj;
		if (dateOfChange == null) {
			if (other.dateOfChange != null)
				return false;
		} else if (!dateOfChange.equals(other.dateOfChange))
			return false;
		if (dateOfCreation == null) {
			if (other.dateOfCreation != null)
				return false;
		} else if (!dateOfCreation.equals(other.dateOfCreation))
			return false;
		if (languageRef == null) {
			if (other.languageRef != null)
				return false;
		} else if (!languageRef.equals(other.languageRef))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (seria == null) {
			if (other.seria != null)
				return false;
		} else if (!seria.equals(other.seria))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (whoGave == null) {
			if (other.whoGave != null)
				return false;
		} else if (!whoGave.equals(other.whoGave))
			return false;
		return true;
	}
	
}
