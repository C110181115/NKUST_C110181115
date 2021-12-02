import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class movie {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.worldscreen.com.tw/movie.php?movie_id=549#tops").get();
        Elements items = document.getElementsByClass("pagecontent");
        for (Element pagecontent : items) {
            String title = pagecontent.getElementsByClass("movie-profile-title").tagName("span").get(0).text();
            String num = pagecontent.getElementsByClass("insMovieRight").tagName("p").get(0).text();

            System.out.println("電影標題: " + title);
            System.out.println("導演: " + num);
            System.out.println("============================================");
        }
    }
}
