interface IAT {}
	
class Person implements IAT{
	IAT mom;
	IAT dad;
	String name;
		
	Person (IAT mom, IAT dad, String name){
		this.mom = mom;
		this.dad = dad;
		this.name = name;
	}
}
	
class Unknown implements IAT{
	Unknown(){}
}
	
class ExampleIAT{
	ExampleIAT(){}
		
	IAT unknown = new Unknown();
	IAT tatay = new Person (unknown, unknown, "Domeng");
	IAT nanay = new Person (unknown, unknown, "Cerel");
	IAT lolo = new Person (unknown, unknown, "Supriano");
	IAT lola = new Person (unknown, unknown, "Dionesia");
	IAT papa = new Person (nanay, tatay, "Sano");
	IAT mama = new Person (lola, lolo, "Delyn");
	IAT me = new Person (mama, papa, "Nigell");
		
}