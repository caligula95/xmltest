package com.spring.domain;

public class Work {
	private String work;
	private String EGRPOUofWork;
	private String workSalary;
	private String workPo;
	private String positionStatus;
	private String languageRef;
	private String dateOfChange;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getEGRPOUofWork() {
		return EGRPOUofWork;
	}

	public void setEGRPOUofWork(String eGRPOUofWork) {
		EGRPOUofWork = eGRPOUofWork;
	}

	public String getWorkSalary() {
		return workSalary;
	}

	public void setWorkSalary(String workSalary) {
		this.workSalary = workSalary;
	}

	public String getWorkPo() {
		return workPo;
	}

	public void setWorkPo(String workPo) {
		this.workPo = workPo;
	}

	public String getPositionStatus() {
		return positionStatus;
	}

	public void setPositionStatus(String positionStatus) {
		this.positionStatus = positionStatus;
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
		result = prime * result + ((EGRPOUofWork == null) ? 0 : EGRPOUofWork.hashCode());
		result = prime * result + ((dateOfChange == null) ? 0 : dateOfChange.hashCode());
		result = prime * result + ((languageRef == null) ? 0 : languageRef.hashCode());
		result = prime * result + ((positionStatus == null) ? 0 : positionStatus.hashCode());
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		result = prime * result + ((workPo == null) ? 0 : workPo.hashCode());
		result = prime * result + ((workSalary == null) ? 0 : workSalary.hashCode());
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
		Work other = (Work) obj;
		if (EGRPOUofWork == null) {
			if (other.EGRPOUofWork != null)
				return false;
		} else if (!EGRPOUofWork.equals(other.EGRPOUofWork))
			return false;
		if (dateOfChange == null) {
			if (other.dateOfChange != null)
				return false;
		} else if (!dateOfChange.equals(other.dateOfChange))
			return false;
		if (languageRef == null) {
			if (other.languageRef != null)
				return false;
		} else if (!languageRef.equals(other.languageRef))
			return false;
		if (positionStatus == null) {
			if (other.positionStatus != null)
				return false;
		} else if (!positionStatus.equals(other.positionStatus))
			return false;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		if (workPo == null) {
			if (other.workPo != null)
				return false;
		} else if (!workPo.equals(other.workPo))
			return false;
		if (workSalary == null) {
			if (other.workSalary != null)
				return false;
		} else if (!workSalary.equals(other.workSalary))
			return false;
		return true;
	}

}
