package ParentChildThreadLocal;

public class ParentThread extends Thread {

	public static ThreadLocal tl = new ThreadLocal();
	public static InheritableThreadLocal itl = new InheritableThreadLocal(){
		public Object childValue(Object p){
			return "inheritable child";
		}
	};
	
	public void run(){
		tl.set("dp");
		itl.set("pp");
		System.out.println(tl.get());
		System.out.println(itl.get());
		ChildThread c = new ChildThread();
		c.start();
		
	}
}
