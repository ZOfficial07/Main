
public class Pig {

	public static void main(String[] args) {
		long x =0;
		long y =0;
		long count =0;
		int count2 =0;
		final double multi = 1;
	while(x<10000) {
		x = Math.round(Math.random()*multi)- Math.round(Math.random()*multi);
		y = Math.round(Math.random()*multi)- Math.round(Math.random()*multi);
		System.out.println("x:" + x);
		if((y*y) + (x*x) ==1*multi)
			count2++;
		count++;
		System.out.println("                                                      Pi:" + (Double.valueOf(count2)/Double.valueOf(count))*4*multi);
		System.out.println("Value count: " + count2);
		System.out.println("                                Number:" + count);
	}
	
	System.out.println("");
	System.out.println("                                                      Pi:" + (Double.valueOf(count2)/Double.valueOf(count))*4);
	}}

