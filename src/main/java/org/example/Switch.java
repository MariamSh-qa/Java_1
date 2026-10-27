package org.example;

public class Switch {
    static void main(String[] args) {

        int statusCode = 404;

        switch (statusCode) {
            case 200:
                System.out.println("OK");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Server Error");
                break;
            default:
                System.out.println("Other status");}


    }
}
