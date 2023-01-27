package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodDonor {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String donoremail;
	private String bloodgroup;
	private String phlevel;
	private String bloodpressure;
	private Boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonoremail() {
		return donoremail;
	}
	public void setDonoremail(String donoremail) {
		this.donoremail = donoremail;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getPhlevel() {
		return phlevel;
	}
	public void setPhlevel(String phlevel) {
		this.phlevel = phlevel;
	}
	public String getBloodpressure() {
		return bloodpressure;
	}
	public void setBloodpressure(String bloodpressure) {
		this.bloodpressure = bloodpressure;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	
	
	
	

}
