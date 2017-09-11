

public class CustomThread extends Thread{
	
	 static int id=0;
	ThreadLocal tl = new ThreadLocal(){
		public Object initialValue(){
			return ++id;
		}
	};
	
	public CustomThread(String name) {
		 super(name);
	}
	
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+" executing "+tl.get());
	}

}
