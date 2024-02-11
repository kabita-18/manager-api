package ltts.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ManagerDetails {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int mid;
	private String mname;
	private String email;
	private String status;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ManagerDetails(int mid, String mname, String email, String status) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.email = email;
		this.status = status;
	}
	public ManagerDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ManagerDetails [mid=" + mid + ", mname=" + mname + ", email=" + email + ", status=" + status + "]";
	}
	
	

}
