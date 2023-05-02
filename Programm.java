import java.io.FileNotFoundException;

public class Programm {
	public static void main(String[] args) throws FileNotFoundException {
		ShopToy shop = new ShopToy();
		shop.addToy(1, "test", 10, 20);
		shop.addToy(2, "test1", 10, 25);
		shop.addToy(3, "test2", 10, 30);
		shop.addToy(4, "test3", 10, 35);
		shop.addToy(5, "test4", 10, 40);
		shop.addToy(6, "test5", 10, 45);
		shop.addToy(7, "test6", 10, 50);
		shop.addToy(8, "test7", 10, 60);
		shop.addToy(9, "test8", 10, 70);
		shop.addToy(10, "test9", 10, 10);

		Viev v = new Viev();
		Integer val = v.start();

		WaitingList wList = new WaitingList(val);
		WriterAdd wr = new WriterAdd("data.txt");
		for (int i = 0; i < val; i++) {
			wList.add(shop.selectToy());
		}
		Toy prize;
		for (int i = 0; i < val; i++) {
			prize = wList.getFirstElement();
			v.printPrizToys(prize);
			shop.changeValueToy(prize);
			wr.saveData(prize);
		}
	}
}
