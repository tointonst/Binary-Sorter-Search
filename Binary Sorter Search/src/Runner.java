
public class Runner {

	public static void main(String[] args) {
		
		int left = 0;
		int right = array.size() -1;
		
		while(left<=right)
		{
			int middle = (left + right)/2;
			if(target < array[middle])
			{
				right = middle - 1;
				
			}
			if(target > array[middle])
			{
				right = middle + 1;
				
			}
			else 
			{
				return middle;
			}
			
			return -1;
			//dddd
			
		}

	}

}
