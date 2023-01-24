package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class BloodBank {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int bloodbankid;
	private String bloodgroup;
	private String phlevel;
	private Integer quantity;

	public int getBloodbankid() {
		return bloodbankid;
	}
	public void setBloodbankid(int bloodbankid) {
		this.bloodbankid = bloodbankid;
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
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	

}
