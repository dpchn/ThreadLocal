package ParentChildThreadLocal;

public class ChildThread extends Thread{

	public void run(){
		System.out.println("Child thread "+ ParentThread.tl.get());
		System.out.println("Inheritabel thread local "+ ParentThread.itl.get());
	}
}
