package array;

public class integer {

	public static void main(String[] args) {
		int i = 100;
		String s1 = i+"";
		String s2 = String.valueOf(s1);
		System.out.println(s2);
		
		Integer i2 = new Integer(i);
		String s4 = i2.toString();
		System.out.println(s4);
		
		String s5 = new Integer(i).toString();
		System.out.println(s5);
		
		String s = "100";
		Integer i3 = new Integer(s);
		int i4 = i3.intValue();
		System.out.println(i4);
	}

}
