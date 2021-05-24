package ex07_jdbc;

//dto:데이터를 담아서 옮기는 목적
public class EmployeesDTO {
	private int employee_id;
	private String first_name;
	private String hire_date;
	private int salary;
	public EmployeesDTO() {
		super();
	}
	public EmployeesDTO(int employee_id, String first_name, String hire_date, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.salary = salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeesDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", hire_date=" + hire_date
				+ ", salary=" + salary + "]";
	}
	
}
