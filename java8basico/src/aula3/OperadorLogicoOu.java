package aula3;

public class OperadorLogicoOu {

	public static void main(String[] args) {
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		
		boolean s;
		
		s = (x<y || y==z)?true:false;
		
		System.out.println(s);

	}

}
