package ThreadTasks;

class Example extends Thread{
	public void run() {
		System.out.println("Hello, Java!");
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e1 = new Example();
		e1.start();

	}

}
