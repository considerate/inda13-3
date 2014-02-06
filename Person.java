public class Person implements Comparable<Person>{
	private int age;
	private String name;

	public int getAge(){
		return this.age;
	}
	 
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	 
	public void setName(String name){
		this.name = name;
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person otherPerson) {
		int otherAge = otherPerson.getAge(); 
		//ascending order
		return this.age - otherAge; 
	}

	public String toString() {
		return this.name+": "+this.age;
	}
}