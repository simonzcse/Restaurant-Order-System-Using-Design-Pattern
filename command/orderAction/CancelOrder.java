package command.orderAction;

import command.Command;
import factory.menu.Menu;
import memeto.OrderList;

import java.io.IOException;

public class CancelOrder implements Command {
    private Menu[]menus;
    private OrderList orderList;
    public CancelOrder(Menu[] menus, OrderList orderList){
        this.menus=menus;
        this.orderList=orderList;
    }

    @Override
    public void execute() throws IOException {//Caretaker?
        orderList.undo(menus);
    }
}
