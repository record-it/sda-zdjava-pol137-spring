package pl.sda.zdjavapol137.firstspringapp.console;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfiguration {
    // to też jest komponent, ale tworzony jawnie przez wywołanie konstruktora
    // i produkuje zależność dla klasy Menu
    // 1. ważny typ zwracany
    // 2. nazwa metody identyczna z polem wstrzykiwanym
    @Bean
    List<MenuItem> items(){
        return  List.of(
                MenuItem.builder()
                        .label("Dodaj adres")
                        .action(() -> {})
                        .build(),
                MenuItem.builder()
                        .label("Wyszukaj")
                        .action(() -> {})
                        .build(),
                MenuItem.builder()
                        .label("Koniec")
                        .action(() -> {})
                        .build()
        );
    }
}
