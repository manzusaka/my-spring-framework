package com.mitix.spring.condition;

/**
 * Created by oldflame on 2017/2/13.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
