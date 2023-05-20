package pl.sda.zdjavapol137.firstspringapp.console;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuItem {
    private String label;

    private Runnable action;
}
