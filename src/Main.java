import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Document doc;
        String stopWordsCSVFile = "./stopwords.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";
        String [] stopwords;

        try {
            br = new BufferedReader(new FileReader(stopWordsCSVFile));
            while ((line = br.readLine()) != null) {
                stopwords = line.split(splitBy);

            }
            doc = Jsoup.connect("http://www.amazon.com/Cuisinart-CPT-122-Compact-2-Slice-Toaster/dp/B009GQ034C/ref=sr_1_1?s=kitchen&ie=UTF8&qid=1431620315&sr=1-1&keywords=toaster").get();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try{
                    br.close();
                }catch( IOException e){
                    e.printStackTrace();
                }
            }
        }










    }
}
