package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Building {

	@Id
	private String BuildId;
	private String Address;
	private int Nooffloor;
	
	@OneToMany(mappedBy = "building")
	private List<Assignment>workers;
	
	public Building()
	{}

	public Building(String buildId, String address, int nooffloor, List<Assignment> workers) {
		super();
		BuildId = buildId;
		Address = address;
		Nooffloor = nooffloor;
		this.workers = workers;
	}

	public String getBuildId() {
		return BuildId;
	}

	public void setBuildId(String buildId) {
		BuildId = buildId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getNooffloor() {
		return Nooffloor;
	}

	public void setNooffloor(int nooffloor) {
		Nooffloor = nooffloor;
	}

	public List<Assignment> getWorkers() {
		return workers;
	}

	public void setWorkers(List<Assignment> workers) {
		this.workers = workers;
	}
}
