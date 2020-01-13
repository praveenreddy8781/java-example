
package j64concurrencyutils;

import java.util.concurrent.Exchanger;

public class Prog5Exchange {

	public static void main(String[] args) {
		Exchanger<String> exgr = new Exchanger<String>();

		new Thread(new UseString(exgr)).start();
		new Thread(new MakeString(exgr)).start();
	}
}

class MakeString implements Runnable {
	Exchanger<String> ex;
	String str;

	public MakeString(Exchanger<String> c) {
		ex = c;
		str = new String();
	}

	@Override
	public void run() {
		char ch = 'A';

//		Fill buffer
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++)
				str += ch++;
			try {
				str = ex.exchange(str);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}

class UseString implements Runnable {

	Exchanger<String> ex;
	String str;

	public UseString(Exchanger<String> ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				str = ex.exchange(new String());
				System.out.println("Got: " + str);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}