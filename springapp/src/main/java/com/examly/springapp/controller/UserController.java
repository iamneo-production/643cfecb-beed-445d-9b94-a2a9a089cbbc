package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.IBloodBank;
import dao.IBloodDonor;
import dao.ILogin;
import dao.IUser;
import model.BloodBank;
import model.BloodDonor;
import model.Login;
import model.User;

@RestController
public class UserController {

	@Autowired
	IUser user;
	@Autowired
	ILogin login;
	@Autowired
	IBloodBank bloodbank;
	@Autowired
	IBloodDonor blooddonor;

	@GetMapping("/")
	public String welcome() {
		return "welcome to bloodbank";
	}

	@PostMapping("login")
	public String loginuser(@RequestBody Login u) {

		if (login.findById(u.getEmail()).get().getPassword().contains(u.getPassword())) {
			return "true";
		} else
			return "false";

	}

	@PostMapping("signup")
	public String singingup(@RequestBody User u) {
		try {

			user.save(u);
			return "true";

		} catch (Exception e) {
			return "false";
		}
	}

	@GetMapping("sample")
	public List<BloodBank> allsample() {
		return bloodbank.findAll();

	}

	@GetMapping("donor")
	public List<BloodDonor> alldonor() {
		return blooddonor.findAll();
	}

	@GetMapping("donors/{group}")
	public List<BloodDonor> donorbygrp(@PathVariable("group") String grp) {
		return blooddonor.findByBloodgroup(grp);
	}

	@GetMapping("samples/{sample}")
	public List<BloodBank> samplebygrp(@PathVariable("sample") String group) {
		return bloodbank.findByBloodgroup(group);
	}

	@GetMapping("donor/{id}")
	public Optional<BloodDonor> spicificdonor(@PathVariable("id") int id) {

		return blooddonor.findById(id);

	}

	@GetMapping("sample/{id}")
	public Optional<BloodBank> spicificsample(@PathVariable("id") int id) {
		return bloodbank.findById(id);
	}

}
