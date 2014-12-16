import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner
	{
	public static boolean isNegOne = true;
	public static ArrayList<Integer> array = new ArrayList<>();


	public static void main(String[] args)
		{
		inputingArray();
		binarySearch();
		}

	public static void inputingArray()
		{
		
		while (isNegOne == true)
			{
			System.out.println("Input a number between 1 - 20. When you want to stop inter \"-1\".");
			Scanner userInput = new Scanner(System.in);
			int userNumber = userInput.nextInt();
			
			if  (userNumber == -1)
				{
				isNegOne = false;
				}
			if (userNumber>20 || userNumber<-1 || userNumber==0)
				{
				System.out.println("Please inter a valid number");
				}
			
			if (userNumber <= 20 && userNumber >= 1)
				{
				array.add(userNumber);
				} 
			}
		
		
		}

	public static void binarySearch()
		{
		int randomIndex = (int)(Math.random() * array.size());
		int target = array.get(randomIndex);
		
		int counter = 0;
		System.out.print("Index  ");
		for(int i =0; i<array.size(); i++)
			{
			System.out.print(counter + "  ");
			counter++;
			}
		
		
		System.out.print("\n" + "Number ");
		Collections.sort(array);
		for(int i =0; i<array.size(); i++)
			{
			System.out.print(array.get(i) + "  ");
			}
		
		int left = 0;
		int right = array.size() - 1;

		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < array.get(middle))
				{
				right = middle - 1;

				}
			if (target > array.get(middle))
				{
				right = middle + 1;

				} 
			else
				{
				 //middle;
				}

			
			}

		}

	}
