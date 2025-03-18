package Training;
import Training.Employee;


public class Task11 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeDetails(1, "Ajay", 7);
		int loan = emp.getLoanEligibility(8);
		if(loan == 0) {
			System.out.println("Loan has been rejected");
		}else {
			System.out.println("You can avail a loan of "+loan+" Lakhs resepectively");
		}
	}	
}
