package pl.sda.zdjavapol137.firstspringapp.console;

import org.springframework.stereotype.Component;

@Component
public class Header {
    private String appName;
    private String version;

    public Header(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public void print(){
        System.out.println(appName);
        System.out.println("Wersja " + version);
    }
}
