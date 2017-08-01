
public class MyPuppy {
int puppyAge;
	public MyPuppy(String name) {
		System.out.println("Passed name is: " + name);
	}

	
public static void setAge(int age){
	puppyAge = age;
}
	public int getAge() {
	System.out.println("Puppys age is: " + puppyAge);
		return puppyAge;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPuppy puppy = new MyPuppy("Bob");
        puppy.setAge(2);
	puppy.getAge();
        System.out.println("Variable Value :" + puppy.puppyAge);


}

       }
