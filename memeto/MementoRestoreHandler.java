package memeto;

import factory.order.Order;

import java.util.ArrayList;

public class MementoRestoreHandler {
    private ArrayList<Order> orders;
    public MementoRestoreHandler(ArrayList<Order> orders){
        this.orders=orders;
    }
    public ArrayList<Order> restore(int staffNo) {
        loop:
        for (int i = orders.size()-1; i>= 0; i--) {
            Order undoOrder= (Order)orders.get(i);
            if(undoOrder.getStaffNumber()==staffNo){
                System.out.println(undoOrder.toString());
                System.out.println("Order Cancelled");
                orders.remove(i);
                return orders;
            }
        }
        System.out.println("Order not found");
        return orders;
    }
}
