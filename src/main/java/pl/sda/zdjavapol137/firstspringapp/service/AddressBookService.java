package pl.sda.zdjavapol137.firstspringapp.service;

import java.util.List;

public interface AddressBookService {
    void saveAddress(String username, String emailAddress);
    List<String> findByUsernamePattern(String pattern);
    List<String> findAll();
}
