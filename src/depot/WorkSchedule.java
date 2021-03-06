package depot;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class WorkSchedule {
	private String client;
	private String vehicleType;
	private Date startDate;
	private Date endDate;
	private LocalTime startTime;
	private LocalTime endTime;

	private String vehicleReg;
	private String driverID;

	public WorkSchedule(String client, String vehicleType, String startDate, String endDate, String startTime, String endTime,
			String vehicleReg, String driverID) throws ParseException {

		this.client = client;
		this.vehicleType = vehicleType;
		this.startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
		this.endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
		this.startTime = LocalTime.parse(startTime);
		this.endTime = LocalTime.parse(endTime);
		this.vehicleReg = vehicleReg;
		this.driverID = driverID;

	}

	public String getClient() {
		return this.client;
	}
	
	public String getvehicleType() {
		return this.vehicleType;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}

	public LocalTime getEndTime() {
		return this.endTime;
	}

	public String getVehicleReg() {
		return this.vehicleReg;
	}

	public String getDriverID() {
		return this.driverID;
	}
}

