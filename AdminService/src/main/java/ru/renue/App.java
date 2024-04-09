package ru.renue;

import lombok.Data;

@Data
public class App {

    private String name = "Misha";

    public static void main( String[] args ) {
        App app = new App();
        System.out.println(app.getName());
    }
}
