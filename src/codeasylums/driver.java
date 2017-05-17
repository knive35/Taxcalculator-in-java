package codeasylums;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class driver {
	public static void main(String[] args) {
		
		List<Employee> listOfEmployees=new ArrayList<Employee>();
		 TaxCalculator employeeTax = new TaxCalculator();
		listOfEmployees.add(new Employee("First", 1, 3));
		listOfEmployees.add(new Employee("Second", 5, 8));
		listOfEmployees.add(new Employee("Third", 6, 4));
		List<Employee> bracketedEmployeeList=employeeTax.getEmployeeListByTaxBracket(listOfEmployees,20);
		for(int i=0;i<bracketedEmployeeList.size();i++){
			Employee workingEmployee=bracketedEmployeeList.get(i);
			System.out.println(workingEmployee.getEmployeeId() + " " + workingEmployee.getName() + " " + workingEmployee.getSalary());
		}
		/*
		int taxPaidByFirstEmployee=TaxCalculator.tax(Employee1.salary);
		int taxPaidBySecondEmployee=TaxCalculator.tax(employee2.salary);
		int taxPaidByThirdEmployee=TaxCalculator.tax(employee3.salary);
		System.out.println("employee name " + employee1.name + " having salary " +employee1.salary+ " is " +taxPaidByFirstEmployee);
		System.out.println("employee name " + employee2.name + " having salary " +employee2.salary+ " is " +taxPaidBySecondEmployee );
		System.out.println("employee name " + employee3.name + " having salary " +employee3.salary+ " is " +taxPaidByThirdEmployee );
		double actualTaxPaidByFirstEmployee=TaxCalculator.actualTax(employee1.salary);
		double actualTaxPaidBySecondEmployee=TaxCalculator.actualTax(employee2.salary);
		double actualTaxPaidByThirdEmployee=TaxCalculator.actualTax(employee3.salary);
		System.out.print("tax for employee name " + employee1.name + " having salary " +employee1.salary+ " is " +actualTaxPaidByFirstEmployee+ "\n");
		System.out.print("tax for employee name " + employee2.name + " having salary " +employee2.salary+ " is " +actualTaxPaidBySecondEmployee+ "\n");
		System.out.print("tax for employee name " + employee3.name + " having salary " +employee3.salary+ " is " +actualTaxPaidByThirdEmployee+ "\n");
		int[] salaryRange=TaxCalculator.number(listOfEmployees);
		System.out.println("number of employees in tax range 0 to 2 are "+salaryRange[0]);
		System.out.println("number of employees in tax range 2 to 5 are "+salaryRange[1]);
		System.out.println("number of employees in tax range 5 to 10 are "+salaryRange[2]);
		Collection<employee> taxPayers=new ArrayList<employee>();
		taxPayers=getlist(listOfEmployees,10);
		*/
	}

}

