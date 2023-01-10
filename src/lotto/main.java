package lotto;

public class main {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			arr[i] = num;
		}
		
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {	
			System.out.println("arr[" + (i+1) + "] = " + arr[i]);
		}
		
	}	

}
