

public class ThreadlocalDemo {

	public static void main(String[] args) {
		/*ThreadLocal tl = new ThreadLocal(){
			public Object initialValue(){
				return "h";
			}
		};
		
		System.out.println(tl.get());
		tl.set("dp");
		System.out.println(tl.get());
		tl.set("chauhan");
		System.out.println(tl.get());*/
		
		CustomThread t1= new CustomThread("A");
		CustomThread t2= new CustomThread("B");
		CustomThread t3= new CustomThread("C");
		CustomThread t4= new CustomThread("D");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
