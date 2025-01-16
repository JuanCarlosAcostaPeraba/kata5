package software.ulpgc.kata5.service;

import software.ulpgc.kata5.model.ApiResponse;

public interface ApiService {
    ApiResponse fetchDogFacts(int number);
}
