package command.orderAction;

import command.Command;
import factory.order.Order;

import java.io.IOException;
import java.util.ArrayList;

public class ListOrders  implements Command {//ConcreateCommand
    private ArrayList<Order> arrayList;//Receiver form OrderList.getOrders() method
    public ListOrders(ArrayList arrayList ){this.arrayList=arrayList;}

    @Override
    public void execute() throws IOException {
        if (arrayList.size()>0){
            System.out.println("Outstanding Orders");
            for (int i = 0; i < arrayList.size(); i++) {
                Order o = (Order) arrayList.get(i);
                System.out.println(o.toString());//action
            }
            System.out.println("");
        }
    }
}
