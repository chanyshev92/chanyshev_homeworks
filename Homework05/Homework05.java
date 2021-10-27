import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {
		int a,test;
		//устанавливаем минимальным максимально возможную цифру-9
		int min=9;

		Scanner scanner=new Scanner(System.in);

		//вводим 1ое число
		System.out.print("New number: ");
		a=scanner.nextInt();

		//пока на вход не придет -1
		while (a!=-1){

			//поразрядно уменьшаем число
			while (a!=0){

				//остаток от деления на 10
				test=a%10;

				//если текущая цифра меньше, то перезаписываем минимум
				if (test<min){
					min=test;
				}

				//уменьшаем a на 1 разряд
				a=a/10;
			}

			//вводим следующее число последовательности
			System.out.print("New number: ");
			a=scanner.nextInt();
			
		}

		//вывод минимальной цифры
		System.out.format("Mindigit: %d",min);
        
    }
	
}
