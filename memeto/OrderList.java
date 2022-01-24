package memeto;

import factory.order.Order;
import factory.menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderList {//Memento
    protected ArrayList<Order> orders;
    private Scanner scanner;
    public OrderList(){
        orders= new ArrayList<Order>();//Originator
        scanner = new Scanner(System.in);
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }//For ListOrders
    public void saveOrder(Order order){
        orders.add(order);
    }//For MakeOrder
    public Menu[] undo(Menu[] menus){//restore by staffId
        System.out.println("Cancel Order");
        System.out.println("Staff Number:");
        int staffNo = scanner.nextInt();
        MementoRestoreHandler mementoRestoreHandler = new MementoRestoreHandler(orders);
        findtype:
        for (int i = orders.size()-1; i>= 0; i--) {
            Order order = (Order) orders.get(i);
            if (order.getType().equals("c")&&order.getStaffNumber()==staffNo){
                menus[0].setCount(menus[0].getCount()+1);
                break findtype;
            }
            if (order.getType().equals("w")&&order.getStaffNumber()==staffNo){
                menus[1].setCount(menus[1].getCount()+1);
                break findtype;
            }
        }
        orders= mementoRestoreHandler.restore(staffNo);
        return menus;
    }
    public void removeOrder(int i){
        orders.remove(i);
    }//For OrderisDone
}
