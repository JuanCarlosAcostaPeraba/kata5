package software.ulpgc.kata5.app;

import com.google.gson.Gson;
import software.ulpgc.kata5.client.ApiClient;
import software.ulpgc.kata5.client.JsoupApiClient;
import software.ulpgc.kata5.model.ApiResponse;
import software.ulpgc.kata5.service.ApiService;
import software.ulpgc.kata5.service.ApiServiceFetch;

public class Main {
    public static void main(String[] args) {
        ApiClient apiClient = new JsoupApiClient();
        Gson gson = new Gson();
        ApiService apiService = new ApiServiceFetch(apiClient, gson);

        ApiResponse response = apiService.fetchDogFacts(5);
        if (response != null && !response.getFacts().isEmpty()) {
            response.getFacts().forEach(System.out::println);
        } else {
            System.out.println("No facts found");
        }
    }
}
