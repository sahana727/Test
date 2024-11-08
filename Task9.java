public class Task9{
	public static void main(String[] args) {
		
		int[] arr = {6, 8, 10};
		int maxValue = arr[0];

		int secondMax = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++){

			if(arr[i] > maxValue){

				secondMax = maxValue;
				maxValue =arr[i];
			}

			else if(arr[i] > secondMax && arr[i] !=maxValue){

				secondMax = arr[i];
			}

		}
		
		System.out.println(secondMax);
	}
}