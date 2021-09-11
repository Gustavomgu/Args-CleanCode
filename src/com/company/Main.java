package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.has('1');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void executeApplication(boolean logging, int port, String directory) {
        System.out.printf("Logging: %b, port: %d, directory: %s%n",logging,port,directory);
    }
}
