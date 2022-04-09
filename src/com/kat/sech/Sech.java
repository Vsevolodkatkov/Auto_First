package com.kat.sech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sech {
    public static void main(String[] args) {

        WebDriver obj = new ChromeDriver();
        obj.get("https://wwww.google.com");
    }
}
