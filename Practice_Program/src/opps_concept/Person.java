package opps_concept;

//POJO class


	public class Person {
	    private String name;
	    private int age;

	    // Default constructor (optional)
	    public Person() {
	    }

	    // Constructor with parameters (optional)
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter for the name field
	    public String getName() {
	        return name;
	    }

	    // Setter for the name field
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for the age field
	    public int getAge() {
	        return age;
	    }

	    // Setter for the age field
	    public void setAge(int age) {
	        this.age = age;
	    }
	}
