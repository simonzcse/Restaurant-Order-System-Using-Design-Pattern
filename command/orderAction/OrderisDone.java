package command.orderAction;

import command.Command;
import memeto.OrderList;

import java.io.IOException;
import java.util.Stack;


public class OrderisDone implements Command {
    private OrderList orderList;
    private Stack stack;
    public OrderisDone(OrderList orderList){
        this.orderList=orderList;
        stack=new Stack();
    }
    @Override
    public void execute() throws IOException {
        System.out.println("Complete Order");
        if (orderList.getOrders().size()>0){
            System.out.println(orderList.getOrders().get(0).toString());
            orderList.removeOrder(0);
            System.out.println("Order marked as done");
            stack.push(orderList);
            return;
        }
        else {
            System.out.println("The are no any Order!");
        }
    }
}
