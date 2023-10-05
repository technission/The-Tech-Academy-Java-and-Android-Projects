package dog_class;

public class Dog {
	String dogBreed = "Hound";
	String dogColor = "Brown";
	String dogHeight = "2 feet";
	String dogWeight = "60 pounds";
	
	public void Shake() {
		System.out.println("Shake");
	}
	
	public void Sit() {
		System.out.println("Sit");
	}
	
	public void Lay_Down() {
		System.out.println("Lay Down");
	}

	public static void main(String[] args) {
		/*Object Creating*/
		Dog myDog = new Dog();
	System.out.println(myDog.dogBreed);
	System.out.println(myDog.dogColor);
	System.out.println(myDog.dogHeight);
	System.out.println(myDog.dogWeight);
	myDog.Shake();
	myDog.Sit();
	myDog.Lay_Down();
	
	}

	
	
	

}
