import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;

public class test {

	/**
	 * @param args
	 */
	public static String testMeth() {
		String rt;
		try {
			// read file
			FileReader data = new FileReader("/home/k/workspace/0favTweetBot/test.csv");
			System.out.println("0");
			BufferedReader br = new BufferedReader(data);
			// deal with data as line
			String line;
			StringTokenizer token;
			Random rnd = new Random();
			
			
			
			// size of rows
			int sz = 0;
			while ((line = br.readLine()) != null) {
				// separation sign is comma
				sz = sz + 1;
				System.out.println(sz);
			}
									
			int i = rnd.nextInt(sz)	+ 1;
			System.out.println(i);
			
			//ここまでOK
			//うまくいかないっぽいので http://kei0310.info/?p=240 をみて，書きなおすこと．
			line = br.readLine();
			System.out.println(line);
			while (line != null) {
				// separation sign is comma
				System.out.print("in!");
				token = new StringTokenizer(line,",");
				if (token.nextToken().equals("3")) {/*String.valueOf(sz))) {*/
					rt = (token.nextToken() + token.nextToken());
					System.out.println(rt);
				}
			}
			data.close();
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		// TODO 自動生成されたメソッド・スタブ
		return "dead";
	}

		public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print(testMeth());
	}
	
}
