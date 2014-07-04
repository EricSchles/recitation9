package recitation9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortFruitObject {

	  
		public static void main(String args[]){
	 
			//sorting the fruit objects
			Fruit[] fruits = new Fruit[4];
	 
			Fruit pineappale = new Fruit("Pineapple", "Pineapple description",100); 
			Fruit apple = new Fruit("Apple", "Apple description",70); 
			Fruit orange = new Fruit("Orange", "Orange description",90); 
			Fruit banana = new Fruit("Banana", "Banana description",80); 
	 
	
			pineappale.orderByName();
			apple.orderByName();
			orange.orderByName();
			banana.orderByName();

			
			fruits[0]=pineappale;
			fruits[1]=apple;
			fruits[2]=orange;
			fruits[3]=banana;

			//generic sort - ascending order
			//Arrays.sort(fruits);
			//Arrays.sort(fruits, Fruit.FruitNameComparator);
			//Arrays.sort(fruits, Fruit.FruitQuantityComparator);
			//Arrays.sort(fruits, Fruit.FruitDescriptionComparator);
			
			
//			Arrays.sort(fruits);
//			
//			int i=0;
//			for(Fruit temp: fruits){
//			   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
//				", Quantity : " + temp.getQuantity());
//			}
	 
			//how to sort an array of strings
			String[] strings = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
			 
			Arrays.sort(strings);
			
			int j=0;
			for(String temp: strings){
				System.out.println("fruits " + ++j + " : " + temp); // we do we increment first?
			}
			
			//sort an arraylist
			List<String> list = new ArrayList<String>();
			 
			list.add("Pineapple");
			list.add("Apple");
			list.add("Orange");
			list.add("Banana");
		 
			Collections.sort(list);
		 
			int k=0;
			for(String temp: list){
				System.out.println("fruits " + ++k + " : " + temp);
			}
			
		}	
	}

