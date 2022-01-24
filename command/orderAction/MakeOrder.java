package command.orderAction;

import command.Command;
import factory.order.Order;
import factory.order.OrderCreater;
import factory.menu.Menu;
import memeto.OrderList;

import java.io.IOException;

public class MakeOrder implements Command {
    private Menu[] menus;
    private OrderList orderList;
    public MakeOrder(Menu[] menus, OrderList orderList){
        this.menus=menus;
        this.orderList=orderList;
    }

    @Override
    public void execute() throws IOException {
        Order o =(Order) new OrderCreater(menus).create();
        if (o.getCreated()) {
            orderList.saveOrder(o);
            if (o.getType().equals("c")) {
                menus[0].setCount(menus[0].getCount() - 1);
            }
            if (o.getType().equals("w")) {
                menus[1].setCount(menus[1].getCount() - 1);
            }
        }
    }
}
