package inheritance.homework.studentTask;

public class Employee extends Person {

	private int daySalary;
	private final int NORMAL_WORKING_HOURS = 7;
	private final float COEF_TO_INCREACE_FOR_OVERTIME = 1.5F;
	private final int DEFAULT_DAY_SALARY = 150;
	private final int YEARS_NEEDED_TO_REACH_THE_COEF = 18; 
	
	public Employee(){
		
	}

	public Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);

	}
	
	public void showEmpoyeeInfo(){
		System.out.println(this);
	}

	public float totalPaymentForTheDay(int workingHoursForTheDay) {

		if (workingHoursForTheDay > NORMAL_WORKING_HOURS) {
			int overtimeHours = workingHoursForTheDay - NORMAL_WORKING_HOURS;
			return this.getForOneHourOvertime() * overtimeHours + daySalary;
		} else {
			return daySalary;
		}
	}

	public float getForOneHourOvertime() {
		if (this.getAge() >= YEARS_NEEDED_TO_REACH_THE_COEF) {

			return (daySalary / NORMAL_WORKING_HOURS * COEF_TO_INCREACE_FOR_OVERTIME);
		} else {
			return (daySalary / NORMAL_WORKING_HOURS);
		}
	}

	private void setDaySalary(int daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = DEFAULT_DAY_SALARY;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Employee [daySalary=" + daySalary + "]";
	}
	

	public int getDaySalary() {
		return daySalary;
	}
	

}
