
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[4];
        nums[0] = 2;
        nums[1]=7;
        nums[2]=11;
        nums[3]=15;	    
        //TwoSum t1 = new TwoSum();
		//t1.
		int index[] =new int[2];
		index = output(nums,18);
		for(int i=0;i<index.length;i++)
			System.out.println(index[i]);	 

	       
	    }
		
		public static int[] output(int[] num, int target)
		{
			 int[] index = new int[2];
  
	        for(int i=0;i<num.length;i++)
	        {
	        	for(int j=0;j<num.length;j++)
	        	{
	        		
	        		if (num[i]+num[j]==target)
	        		{
	              			index[0]=j;
	              			index[1]=i;
	        		}
	        		
	              				
	        	}
	        	

	        }
	        return index;
		}
}
