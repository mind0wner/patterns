package com.patterns.structural;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        WebsiteTemplate mainPage = new MainPage();
        WebsiteTemplate newsPage = new NewsPage();
        mainPage.showPage();
        System.out.println("--------------------------------------------------");
        newsPage.showPage();
    }
}