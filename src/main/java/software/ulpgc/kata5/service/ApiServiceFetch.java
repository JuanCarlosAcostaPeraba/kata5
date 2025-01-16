package software.ulpgc.kata5.service;

import com.google.gson.Gson;
import software.ulpgc.kata5.client.ApiClient;
import software.ulpgc.kata5.model.ApiResponse;

import java.io.IOException;

public class ApiServiceFetch implements ApiService{
    private static final String API_URL = "https://dogapi.dog/api/facts?number=%d";

    private final ApiClient apiClient;
    private Gson gson;

    public ApiServiceFetch(ApiClient apiClient, Gson gson) {
        this.apiClient = apiClient;
        this.gson = gson;
    }

    @Override
    public ApiResponse fetchDogFacts(int number) {
        try {
            String url = String.format(API_URL, number);
            String json = apiClient.get(url);
            return gson.fromJson(json, ApiResponse.class);
        } catch (IOException e) {
            return new ApiResponse(null);
        }
    }
}
