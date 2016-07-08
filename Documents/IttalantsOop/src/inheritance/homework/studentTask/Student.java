package inheritance.homework.studentTask;

public class Student extends Person {
	private float score;

	public Student(String name, int age, boolean isMale, float score) {
		super(name, age, isMale);
		this.setScore(score);

	}
	
	
	/*И един въпрос, какво ще стане ако дефинирате конструктор без
	  параметри Student() в класа Student ??? Възможно ли е, и ако не защо.
	  Как може да се оправи това?
	  
	 *Или трябва да направим конструктор без аргументи в super() класа,
	 * или да зададем стойности в конструктора на аргументите подадени  super(тук);
	 */
	
	public Student(){
//		super("Ivan", 22, true);
	}

	public void setScore(float score) {
		if (score >= 2.0 && score <= 6.0) {
			this.score = score;
		}else{
			this.score = 2.0f;
		}
	}

	public void showStudentInfo() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Student [name =" + getName() + ", age =" + getAge() + ", isMale = " + isMale() + ", score = "
				+ this.score + "]";
	}

}
