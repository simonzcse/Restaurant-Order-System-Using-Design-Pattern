import java.io.IOException;
import java.util.*;

import command.Command;
import command.menuAction.EditMenu;
import command.menuAction.ShowMenu;
import command.orderAction.CancelOrder;
import command.orderAction.ListOrders;
import command.orderAction.MakeOrder;
import command.orderAction.OrderisDone;
import factory.menu.Menu;
import memeto.OrderList;

public class Main {//Invoker, Client, Caretaker
	public static Scanner scanner = new Scanner(System.in);
	private static OrderList orderList = new OrderList();//By reference
	private static Menu[] menus = new Menu[2];//By reference, so that the command interface no need to return something
	public static void main(String[] args) throws IOException {
		boolean isQuit = false;
		Command command;
		while (!isQuit) {//command q will finish this program
			System.out.println("Please enter command: [e | s | p | c | l | d| q]\n" +
					"e = Edit menu, s = Show menu, p = Place orders, c = Cancel Order,\n" +
					"l = List orders, d = order is Done, q = Quit");
			switch (scanner.nextLine().toLowerCase()) {
				case"q":
					isQuit = true;
					break;
				case"e":
					command = new EditMenu(menus);
					command.execute();
					break;
				case"s":
					command = new ShowMenu(menus);
					command.execute();
					break;
				case"p":
					command = new MakeOrder(menus, orderList);
					command.execute();
					break;
				case"c":
					command = new CancelOrder(menus, orderList);
					command.execute();
					break;
				case"l":
					command = new ListOrders(orderList.getOrders());
					command.execute();
					break;
				case"d":
					command = new OrderisDone(orderList);
					command.execute();
					break;
				default:
					System.out.println("Please input correct command!");
			}
		}
	}
}

