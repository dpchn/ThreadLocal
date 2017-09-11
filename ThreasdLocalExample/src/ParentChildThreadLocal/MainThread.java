package ParentChildThreadLocal;

public class MainThread {
	public static void main(String[] args) {
		
	
		ParentThread parentThread = new ParentThread();
		parentThread.start();
	}

}
