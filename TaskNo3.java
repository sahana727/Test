public class TaskNo3{
	 public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 3, 5 ,6};

        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                
                int sum = arr[i] + arr[j];
               
                System.out.println("Sum of two element is: " + sum);
                
                return; 
            }
        }
    }
}
