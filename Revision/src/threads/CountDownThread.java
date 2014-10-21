package threads;

public class CountDownThread implements Runnable {

	boolean finished = false;

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public void run() {

		for (int i = 1000000; i > 0; i--) {
			if (finished) break;
			System.out.println("Count Down :\t" + i);

		}
	}

}
