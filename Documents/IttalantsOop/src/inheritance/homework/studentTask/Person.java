package inheritance.homework.studentTask;

public class Person {
	private String name;
	private int age;
	private boolean isMale;
	
	/*
	 * с този коструктор без аргументи, 
	 * можем да създадем конструктори без аргументи и в субкласовете
	 */
	public Person(){
		
	}
	
	public Person(String name, int age, boolean isMale) {
		
		this.setAge(age);
		this.setName(name);
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.println(this);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if(name != null && name.length() > 0){
		this.name = name;
		}else{
			this.name = "Ivan";
		}
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		if(age > 0 && age < 120){
		this.age = age;
		}
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMale=" + isMale  + "]" ;
	}

	public boolean isMale() {
		return isMale;
	}


	
	

}
