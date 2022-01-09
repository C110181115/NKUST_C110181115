public class final_work {
    public static void main(String[] args) {
        try{
            String URL_1 = "https://tw.stock.yahoo.com";
            String URL_2 = "";
            String URL_3 = "";
            Document index_1 = Jsoup.connect(URL_1).get();
            Document index_2 = new Document("");
            Document index_3 = new Document("");
            Elements headline = index_1.select("div #ybar-navigation li._yb_sb4pm a._yb_kcesn");
            for (Element x : headline)
            {
                if (Objects.equals(x.text(),"當日行情"))
                {
                    System.out.println(x.attr("href"));
                    URL_2 = x.attr("href");
                    index_2=Jsoup.connect(URL_2).get();
                    break;
                }
            }
            System.out.println(index_2.title());
    }
}
