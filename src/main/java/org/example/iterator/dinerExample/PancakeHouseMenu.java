package org.example.iterator.dinerExample;

import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
