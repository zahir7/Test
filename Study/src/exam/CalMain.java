package exam;

import java.util.*;

public class CalMain {
	
	public static void main(String[] args) {
		int su1=1;
		int su2=5;
		int su3=2;
		String key="-";
		int res;
		String qq="10*(40+(30-20))";
		
		HashMap cal = new HashMap();
		
		cal.put("+",su1+su2);
		cal.put("-",su1-su2);
		cal.put("*",su1*su2);
		cal.put("/",su1/su2);
		cal.put("%",su1/su2);
		
		res=(int)cal.get(key);
		
		System.out.println(res);
		
	}
}
