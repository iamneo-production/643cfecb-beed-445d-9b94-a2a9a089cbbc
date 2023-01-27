package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import model.BloodBank;

public interface IBloodBank extends JpaRepository<BloodBank, Integer> {

////	@Query("select b from bloodbank b where b.bloodGroup=:n")
//	public List<BloodBank>samplebloodgroupby(@Param("n") String grp);

	public List<BloodBank> findByBloodgroup(String grp);
}
