import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Random;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.PlainDocument;
public class test {
	private String filename;
	/**
	 * @param args
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	// get file size
	public static int getFileSize() {
		int sz = 0;
		try {
			// read file
			FileReader data = new FileReader("/home/k/workspace/0favTweetBot/test.csv");
			BufferedReader br = new BufferedReader(data);
			// deal with data as line
			String line;
			StringTokenizer token;
			Random rnd = new Random();
			// size of rows
			while ((line = br.readLine()) != null) {
				// separation sign is comma
				sz = sz + 1;
			}
			data.close();
		} catch (Exception e) {
			// TODO: handle exception
			return 0 ;
		}		
		return sz;
	}
	

	public List<List<String>> readFile() {
		
		// input check
		if(this.filename == null){
			return null;		
		}
		List<List<String>> retBox = new ArrayList<List<String>>();
		
		File csv = new File(filename);
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(csv));
            String line = "";
            int idx = 0;
            while ((line = br.readLine()) != null) {
 
                // 1行をデータの要素に分割
                StringTokenizer st = new StringTokenizer(line, ",");
 
                // 1行を格納する箱作成
                List<String> tmpList = new ArrayList<String>();
 
                while (st.hasMoreTokens()) {
 
                    String str = st.nextToken().trim();
                    // 1行の各要素を格納
                    tmpList.add(str);
 
                }
 
                // 返却用リストに1行データを格納
                retBox.add(tmpList);
                idx++;
 
                // numを超えたら読み込み終了。numが0のときは全量読む。
                if( getFileSize() != 0 && idx > getFileSize() ){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        return retBox;
    }



			
			
			/*
			int i = rnd.nextInt(sz)	+ 1;
			System.out.println(i);
		
			
		}
		
		
		
		String rt;
		
		
			
			//ここまでOK
			//うまくいかないっぽいので http://kei0310.info/?p=240 をみて，書きなおすこと．
			line = br.readLine();
			System.out.println(line);
			while (line != null) {
				// separation sign is comma
				System.out.print("in!");
				token = new StringTokenizer(line,",");
				if (token.nextToken().equals("3")) { 
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
	}  */

		public static List<List<String>> getListList() {
		//TODO 自動生成されたメソッド・スタブ
		System.out.println(getFileSize());
		//CSVファイル読み込み
		test reader = new test();
		reader.setFilename("/home/k/workspace/0favTweetBot/test.csv");
		//CSVデータ取得
		List<List<String>> csv = reader.readFile();
		return csv;
		}

}
