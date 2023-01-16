package com.dyachenko.api;

import java.util.Map;

public class AccountsState {
    private Map<Long, Long> state;

    public Map<Long, Long> getState() {
        return state;
    }

    public void setState(Map<Long, Long> state) {
        this.state = state;
    }
}
