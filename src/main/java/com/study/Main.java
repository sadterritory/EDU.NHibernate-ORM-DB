package com.study;

import com.study.util.ConsoleMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            ConsoleMenu.startMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
