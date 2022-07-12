package L0722;
// 스레드 우선순위

class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 200000000; i++) {
			if (i % 100000000 == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Tread: "+getName());
	}
}

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			Thread thread= new CalcThread("Thread-"+i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
