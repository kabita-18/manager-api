package ltts.com.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import ltts.com.model.ManagerDetails;

import ltts.com.service.ManagementService;


@RestController
@RequestMapping("deliciousbyte")
//@CrossOrigin("*/**")

public class AppController {
	@Autowired
	private ManagementService service;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to first spring web Application";
	}
	
	@PostMapping("/addmanager")
	public String getAddManager(@RequestBody ManagerDetails m) {
		if(service.addManager(m)) {
			return "Manager details Added successfully...";
		}
		return "failed to add..";
	}
	@GetMapping("/managername")
	public List<String> getManagerName() {

		List<String> mnameList = service.getName();
		
		return mnameList;
	}
	
	@GetMapping("/managername/{mname}")
	public ManagerDetails getManagerDetails(@PathVariable("mname") String mname) {
		return service.getManagerInfo(mname);
	}
	
	@PutMapping("update/{mname}")
	public String getUpdateMovies(@PathVariable("mname") String mname, @RequestBody ManagerDetails m) 
	{
		String mstatus = m.getStatus();
		    int updatedRows = service.getUpdateMovies(mname, mstatus);

		    if (updatedRows >= 1) {
		        System.out.println(mname + " " + mstatus);
		        return "Details Updated Successfully";
		    }
		    return "manager name not found";

		    
	}
	
}
