package assignments.EmployeeWage;

public class EmployeeWage implements InterfaceEmpwage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numofCompany = 0;                 // Take a Varible for Starting Array with 0th index
    private CompanyEmpwage[] companyEmpWageArray;        // Defining Array

    public EmployeeWage() {
        companyEmpWageArray = new CompanyEmpwage[5];   // Create a Constructor and Initallizing Array with Size
    }

    public void addCompanyEmpwage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numofCompany] = new CompanyEmpwage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numofCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numofCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i].company + " Total Wage is: " + companyEmpWageArray[i].totalEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpwage companyEmpWage) {

        int totalEmpWage = 0, totalWorkingDays = 0, totalEmpHrs = 0;

        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
            int empHour = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present & Doing Full Time");
                    empHour = 8;
                    break;

                case IS_PART_TIME:
                    System.out.println("Employee is Present & Doing Part Time");
                    empHour = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHour = 0;

            }
            totalEmpHrs += empHour;            // Calculting a EmpHour and Printing a Emp Hour
            System.out.println("Day-" + totalWorkingDays + " Employee Hour is :" + empHour);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;    // Multiply Total EmpHrs with Rate Per Hour and Returning the Value
    }

    public static void main(String args[]) {
        System.out.println("Welcome to the Employee Wage Computation Program");
        EmployeeWage emp = new EmployeeWage();                    // Creating a Object of Class
        emp.addCompanyEmpwage("DMart", 20, 2, 10);
        emp.addCompanyEmpwage("Reliance", 10, 4, 20);            // Calling a addCompany Method and Add One By One Company To The Array
        emp.computeEmpWage();                        // Calling a Method
    }
}