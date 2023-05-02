import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ShopToy
 */
public class ShopToy {
	private List<Toy> toys;

	public ShopToy() {
		this.toys = new ArrayList<>();
	}

	public void addToy(int id, String name, int quantity, int dropoutPercent) {
		Toy toy = new Toy(id, name, quantity, dropoutPercent);
		toys.add(toy);
	}

	public Toy getToy(int id) {
		for (Toy toy : toys) {
			if (toy.getId() == id) {
				return toy;
			}
		}
		return null;
	}

	public Toy selectToy() {
		Random random = new Random();
		int totalWeight = 0;
		for (Toy toy : toys) {
			totalWeight += toy.getDropoutPercent();
		}
		int selectedWeight = random.nextInt(totalWeight);
		int currentWeight = 0;
		for (Toy toy : toys) {
			currentWeight += toy.getDropoutPercent();
			if (selectedWeight < currentWeight) {
				return toy;
			}
		}
		return null;
	}

	public void changeValueToy(Toy item) {
		for (Toy toy : toys) {
			if (toy.getId() == item.getId()) {
				if (toy.getValue() > 1)
					toy.setValue(toy.getValue() - 1);
				else toys.remove(toy);
			}
		}
	}

	public void changePersent(Integer id, Integer dropoutPercent) {
		for (Toy toy : toys) {
			if (toy.getId() == id) {
				toy.setDropoutPercent(dropoutPercent);
				break;
			}
		}
	}

	public Integer length() {
		return toys.size();
	}
}
