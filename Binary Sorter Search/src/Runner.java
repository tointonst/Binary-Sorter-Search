import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner
	{
	public static boolean isNegOne = true;
	public static ArrayList<Integer> array = new ArrayList();
	


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
			System.out.print(counter + "\t");
			counter++;
			}
		
		
		System.out.print("\n" + "Number ");
		Collections.sort(array);
		for(int i =0; i<array.size(); i++)
			{
			System.out.print(array.get(i) + "\t");
			}
		
		System.out.println("Target : Number " + target);
		
		int missCounter =0;
		int corrCounter =0;
		int counterPass = 1;
		int left = 0;
		int right = array.size() - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			
			
			System.out.println("");
			System.out.println("Pass # " + counterPass);
			
			System.out.println("What is left?");
			Scanner userInput = new Scanner(System.in);
			int userleft = userInput.nextInt();	
				if (userleft== left)
				{
				System.out.println("Correct");
				corrCounter++;
				}
				else
				{
				System.out.println("Sorry the right answer is " + left);
				missCounter++;
				}
				
				System.out.println("What is right?");
				Scanner userInput2 = new Scanner(System.in);
				int userRight = userInput2.nextInt();	
					if (userRight== right)
					{
					System.out.println("Correct");
					corrCounter++;
					}
					else
					{
					System.out.println("Sorry the right answer is " + right);
					missCounter++;
					}
					
					System.out.println("What is the middle?");
					Scanner userInput3 = new Scanner(System.in);
					int userMiddle = userInput3.nextInt();	
						if (userMiddle== middle)
						{
						System.out.println("Correct");
						corrCounter++;
						}
						else
						{
						System.out.println("Sorry the right answer is " + middle);
						missCounter++;
						}
						
						System.out.println("What is the array[middle]?");
						Scanner userInput4 = new Scanner(System.in);
						int userArrayMid = userInput4.nextInt();	
							if (userArrayMid == array.get(middle))
							{
							System.out.println("Correct");
							corrCounter++;
							}
							else
							{
							System.out.println("Sorry the right answer is " + array.get(middle));
							missCounter++;
							}
			if (array.get(middle) == target)
			{
				break;
			}
			if (target < array.get(middle))
				{
				right = middle - 1;

				}
			if (target > array.get(middle))
				{
				left = middle + 1;

				} 
			counterPass++;
			}
		System.out.println("You got " + corrCounter + " right and " + missCounter + " wrong.");
		
		}

	}

	
