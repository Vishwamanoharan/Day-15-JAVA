import java.util.Scanner;
class  Application
{
	static Scanner s=new Scanner(System.in);
	
		static int db_Sid,db_Pwd,db_Age,Studentid;
		static boolean Signed_up=false,repeat=true;
		static  int attempts=0;
	
	public static void main(String[] args)throws Exception 
	{
		System.out.println("\t\tWELCOME TO MY PROJECT");
		System.out.println("1.Qspiders\n2.Jspiders\n3.About Dev");
		int Course=s.nextInt();
		switch (Course)
		{
		case 1:{//qspiders
			System.out.println("1.Skill\n2.Facutly\n3.Syallbus\n4.Exit");
			int Q=s.nextInt();

			switch (Q)
			{
			case 1:{
				System.out.println("Skill: \"MT\"-\"SELINIUM\"");
				break;}
			case 2:{
				System.out.println("Factulty:Harsha sir");
				break;}
			case 3:{
				Syallbus("Here is the syallbus of testing");
				break;}
			case 4:{break;}
			}
		}
		case 2:{//Jspiders

			System.out.println("1.Skill\n2.Faculty\n3.Project\n4.Exit");
			int J = s.nextInt();
			switch (J)
			{
			case 1:{
				System.out.println("Skill:J2SE,J2EE,Web-Tech,Sql");

				break;}
			case 2:{
				System.out.println("Factulities: Tabrez Sir,Bharatha sir,Sathiyaveni mam");

				break;}
			case 3:{
				Project();
				break;}
			case 4:{
				System.out.println("Exit");
				break;}


			
			}

			break;}
		case 3:{
			System.out.println("Kindly select from above options");
			break;}
		
		
	

	
}
	}

	public static void Syallbus(String a){
		System.out.println(a );
		System.out.println("\n1.Black box Testing\n2.White box Testing\n3.Function Testing\n4.System Testing\n5.Smoke Testing\n6.Regression Testing\n7.Performance\n8.Exit\n");
		int Test=s.nextInt();
		switch (Test)
		{
		case 1:{
			System.out.println("Testing a system with no prior knowledge of its internal working");
			break;}
		case 2:{
			System.out.println("A form of applicaton testing that provides the tester with complete knowledge of the application being tested,including acess to the source code and design documents ");

			break;}
		case 3:{
			System.out.println("A type of testing that seeks to establish whether each application feature works as per software requirnment");
			break;}
		case 4:{
			System.out.println("The process in which a quality assurance team evaluates how various comppontents of an application interact together in the full,integrated system");

			break;}
		case 5:{
			System.out.println("A software testing method that is used to determine if a new software bulid is ready for the next testing phase");
			break;}
		case 6:{
			System.out.println("A type of software testing that is used to verify any modification or update in a software without affecting the overall working functionality of the said software ");

			break;}
		case 7:{
			System.out.println("A non-funtional software testing technique that determines how the stability,speed,scalability and responsiveness of an  applicaton holds up under a given workload ");
			break;}
		
			case 8:{
			System.out.println("Exit");
			break;}
		
		}
	}

	public static void Project()throws Exception{
		
		do
		{
			System.out.println("1.Sign-Up\n2.Log-In\n3.Forgotten Pwd\n4.Exit");
		int User_in=s.nextInt();

		switch (User_in)
		{
		case 1:{
			System.out.println("Enter the student id:");
	        db_Sid=s.nextInt();
			System.out.println("Enter the Pwd");
		    db_Pwd=s.nextInt();
			System.out.println("Enter the Age");
			db_Age=s.nextInt();
			Signed_up=true;
			System.out.println("Successfully Signed Up");
			break;}
		case 2:{
			if(Signed_up==false){
					attempts++;
					if (attempts==1)
					{
					System.out.println("Only 2 attempt left");
					}
					else if (attempts==2)
					{
					System.out.println("Only 1 attempt left");
					}
					else if (attempts==3)
					{
					System.out.println("Kindly Sign_up and log_in");
					repeat =false;
					}
		
			}
			else if(Signed_up==true){

				System.out.println("Enter the Student id");
				int Studentid1=s.nextInt();
				System.out.println("Enter the PassWord:");
				int Password=s.nextInt();
				if (db_Sid==Studentid1 && db_Pwd==Password)
				{
					double res=Math.random()*9999+9999;
				    int gen_otp=(int)res;
					System.out.println("Your otp is here: "+gen_otp);
					System.out.println("Enter the userotp");
				     int uotp=s.nextInt();
					
				if (gen_otp==uotp)
				{
					
						System.out.println("Welcome to our programs\n");
					System.out.println("1.Number Programming\n2.Pattern Programming\n3.Recursion\n4.Exit\n");
					int P=s.nextInt();
					switch (P)
					{
						
						case 1:{
							NumberProgramming();
							break;}
						case 2:{
							PatternProgramming();
							break;}
						case 3:{
							System.out.println("1.Factorial Program\n2.Fibbinoci series\n3.Print 1to5");
							int R=s.nextInt();
							switch(R){
								case 1:{
									F.FA();
									break;}
								case 2:{
									Fi.Fib();
									break;}
								case 3:{
									Recursion.Re();
									break;}
							}
							break;}
						case 4:{
							System.out.println("Kindly select from above Programs");
							break;}
						}
					
					
				}
					
					
				}
				else{
					System.out.println("Kindly enter ur Correct Student id and PassWord");
				}
				
				
			}



			
			break;}
		case 3:{
			if(db_Sid==Studentid){
				double ge=Math.random()*9999+9999;
				int geotp=(int)ge;
				System.out.println("Your otp: "+geotp);
				System.out.println("Enter an otp");
				int usotp=s.nextInt();
				if (usotp==geotp)
				{
					System.out.println("Enter your new Student id");
					int Stdid=s.nextInt();
					System.out.println("Enter your new PassWord");
					int Pwd1=s.nextInt();
				}

			}

			//forgotten Pwd
			break;}
		case 4:{
			System.out.println("Kindly select from above method");
			//Exit
			break;}
		

		}
	
		}
		while (repeat);
	}
		

	

	public static void PatternProgramming(){

		System.out.println("1.Square\n2.Backward increasing\n3.Backward decreasing\n4.Forward increasing\n5.Shape of sandclock\n");
		int P1=s.nextInt();
		switch (P1)
		{
		case 1:{
			System.out.println("Enter a n");
		int n=s.nextInt();
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0||j==0||i==n-1||j==n-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			break;}
		case 2:{
			System.out.println("Enter a num");
			int n=s.nextInt();
			for (int i=0;i<n ;i++ )
			{
				for (int j=0;j<n ;j++ )
				{
					if (i>=j)
					{
						System.out.print(i);
					}
					else{
						System.out.print("");
					}
				}
				System.out.println();
			}
			break;}
		case 3:{
			System.out.println("Enter a num");
			int n=s.nextInt();
			char ch='A';

			for (int i=0;i<n ;i++ )
			{
				for (int j=0;j<n ;j++ )
				{
					if(i<=j){
						System.out.print(ch++);
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
				ch='A';
			}



			break;}
		case 4:{
			System.out.println("Enter a num");
			int n=s.nextInt();
			int num=1;
			for (int i=0;i<n ;i++ )
			{
				for (int j=0;j<n ;j++ )
				{
					if (i+j>=n-1)
					{
						System.out.print(num++);
						if(num==4){
							num=1;
						}
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();

			}

			break;}
		case 5:{
			System.out.println("Enter a num");
		int n=s.nextInt();

		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i>=j && i+j<n-1 || i<=j && i+j>n-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

			break;}
		
		}
		
	}

	public static void NumberProgramming(){
		System.out.println("Welcome to NumberProgramming");
		System.out.println("1.Factorial\n2.Xylem numbers\n3.Sum of first and last\n4.Strong number`\n5.Power number\n6.ArmStrong number\n");
		int NP=s.nextInt();
		switch (NP)
		{
		case 1:{
			System.out.println("Enter a num");
			int num=s.nextInt();
			int fact=1;
			for (int i=1;i<num ;i++ )
			{
				fact=fact*i;
			}
			System.out.println(fact);

			break;}
		case 2:{
			System.out.println("Enter a num");
			int num=s.nextInt();
			int last=num%10;
			int m_sum=0;
			num/=10;
			while (num>9)
			{
				m_sum+=num%10;
				num/=10;
			}
			if (m_sum==(num+last))
			{
				System.out.println("Xylem numbers");
			}
			else{
				System.out.println("Not a Xylem numbers");
			}

			break;}
		case 3:{
			System.out.println("Enter a Num");
			int num=s.nextInt();
			int last=num%10;
			while (num>9)
			{
				num/=10;
			}
			int total=num+last;
			System.out.println("The sum of First and Last is: "+total);
			break;}
		case 4:{
			System.out.println("Enter the Num");
			int num=s.nextInt();
			int last=0,sum=0,temp=num,fact=1;

			while (num>0)
			{
				last=num%10;

				for (int i=1;i<=last ;i++ )
				{
					fact=fact*i;
				}
				sum=sum+fact;
				num/=10;
				fact=1;
			}

			if (temp==sum)
			{
				System.out.println("This is Strong number");
			}
			else{
				System.out.println("This is not  Strong number");
			}
			break;}
		case 5:{
			System.out.println("Enter a number");
			int num=s.nextInt();
			System.out.println("Enter a Power");
			int Power=s.nextInt();
			int product=1;
			for (int i=1;i<Power ;i++ )
			{
				product*=num;
			}

			
			break;}
		case 6:{
			System.out.println("Enter a num");
			int num=s.nextInt();
			int last=0,product=1,sum=0,temp=num,count=0;

			while (num>0)
			{
				num/=10;
				count++;

			}
			System.out.println("Number of count: "+count);
			num=temp;

			while (num>0)
			{
				last=num%10;
				for (int i=1;i<=count ;i++ )
				{
					product*=last;
				}
				sum+=product;
				product=1;
				num/=10;

			}
			String res=(temp==sum)?"Armstrong":"Not Armstrong";
			System.out.println(res);

			break;}
		
		}

		
	}
}
class F 
{
	


	static Scanner s=new Scanner(System.in);
	static int num,fact=1;
	
	public static void FA(){
		System.out.println("Enter the number");
		int num=s.nextInt();
		int res=factorial(num);
		System.out.println("The factorial of the"+num+"is:"+res);
	}
	public static int factorial(int a){
		if (a>=2)
		{
			fact*=a--;
			factorial(a);
		}
		return fact;
	}


}

class Fi 
{
	static Scanner s=new Scanner(System.in);
	static int n1=0,n2=1,n3,series=3;
	public static void Fib() 
	{
		System.out.println(n1+" "+n2+" ");
		fibonacci();
	}
	public static void fibonacci(){
		if (series<=10)
		{
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
			series++;
			fibonacci();
		}
	}
}
class Recursion 
{
	static int i=1;
	
	public static void Re() 
	{
		PrintNumber();
	}
	public static void PrintNumber(){
		if (i<=5)
		{
			System.out.println(i);
			i++;
			PrintNumber();
		}
	}
}

