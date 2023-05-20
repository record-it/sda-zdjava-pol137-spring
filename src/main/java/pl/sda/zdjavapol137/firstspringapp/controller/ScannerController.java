package pl.sda.zdjavapol137.firstspringapp.controller;

import org.springframework.stereotype.Component;
import pl.sda.zdjavapol137.firstspringapp.console.Menu;
import pl.sda.zdjavapol137.firstspringapp.console.MenuItem;
import pl.sda.zdjavapol137.firstspringapp.service.AddressBookService;

import java.util.List;
import java.util.Scanner;

@Component
public class ScannerController {
    private final Menu menu;

    private final Scanner scanner;

    private final AddressBookService service;

    public ScannerController(Scanner scanner, AddressBookService service) {
        this.scanner = scanner;
        this.service = service;
        // tworzenie menu
        menu = new Menu(
                List.of(
                        MenuItem
                                .builder()
                                .label("Wyświetl wszystkie")
                                .action(() -> findAll())
                                .build(),
                        MenuItem
                                .builder()
                                .label("Dodaj adres")
                                .action(() -> addAddress())
                                .build(),
                        MenuItem
                                .builder()
                                .label("Wyszukaj")
                                .action(() -> findAddresses())
                                .build(),
                        MenuItem
                                .builder()
                                .label("Wyjście")
                                .action(() -> exit())
                                .build()
                )
        );
    }

    public void mainLoopRun(){
        while(true){
            menu.print();
            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();
                menu.runAction(option);
            } else {
                scanner.nextLine();
                System.out.println("Niepoprawny format numeru opcji!");
            }
        }
    }

    public void addAddress(){
        System.out.println("Podaj username:");
        String name = scanner.nextLine();
        System.out.println("Podaj email:");
        String email = scanner.nextLine();
        service.saveAddress(name, email);
    }

    public void exit(){
        System.exit(0);
    }

    public void findAddresses(){
        // zaimplementuj metodę
        // dodaj pozycję menu w kontrolerze
    }

    public void findAll(){
        service.findAll().forEach(System.out::println);
    }

}
