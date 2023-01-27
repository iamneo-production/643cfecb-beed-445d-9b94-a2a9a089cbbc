package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import model.BloodDonor;

public interface IBloodDonor extends JpaRepository<BloodDonor, Integer> {

	public List<BloodDonor> findByBloodgroup(String grp);
}
