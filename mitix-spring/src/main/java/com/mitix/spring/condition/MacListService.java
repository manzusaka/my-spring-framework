package com.mitix.spring.condition;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "mac ls";
    }
}
