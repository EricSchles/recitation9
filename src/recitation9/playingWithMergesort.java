package recitation9;

public class playingWithMergesort {

	public static void main(String[] args){
		
		Mergesort sorter = new Mergesort();
		int[] numbers = {5,9,18,256,12,12712,61354,6,7,1234,235,6,1,34,27,5771,3,46,71};
		sorter.sort(numbers);
		for(int i = 0;i<numbers.length;i++)
			System.out.println(numbers[i]);
	}
}
