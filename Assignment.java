//BuildingWorker - The 3rd table in many to many

package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Assignment {
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "w_id",referencedColumnName = "WorkerId")
	private Worker worker;
	
	@ManyToOne
	@JoinColumn(name = "b_id",referencedColumnName = "BuildId")	
	private Building building;
	
	private int WorkingHours;
	private int Payment;
	//these 2 things depend on other both tables
	
	public Assignment()
	{}
	
	public Assignment(long id, Worker worker, Building building, int workingHours, int payment) {
		super();
		this.id = id;
		this.worker = worker;
		this.building = building;
		WorkingHours = workingHours;
		Payment = payment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public int getWorkingHours() {
		return WorkingHours;
	}

	public void setWorkingHours(int workingHours) {
		WorkingHours = workingHours;
	}

	public int getPayment() {
		return Payment;
	}

	public void setPayment(int payment) {
		Payment = payment;
	}
}
