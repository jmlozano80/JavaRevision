package threads;

public class MainCountThreads {

	public static void main(String[] args) {
		CountDownThread cdt = new CountDownThread();

		Thread cd = new Thread(cdt);

		try {
			cd.start();
			Thread.sleep(5000);
			cdt.setFinished(true);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Thread cu=new Thread(new CountUpThread());
	// cd.start();
	// cu.start();
	// CountDownThread down=new CountDownThread();

}
