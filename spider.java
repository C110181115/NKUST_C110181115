import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class spider {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/Kaohsiung/M.1638247579.A.E82.html").get();
            System.out.println("doc.title()"  + doc.title());

            Element link = doc.select("link").first();
            String absHref = link.attr("href");
            System.out.println(absHref);

            Elements newsHeadlines = doc.select("div.push");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
                break;
            }    
        }catch (Exception e){
            System.out.println(e);
        }
        }//cloud yu
    }
}
