package software.ulpgc.kata5.client;

import org.jsoup.Jsoup;

import java.io.IOException;

public class JsoupApiClient implements ApiClient{
    @Override
    public String get(String url) throws IOException {
        return Jsoup.connect(url).ignoreContentType(true).execute().body();
    }
}
