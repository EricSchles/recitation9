package recitation9;

import java.util.Comparator;
public class Fruit implements Comparable<Fruit>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;
	private String orderBy;
	
	public Fruit(String fruitName, String fruitDesc, int quantity){
		super(); //calls the super class constructor - in this case Comparable
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
		this.orderBy = "quantity";
	}
	
	
	public void orderByQuantity(){
		this.orderBy = "quantity";
	}
	
	public void orderByName(){
		this.orderBy = "name";
	}
	
	public void orderByDesc(){
		this.orderBy = "description";
	}
	public String getFruitName(){
			return fruitName;
	}
	
	public void setFruitName(String fruitName){
		this.fruitName = fruitName;
	}
	
	public String getFruitDesc(){
		return fruitDesc;
	}
	
	public void setFruitDesc(String fruitDesc){
		this.fruitDesc = fruitDesc;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	public int compareTo(Fruit compareFruit){
		
		if(this.orderBy == "quantity"){
			int compareQuantity = compareFruit.getQuantity();
		
			if(this.quantity < compareQuantity){
				return 1;
			}else if(this.quantity > compareQuantity){
				return -1;
			}else{
				return 0;
			}
		}else if(this.orderBy == "name"){
			return this.fruitName.compareTo(compareFruit.fruitName);
		}else{
			return this.fruitDesc.compareTo(compareFruit.fruitDesc);
		}
		
		}
	

	public static Comparator<Fruit> FruitNameComparator = new Comparator<Fruit>() {

	public int compare(Fruit fruit1, Fruit fruit2) {

		String fruitName1 = fruit1.getFruitName().toUpperCase();
		String fruitName2 = fruit2.getFruitName().toUpperCase();

		//descending order
		return fruitName1.compareTo(fruitName2);

		//ascending order
		//return fruitName2.compareTo(fruitName1);
		}

	};

	public static Comparator<Fruit> FruitQuantityComparator = new Comparator<Fruit>() {

		public int compare(Fruit fruit1, Fruit fruit2) {

			//declare of type integer because we can't compare primitive types
			Integer fruitName1 = fruit1.getQuantity();
			Integer fruitName2 = fruit2.getQuantity();

			//descending order
			//return fruitName1.compareTo(fruitName2);

			//ascending order
			return fruitName2.compareTo(fruitName1);
			}

		};

		public static Comparator<Fruit> FruitDescriptionComparator = new Comparator<Fruit>() {

			public int compare(Fruit fruit1, Fruit fruit2) {

				String fruitName1 = fruit1.getFruitDesc().toUpperCase();
				String fruitName2 = fruit2.getFruitDesc().toUpperCase();

				//descending order
				//return fruitName1.compareTo(fruitName2);

				//ascending order
				return fruitName2.compareTo(fruitName1);
				}

			};


}

