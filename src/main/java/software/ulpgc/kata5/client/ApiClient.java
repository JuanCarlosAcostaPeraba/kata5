package software.ulpgc.kata5.client;

import java.io.IOException;

public interface ApiClient {
    String get(String url) throws IOException;
}
