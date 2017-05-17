package codeasylums;

public class Employee {
	String name;
	int Id;
	int salary;
	
	Employee(String nameOfEmployee,int employeeId,int employeSalary){
		this.name=nameOfEmployee;
		this.Id=employeeId;
		this.salary=employeSalary;
	}
void setName(String name) {
    this.name = name;
}

void setEmployeeId(int employeeId) {
    this.Id = employeeId;
}

void setSalary(int salary) {
    this.salary = salary;
}

String getName() {
    return this.name;
}

int getEmployeeId() {
    return this.Id;
}
int getSalary(){
	return this.salary;
}
}