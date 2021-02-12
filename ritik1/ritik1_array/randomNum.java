package ritik1_array;
import java.util.Scanner;
import java.util.Random;

public class randomNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Random random=new Random();
		int ranNumb=random.nextInt(99) + 1;
		int count=0;
		System.out.println("please enter number from 1 to 99......You only have 10 chances:");
		while(count<10) {
			int input=sc.nextInt();
			if (input==ranNumb) {
				System.out.println("Lucky hah!! The numbe is:" + ranNumb );
				break;
			}
			else if (input <ranNumb) {
				System.out.println("guess value is smaller........            " + Math.abs(count - 9)+ "tries left");
			}
			else if (input <ranNumb) {
				System.out.println("guess value is greater.......           " + Math.abs(count - 9)+ "tries left");
				
			}
			count++;
		}
	}


}
