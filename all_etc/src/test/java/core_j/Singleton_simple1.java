package core_j;

public class Singleton_simple1 {

	private static Singleton_simple1 instance=null;
	 int i=10,j=90;
	private Singleton_simple1(){
		
	}
	public Singleton_simple1 getInstance(){
		if(instance==null){
			instance=new Singleton_simple1();
		}return instance;
	}
	public static void main(String idsfu[]){
		Singleton_simple1 s1,s2;
		s1=new Singleton_simple1();
		s2=new Singleton_simple1();
		instance=s1;
		//instance=s2;
		instance.i=23;
		System.out.println("i in s1 "+instance.i);
		//j+=10;
		System.out.println("i in s2 "+s2.i);
	}
}
