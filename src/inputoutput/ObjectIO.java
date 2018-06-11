package inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class ObjectIO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	int num;
	String str;
	int[] ary;

	public static void main(String[] args) {
		String writeFile = "objectOutputFile.txt";
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(writeFile));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(writeFile)); ){
				
			ObjectIO obj = new ObjectIO();
			obj.num = 10;
			obj.str = "test";
			obj.ary = new int[] {1, 2, 3};
			oos.writeObject(obj);
			
			ObjectIO obj2 = (ObjectIO)ois.readObject();
			System.out.println(obj2.num);
			System.out.println(obj2.str);
			System.out.println(Arrays.toString(obj2.ary));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
