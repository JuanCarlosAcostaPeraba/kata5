package software.ulpgc.kata5.model;

import java.util.List;

public class ApiResponse {
    private final List<String> facts;

    public ApiResponse(List<String> facts) {
        this.facts = facts;
    }

    public List<String> getFacts() {
        return facts;
    }
}
