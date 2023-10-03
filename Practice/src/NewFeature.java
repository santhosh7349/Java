
public class NewFeature {
	public static void main(String[] args) {
		var a=10;
		System.out.println(a);
		//System.out.println(a.getClass());//cannot be used on primitive datatype
		
		var b="Santhosh";
		System.out.println(b);
		System.out.println(b.getClass());
		
		//var s;//without initializing var cannot be used
		
		var c=3.147;
		System.out.println(c);
		//System.out.println(c.getClass());//cannot be used on primitive datatype
		
		//a=3.14;//it shows type mismatch error
	}

}
