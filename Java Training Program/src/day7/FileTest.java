package day7;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		String words[]=null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			File file = new File("newfile.txt");
			
			bw = new BufferedWriter(new FileWriter(file));
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter your text:");
			
			String mycontent = br.readLine();
			
			bw.write(mycontent);
			
			System.out.println("Enter a word to find in file:");
			String key=br.readLine();
			words=mycontent.split(" ");
			
			int flag=0;
			for(String word:words) {
				if(word.equalsIgnoreCase(key)) flag=1;				
			}
			
			if(flag==1) System.out.println("given word is present in the file");
			else System.out.println("given word is not present in the file");
			bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
