public class TaskNo2{
	public static void main(String[] args) {
		
		int[] height = {50 , 100 , 200 , 40 , 150};

		int tallest = height[0];
		
		for (int i = 0; i < height.length; i++)
		 { 
			if (height[i] > tallest) 
			{ 
				tallest = height[i]; 
			} 
		} 
		System. out. println(tallest);
	
	}
	
}