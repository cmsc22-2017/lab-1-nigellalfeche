class Person {
	String name;
	int age;
	String gender;
	Address address; 
	
	Person (String name, int age, String gender, Address address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Address{
	String city;
	String state;
	
	Address (String city, String state){
		this.city = city;
		this.state = state;
	}
}

class ExamplePerson{
	ExamplePerson(){}
	
	Address t = new Address ("Warwick", "RI");
	Person tim = new Person ("Tim", 20, "M", t);
	
	Address p = new Address ("Boston", "MA");
	Person pat = new Person ("Pat", 19, "F", p);
	
	Address k = new Address ("Boston", "MA");
	Person kim = new Person ("Kim", 17, "F", k);
	
	Address d = new Address ("Nashua", "NH");
	Person dan = new Person ("Dan", 22, "M", d);
	
	Address n = new Address ("Cebu", "Philippines");
	Person nigell = new Person ("Nigell", 19, "M", n);
	
	Address de = new Address ("Warwick", "RI");
	Person deboy = new Person ("Deb", 20, "F", de);
}
