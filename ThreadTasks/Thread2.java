package ThreadTasks;
class Even extends Thread{
	public void run() {
		for(int i = 2;i <= 20;i+=2) {
			System.out.println("Even: " + i);
		}
	}
}
class Odd extends Thread{
	public void run() {
		for(int i = 1;i <= 20;i+=2) {
			System.out.println("Odd: " + i);
		}
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even e = new Even();
		Odd o = new Odd();
		e.start();
		o.start();

	}

}
