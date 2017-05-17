package codeasylums;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.RangeMap;
import com.google.common.collect.Ranges;
import com.google.common.collect.TreeRangeMap;

public class TaxCalculator {
	
	   Map<Integer, Integer> employeeCountByTax = new HashMap<Integer, Integer>();
	    RangeMap<Integer, Integer> salaryToTaxMap = TreeRangeMap.create();

	    TaxCalculator() {
	        this.employeeCountByTax.put(0, 0);
	        this.employeeCountByTax.put(10, 0);
	        this.employeeCountByTax.put(20, 0);
	        this.employeeCountByTax.put(30, 0);
	        this.salaryToTaxMap.put(Ranges.atMost(2), 0);
	        this.salaryToTaxMap.put(Ranges.openClosed(2, 5), 10);
	        this.salaryToTaxMap.put(Ranges.openClosed(5, 10), 20);
	        this.salaryToTaxMap.put(Ranges.greaterThan(10), 30);
	    }

	int tax(int salary) {

		RangeMap<Integer, Integer> salaryToTaxMapping = TreeRangeMap.create();
		int employeeTax = this.salaryToTaxMap.get(salary);
        this.employeeCountByTax.put(employeeTax, this.employeeCountByTax.get(employeeTax) + 1);
        return employeeTax;
	}

	List<Employee> getEmployeeListByTaxBracket(List<Employee> listOfEmployees, int taxOfEmployee) {
		Multimap<Integer, Employee> taxToEmployeemap = ArrayListMultimap.create();
		for (int i = 0; i < listOfEmployees.size(); i++) {
			int taxPaid = tax(listOfEmployees.get(i).salary);
			taxToEmployeemap.put(taxPaid, listOfEmployees.get(i));
		}
		
		return (List<Employee>) taxToEmployeemap.get(taxOfEmployee);
	}

	 double actualTax(int salary) {
		int percentage = tax(salary);
		return (salary * percentage) / 100f;
	}

 /* int[] number(List<employee> listOfemployees) {
		int[] A = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			if (listOfemployees.get(i).salary < 2) // remove if else
				A[0]++;
			else if (listOfemployees.get(i).salary < 5)
				A[1]++;
			else if (listOfemployees.get(i).salary < 10)
				A[2]++;
		}
		String[] B = { "bracket1", "bracket2", "bracket3" };
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 3; i++) {
			map.put(B[i], A[i]);
		}
		return A;
	}
*/
}
