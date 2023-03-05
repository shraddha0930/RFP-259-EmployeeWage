package assignments.EmployeeWage;

public class CompanyEmpwage {

	//Declearing Varibles
	public String company;
	public int empRatePerHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalEmpWage = 0;
	
	//Creating a Constuctor here
	public CompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	// set TotalWage Variable to the Method
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	
	
	
}