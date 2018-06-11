package inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void main(String[] args) {
		// 경로가 없을 경우 default는 해당 프로젝트 디렉토리에서 찾는다.
		String readFile = "readFile.txt";
		String writeFile = "writeFile.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(readFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
		) {
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				bw.write(line + "\n");
//				System.out.println(line);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
