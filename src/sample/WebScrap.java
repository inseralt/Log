package sample;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrap {
    private String Url;
    private String HTMLClass;

    public WebScrap(String url, String htmlclass) {
        this.Url = url;
        this.HTMLClass = htmlclass;
    }

    public String Scrap() throws IOException {
        try {
            Document document = Jsoup.connect(this.Url).get();
            Elements elements = document.select(this.HTMLClass);
            for (Element e : elements) {
                return e.ownText();
            }
            return "----";
        }catch (Exception e){
            System.out.println("Error WebScrap");
        }
        return null;
    }
}