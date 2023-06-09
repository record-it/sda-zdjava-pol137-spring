package pl.sda.zdjavapol137.firstspringapp.console;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Menu {
    //to pole jest zależnością
    private final List<MenuItem> items;

    //wstrzykiwanie zależności przez konstruktor
    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public void print(){
        int i = 1;
        for(var item: items){
            System.out.println(i++ +". "+item.getLabel());
        }
    }

    public void runAction(int option){
        //TODO dodać sprawdzanie poprawności option
        items.get(option - 1).getAction().run();
    }
}
