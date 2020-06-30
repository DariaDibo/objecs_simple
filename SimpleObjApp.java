
public class SimpleObjApp {
	
	public static void main(String[] args) {
		
		Student goodStudent = new Student ();
				goodStudent.setProperties(10.0f, (byte)3, true);
		System.out.println("--------------------------------------");
		Student badStudent = new Student();
				badStudent.setProperties(6.8f, (byte)2, false);
		System.out.println("--------------------------------------");
		
				goodStudent.sayAbout();
				System.out.println("--------------------------------------");
				badStudent.sayAbout();
				System.out.println("--------------------------------------");

	}

}

class Student {
	
	float   avgMark;
	byte    grade;
	boolean approved;
	
	void setProperties(float am, byte g, boolean ap) {
		avgMark = am;
		grade = g;
		approved = ap;
		
		if ((am >= 0.01) && (am <= 10.0)) {
			System.out.println("Average mark: " + am);
		} else {
			System.out.println("Invalid average mark!");
		}
		
		if ((g >= 0) && (g <= 5)) {
			System.out.println("Grade: " + g);
		} else {
			System.out.println("Invalid grade!");
		}
	}
	
	void sayAbout() {
		System.out.println("I am a student!");
		System.out.println("I am in the " + grade + " grade!");
		
		if ((avgMark >= 1.0) && (avgMark < 5.0)) {
			System.out.println("I'm a very weak student...I have to repeat the course.");			
		}   else if ((avgMark >= 5.0) && (avgMark < 7)) {
			System.out.println("I can continue studying, but I have to work harder!");
		} else if ((avgMark >= 7.0) && (avgMark < 9.0)) {
			System.out.println("I'm not bad, but I have what to strive for...");
		} else if ((avgMark >= 9.0) && (avgMark < 10.0)) {
			System.out.println("I'm a good student!");
		} else if (avgMark == 10){
			System.out.println("I'm the best student!!!");
		} else {
			System.out.println("The average mark is invalid!");
		}
			
	}
}