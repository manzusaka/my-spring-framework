package com.mitix.spring.condition;

/**
 * Created by oldflame on 2017/2/13.
 */
public class WindowsListService implements ListService {

    public String showListCmd() {
        return "dir";
    }
}
