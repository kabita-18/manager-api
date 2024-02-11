package ltts.com.jpa;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ltts.com.model.ManagerDetails;

@Repository

public interface MyJPARepository1 extends CrudRepository<ManagerDetails,String> {

//	List<ManagerDetails> findAllByMnameIsNotNull();
	 @Query("SELECT m.mname FROM ManagerDetails m")
	    List<String> findAllManagerNames();

	Optional<ManagerDetails> findByMname(String mname);

	@Modifying
	@Query("update ManagerDetails m set m.status=:status where m.mname =:mname")

	int getUpdate(@Param("mname") String mname, @Param("status")String status);

	
	

}
