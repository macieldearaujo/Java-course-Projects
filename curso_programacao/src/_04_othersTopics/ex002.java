package _04_othersTopics;

public class ex002 {

	public static void main(String[] args) {
		
		String original = "Abcd FGHi ABC abc DEFG     ";
		
		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(2);
		String s5 = original.substring(2, 13);
		int s6 = original.indexOf("bc");
		int s7 = original.lastIndexOf("bc");
		
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase -" + s1 + "-");
		System.out.println("toUpperCase -" + s2 + "-");
		System.out.println("trim -" + s3 + "-");
		System.out.println("substring -" + s4 + "-");
		System.out.println("substring -" + s5 + "-");
		System.out.println("indexOf -" + s6 + "-");
		System.out.println("lastIndexOf -" + s7 + "-");
		
		//
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String v1 = vect[0];
		String v2 = vect[1];
		String v3 = vect[2];
		
		System.out.printf("%s%n%s%n%s%n",v1, v2, v3);
		
		
	}

}
