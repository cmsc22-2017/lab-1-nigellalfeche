interface IMenu {
	
	class soup implements IMenu{
		item info;
		String kind;
		
			soup(item info, String kind){
				this.info = info;
				this.kind = kind;
			}
		
	}
	
	class salad implements IMenu{
		item info;
		String kind;
		String dressing;
		
		salad(item info, String kind, String dressing){
			this.info = info;
			this.kind = kind;
			this.dressing = dressing;
		}
		
	}
	
	class sandwich implements IMenu{
		item info;
		String kindOfBread;
		String fillings;
			
			sandwich (item info, String kindOfBread, String fillings){
				this.info = info;
				this.kindOfBread = kindOfBread;
				this.fillings = fillings;
			}
		
	}
	
	class item{
		String name;
		int price;
		
		item (String name, int price){
			this.name = name;
			this.price = price;
		}
	}
	
	class ExampleOfEach{
		ExampleOfEach(){}
		
		item c = new item ("Carrot Soup", 50);
		IMenu ca = new soup (c, "Vegetarian");
		item c1 = new item ("Vegetable Soup", 50);
		IMenu ca1 = new soup (c1, "Vegetarian");
		
		item s = new item ("Fruit Salad", 70);
		IMenu sa = new salad (s, "Vegetarian", "cocktail");
		item s1 = new item ("Fruit salad", 70);
		IMenu sa1 = new salad (s1, "Vegetarian", "cocktail");
		
		item san = new item ("Bacon sandwich", 15);
		IMenu sand = new sandwich (san, "Wheat bread", "Jelly");
		item san1 = new item ("Cheese sandwich", 15);
		IMenu sannd1 = new sandwich (san1, "Wheat bread", "Peanut Butter");
	}
}
