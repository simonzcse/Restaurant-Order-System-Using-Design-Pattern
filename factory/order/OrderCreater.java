package factory.order;

import factory.Creater;
import factory.menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class OrderCreater extends Creater {
    private Order order;
    Menu[] menus;
    public OrderCreater(Menu[] menus){
        super();
        this.menus= menus;
    }
    @Override
    public Object create() throws IOException {
        System.out.println("Place Order");
        System.out.println("Chinese or Western (c | w):");
        switch (scanner.nextLine().toLowerCase()){
            case "c":
                order = new ChineseOrder(menus);
                break;
            case "w":
                order = new WesternOrder(menus);
                break;
            default:
                order = null;
        }
        return order;
    }
}
