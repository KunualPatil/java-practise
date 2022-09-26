/*
Program:bank program 
author: Kunal Patil
Date: 21sept2022
*/
import 
class statebank
{
	//main method
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		// Creating array 
		Account bank1[]=new Account[3];
		
		/*
		// Constructor injection
		bank1[0]=new Account(1,"kunal",8000);
		bank1[1]=new Account(2,"Samiksha",7000);
		bank1[2]=new Account(3,"tanya",1000);
		bank1[3]=new Account(4,"tejal",500);
		bank1[4]=new Account(5,"mitali",3000);
		  */
		
		
		for(int i=0;i<bank1.length;i++)
		{
			
			int amount=bank1[i].getaccBalance();
		
			if(amount<1000)
			{
				System.out.println("The account name is : "+bank1[i].getAccName());
				
			}  
			
		} // for loop ends
		
	} 
	
}// Bank class ends 