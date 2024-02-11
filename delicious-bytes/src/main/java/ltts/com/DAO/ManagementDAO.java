package ltts.com.DAO;

import java.util.List;

import ltts.com.model.ManagerDetails;

public interface ManagementDAO {

	boolean addManager(ManagerDetails m);

	List<String> getName();
	ManagerDetails getManagerInfo(String mname);
	public int getUpdateMovies(String mname, String mstatus);

}
