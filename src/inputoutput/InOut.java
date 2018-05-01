package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InOut {

	public static void main(String[] args) {
		// byte 단위
//		InputStream is;
//		OutputStream os;
		
		/*
		// char 단위 
		// input
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		// output
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		
		try {
			String input = br.readLine();
			bw.write(input);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(is != null) {
					is.close();
				}
				
				if(bw != null) {
					bw.close();
				}
				if(os != null) {
					os.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}*/
		
		
		// try with resource
		try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
			){
			String input = br2.readLine();
			int input2 = Integer.parseInt(br2.readLine());
			
			bw2.write(input + "\n");
			
			// string 형태로 출력해야 제대로된 숫자값이 나옴
			// parameter가 int인 write()를 호출하면 입력한 숫자를 아스키코드로 인식해서 출력
			bw2.write(input2 + "\n");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
