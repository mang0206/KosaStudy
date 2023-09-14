package emp;

public class Company {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "Secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "Sales", 1200);
		
		Company.printEmployee(emp, false);
		
		((Secretary)emp[0]).incentive(100);
		((Sales)emp[1]).incentive(100);
		
		System.out.println("\n[인센티브 100 지급]");
		Company.printEmployee(emp, true);
	}
	public static void printEmployee(Employee[] emp, boolean isTax) {
		if(!isTax) {
			System.out.println("name\t department\t salary\t extra pay");
			System.out.println("------------------------------------------");
			System.out.printf("%s\t %s\t %d\t\n", 
					emp[0].getName(), emp[0].getDepartment(), emp[0].getSalary());
			System.out.printf("%s\t %s\t\t %d\t %.1f\n",
					emp[1].getName(), emp[1].getDepartment(), emp[1].getSalary(), ((Sales)emp[1]).getExtraPay());
		} else {
			System.out.println("name\t department\t salary\t tax\t extra pay");
			System.out.println("---------------------------------------------------");
			System.out.printf("%s\t %s\t %d\t %.1f\n", 
					emp[0].getName(), emp[0].getDepartment(), emp[0].getSalary(), emp[0].tax());
			System.out.printf("%s\t %s\t\t %d\t %.1f\t %.1f\n",
					emp[1].getName(), emp[1].getDepartment(), emp[1].getSalary(), emp[1].tax(), ((Sales)emp[1]).getExtraPay());
		}
	}

}
