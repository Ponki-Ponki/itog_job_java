import java.util.Scanner;

public class Viev {
	public Integer start(){
		Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество призов:");
		return sc.nextInt();
	}

	void printContext(){
		System.out.println("Вы выйграли игрушку: ");
	}

	public void printPrizToys(Toy item){
		printContext();
		System.out.println("      "+item.toString());
	}


	
}
