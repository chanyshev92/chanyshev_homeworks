import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
		int a,test;
		int min=9;
		Scanner scanner=new Scanner(System.in);
		System.out.print("New number: ");
		a=scanner.nextInt();
		while (a!=-1){
			while (a!=0){
				test=a%10;
				if (test<min) min=test;
				a=a/10;
			}
			System.out.print("New number: ");
			a=scanner.nextInt();
			
		}
		System.out.format("Mindigit: %d",min);
        
    }
	
}
