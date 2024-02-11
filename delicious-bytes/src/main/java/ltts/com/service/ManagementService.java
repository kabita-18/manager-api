package ltts.com.service;

import java.util.List;

import ltts.com.model.ManagerDetails;

public interface ManagementService {

	boolean addManager(ManagerDetails m);

	List<String> getName();

	ManagerDetails getManagerInfo(String mname);

	int getUpdateMovies(String mname, String mstatus);

}
