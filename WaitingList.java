import java.util.concurrent.ArrayBlockingQueue;


public class WaitingList {
	
	ArrayBlockingQueue<Toy> waitingList;
	
	public WaitingList(Integer val) {
		this.waitingList = new ArrayBlockingQueue<>(val);
	}

	public void add(Toy item){
		waitingList.add(item);
	}

	public Toy getFirstElement() {
		return waitingList.remove();
	}
}
