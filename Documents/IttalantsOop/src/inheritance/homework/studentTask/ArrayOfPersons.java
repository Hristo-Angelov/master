package inheritance.homework.studentTask;

import java.util.Scanner;

public class ArrayOfPersons {

	private static final int SIZE_OF_ARRAY = 10;
	private final int INDEX_OF_PERSONS = 2;
	private final int INDEX_OF_STUDENTS = 4;
	private final int INDEX_OF_EMPLOYEES = 6;
	private final int HOURS_OVERTIME = 2;

	private Person[] arrayOfPersons;
	Scanner sc = new Scanner(System.in);

	public ArrayOfPersons() {

		this.arrayOfPersons = this.generateArrOfPersons();
		this.arrayOfPersons = fillArr();

	}

	private Person[] generateArrOfPersons() {
		return new Person[SIZE_OF_ARRAY];
	}

	private Person[] fillArr() {
		int count = 0;
		this.generateArrOfPersons();
		for (int index = 0; index < arrayOfPersons.length; index++) {
			count++;
			if (count <= INDEX_OF_PERSONS) {
				this.arrayOfPersons[index] = new Person("person", 30, false);
			} else {
				if (count > INDEX_OF_PERSONS && count <= INDEX_OF_STUDENTS) {

					this.arrayOfPersons[index] = new Student("student", 23, true, 4.50f);
				} else {
					if (count > INDEX_OF_STUDENTS && count <= INDEX_OF_EMPLOYEES) {

						this.arrayOfPersons[index] = new Employee("employee", 16, false, 80);
					}
				}

			}
		}
		return this.arrayOfPersons;
	}

	public void printInfo() {
		for (int index = 0; index < arrayOfPersons.length; index++) {
			if (arrayOfPersons[index] != null) {
				System.out.println(arrayOfPersons[index]);
			}

		}
	}

	public void priceForOvertimeLabour() {
		Employee ivan = new Employee();
		for (Person arrayOfPerson : this.arrayOfPersons) {
			if (arrayOfPerson != null) {
				if (arrayOfPerson.getClass().toString().equals(ivan.getClass().toString())) {
					System.out.println(arrayOfPerson);
					System.out.println("payment for 2 hours overtime: "
							+ ((Employee) arrayOfPerson).getForOneHourOvertime() * HOURS_OVERTIME);

				}
			}

		}

	}
}
