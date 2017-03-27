package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamBufMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte [] inArr ={4,-128,-127,-3,-2,-1,0,1,2,3,11,56,76,126,127};
		byte [] outArr;
		byte [] buf =new byte[7];
		int cnt=0;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		System.out.println(Arrays.toString(inArr));
		System.out.println(Arrays.toString(buf));
		
		cnt =bis.read(buf, 2, 3);
		//param 0 :어디에
		//param 1 :buf의 몇번쨰 부터
		//param 2 : 원본에서 몇개를  ? 가져올까
		//ret     :가져온 갯수
		System.out.println(Arrays.toString(buf));
		
		System.out.println("cnt :"+cnt);
		
		bos.write(buf, 3, 2);
		
		System.out.println(Arrays.toString(bos.toByteArray()));
		
		while (bis.available() > 0) {
			
			try {
				bis.read(buf);
					bos.write(buf);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			outArr=bos.toByteArray();
			System.out.println(cnt);
			System.out.println(Arrays.toString(inArr));
			System.out.println(Arrays.toString(outArr));
			
			

		}
		
		
	
	}

}
