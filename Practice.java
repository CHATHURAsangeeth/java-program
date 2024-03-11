import java.util.Random;
import java.util.Scanner;
class Practice{
	public static void main(String[] args){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter a number : ");
	int x= input.nextInt();
	
	int reverse = 0;
	for(int i=x;i>0;)
	{
		
		if(i%10!=0)
		{
		reverse = (reverse*10)+(i%10);
		i=i-(i%10);
		i=i/10;
		
		
		}else{
			reverse=reverse+0;
			i=i/10;
			}
	
			
		}
		System.out.println("reverse number is : "+reverse);
			
			}
		
		}
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
