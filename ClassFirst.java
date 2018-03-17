import java.util.Scanner;

public class ClassFirst {

	public static void main(String[] args) 
	{
		//int[] nums = new int[] {1,2,4,10,5,8,9};
		int nums[] = new int[10];
		for(int i = 0; i < nums.length; i++) {
			Scanner in = new Scanner(System.in);
		    System.out.print("Enter some number: ");
			nums[i] = in.nextInt();
			System.out.println("Your input is: " + nums[i]);
		    //System.out.print(nums[i] +);
		}
		System.out.print("Default mass: \n");
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i] + ". ");	
		}
		System.out.print("\n");
		int sum = 0;
		double central;
		
		for(int j=0; j<nums.length; j++)
		{
			sum+=nums[j];
	        if (nums[j]%2==0)
			{
	        	nums[j]*=-1;
			}
	        else if (nums[j]%2==1)
	        {
	        	nums[j]+=1;
	        }
		}
		System.out.println("Sum all elements: \n" + sum);
		central = sum / 7.0;
		System.out.println("Arithmetic average: \n" + central);
		System.out.println("Mass elements transformed: ");
		bubbleSort(nums);
		for(int i=0; i<nums.length; i++)
		{
			System.out.print(nums[i] + ". ");
		}
	}
	public static void bubbleSort(int[] nums){  
	    for(int i = nums.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){

	            if( nums[j] > nums[j+1] ){
	                int tmp = nums[j];
	                nums[j] = nums[j+1];
	                nums[j+1] = tmp;
	            }
	        }
	    }
	}
}

