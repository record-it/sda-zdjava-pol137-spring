package pl.sda.zdjavapol137.firstspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.zdjavapol137.firstspringapp.console.Header;
import pl.sda.zdjavapol137.firstspringapp.console.Menu;

@SpringBootApplication
public class FirstSpringAppApplication implements CommandLineRunner {

    //zależność klasy wstrzykiwana przez konstruktor
    private final Menu menu;
    // zależność klasy wstrzykiwana przez pole

    @Autowired
    private Header header;
    //wstrzykiwanie zależności przez konstruktor -zalecane!!!
    public FirstSpringAppApplication(Menu menu) {
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (menu != null) {
            header.print();
            menu.print();
        } else {
            System.out.println("Brak menu!");
        }
    }

    //Tworzenie komponentu zwracanego przez metodę

}
