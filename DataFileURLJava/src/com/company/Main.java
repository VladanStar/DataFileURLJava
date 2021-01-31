package com.company;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter URL adrress: ");
        Scanner input = new Scanner(System.in);
        String urlString = input.nextLine();
        try {
            java.net.URL url = new java.net.URL(urlString);
            int count =0;

            Scanner inp = null;
            try {
                inp = new Scanner(url.openStream());
            } catch (IOException e) {
                e.printStackTrace();
            }

            while(inp.hasNext()){
                String line = inp.nextLine();
                count += line.length();

            }
            System.out.println("The file size is " + count + " bytes");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
