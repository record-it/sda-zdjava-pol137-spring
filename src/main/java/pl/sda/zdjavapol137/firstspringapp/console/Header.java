package pl.sda.zdjavapol137.firstspringapp.console;

import org.springframework.stereotype.Component;

@Component
public class Header {
    public void print(){
        System.out.println("Książka adresowa.");
        System.out.println("Wersja 1.0.1");
    }
}
