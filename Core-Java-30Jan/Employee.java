package Training;

public class Employee {
	int empId;
	String empName;
	double sal;
	public void getEmployeeDetails() {
		
	}
	public void setEmployeeDetails(int empId,String empName,double sal) {
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	int getLoanEligibility(int exp) {
		if(exp <= 5) {
			return 0;
		}
		if(sal == 6) {
			return 2;
		}
		else if(sal >= 10 && sal < 15) {
			return 5;
		}else {
			return 7;
		}
		
	}
	
}
