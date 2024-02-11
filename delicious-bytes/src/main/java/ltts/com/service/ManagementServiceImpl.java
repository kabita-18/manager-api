package ltts.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltts.com.DAO.ManagementDAO;
import ltts.com.model.ManagerDetails;

@Service
public class ManagementServiceImpl implements ManagementService {
	@Autowired
	private ManagementDAO managementDAO;
	public boolean addManager(ManagerDetails m) {
		return managementDAO.addManager(m);
	}
	
	public List<String> getName(){
		return managementDAO.getName();
	}
	
	public ManagerDetails getManagerInfo(String mname) {
		return managementDAO.getManagerInfo(mname);
	}
	
	public int getUpdateMovies(String mname, String mstatus) {
		return managementDAO.getUpdateMovies(mname, mstatus);
	}
}
