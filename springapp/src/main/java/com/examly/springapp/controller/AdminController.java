package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.IBloodBank;
import dao.IBloodDonor;
import dao.ILogin;
import dao.IUser;
import model.BloodBank;
import model.BloodDonor;


@RestController
public class AdminController {
	
	

	
	@Autowired
	IUser user;
	@Autowired
	ILogin login;
	@Autowired
	IBloodBank bloodbank;
	@Autowired
	IBloodDonor blooddonor;
	
	@PostMapping("admin/addSample")
	public String addsample(@RequestBody BloodBank b) {
		
		bloodbank.save(b);
		return "Sample added";
	}
	
	@DeleteMapping("admin/sample/{id}")
	public String deletesample(@PathVariable("id") int id) {
		bloodbank.deleteById(id);
		return "Sample deleted";
	}
	
	@PutMapping("admin/sample/{id}")
	public String updatesample(@RequestBody BloodBank b, @PathVariable("id") int id) {
		
		
		bloodbank.findById(id).map(update -> {
			update.setBloodbankid(b.getBloodbankid());
			update.setBloodgroup(b.getBloodgroup());
			update.setPhlevel(b.getPhlevel());
			update.setQuantity(b.getQuantity());
			return bloodbank.save(update);});
		
	
	
		
		return "Sample Updated";
		
	}
	
	@PutMapping("admin/donor/{id}")
	public String updatedonor(@RequestBody BloodDonor b,@PathVariable("id") int id) {
		
		
		blooddonor.findById(id).map(update -> {
			update.setId(b.getId());
			update.setDonoremail(b.getDonoremail());
			update.setBloodpressure(b.getBloodpressure());
			update.setBloodgroup(b.getBloodgroup());
			update.setActive(b.getActive());
			return blooddonor.save(update);});
		
		
		
		return "Donor Updated";
		
	}
	
	@DeleteMapping("admin/donor/{id}")
	public String deletedonor(@PathVariable("id") int id) {
		
		blooddonor.deleteById(id);
		
		return "Donor Removed";
	}

}
