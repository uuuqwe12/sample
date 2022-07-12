package L0722;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		// 스피커 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 소리 남.
			try {
				Thread.sleep(800);    // 0.8초 멈췄다가 다시
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
