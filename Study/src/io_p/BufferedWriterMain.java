package io_p;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw;
		try {
			fw = new FileWriter("fff/bbb.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("¿±º∫πÆ ∏ﬁ∑’\n");
		bw.write("√ﬂ¡÷«Â ªÛ√≥πﬁ¡ˆ ∏∂ººø‰\n");
		bw.write("¿”»Ò¡ÿ √µ¿Á\n");
	
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
