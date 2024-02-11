package ltts.com.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import ltts.com.jpa.MyJPARepository1;
import ltts.com.model.ManagerDetails;

@Repository

public class ManagementDAOImpl implements ManagementDAO {
	@Autowired
	private MyJPARepository1 myRepo;
	
	 public boolean addManager(ManagerDetails m) {
		 if(myRepo.save(m)!= null) return true;
			return false;
	 }
	 
	 @Override
	 public List<String> getName(){
//		 ManagerDetails m = new ManagerDetails();
//		 System.out.println(m);
//		 
//		 List<ManagerDetails> mList = myRepo.findAllByMname(mname);
//		 System.out.println(mList);
//		 
//		 if(mList.isEmpty()) {
//			 return mList;
//		 }
//		 return null;
		 return  myRepo.findAllManagerNames();
		 
	 }
	 public ManagerDetails getManagerInfo(String mname) {
		 Optional<ManagerDetails> getdata = myRepo.findByMname(mname);
		  if(getdata.isPresent()) {
			  System.out.println("manager details found");
			  return getdata.get();
		  }
		  return null;
	 }
	 
	 @Transactional
	 public int getUpdateMovies(String mname, String mstatus) {
		 return myRepo.getUpdate(mname, mstatus);
	 }
}
