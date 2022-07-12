package L0722;

import java.awt.Toolkit;

public class BeepWorkerThread extends Thread {

	public void run() {
		// 스피커 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}