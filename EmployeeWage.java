package assignments.EmployeeWage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int EMP_RATE_PER_HOUR = 20;

        int empHour = 0;
        int empWage = 0;
        double attendanceCheck  =Math.floor(Math.random() * 10) % 2;
        if(attendanceCheck==1){
            System.out.println("Employee is present");
            empHour = 8 ;
        }
        else {
            System.out.println("Employee is absent");
            empHour = 0;
        }
        empWage = empHour * EMP_RATE_PER_HOUR;
        System.out.println("Employee Wage is :" + empWage);

    }
}