package pl.sda.zdjavapol137.firstspringapp.console;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.zdjavapol137.firstspringapp.service.AddressBookService;

import java.util.List;
import java.util.Scanner;

@Configuration
public class AppConfiguration {

    private final AddressBookService service;

    public AppConfiguration(AddressBookService service) {
        this.service = service;
    }

    // Bean to też jest komponent, ale tworzony jawnie przez wywołanie konstruktora
    // i produkuje zależność dla klasy Header
    // 1. ważny typ zwracany
    // 2. nazwa metody identyczna z polem wstrzykiwanym
    @Bean
    public String appName(){
        return "Książka adresowa";
    }

    @Bean
    public String version(){
        return "1.0.1";
    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
