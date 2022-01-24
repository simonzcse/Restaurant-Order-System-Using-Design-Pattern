package factory.order;
import factory.menu.Menu;

import java.io.IOException;
public class WesternOrder extends Order{
    private String dishName;
    public WesternOrder(Menu[] menus) throws IOException {
        super(menus);
        setType("w");
        if (getMenu(1).getCount()==0){
            System.out.println("Sold Out!");
        }
        else{create();}
    }
    public Order create(){
        System.out.println("side: rice, spaghetti, French fries (r | s | f):");
        setSide(scanner.nextLine());
        System.out.println("tea or coffee, hot or iced (ht| it | hc | ic):");
        setDrink(scanner.nextLine());
        System.out.println("Staff Number:");
        setStaffNumber(scanner.nextInt());
        System.out.println("Office Location:");
        setOfficeLocation(scanner.nextInt());
        dishName=getMenu(0).getMainDish();
        System.out.println("Order Placed");
        setCreated(true);
        return this;
    }
    public String toString(){
        String s = getType().toUpperCase();
        s+=": "+getStaffNumber()+", "+getOfficeLocation();
        s+=", "+this.dishName+", ";
        switch (getSide()){
            case "r":
                s+="Rice";
                break;
            case "s":
                s+="Spaghetti";
                break;
            case "f":
                s+="French fries";
                break;
            default:
                s+=getDrink();
        }
        s+=", Western Soup, ";
        switch (getDrink()){
            case "ht":
                s+="Hot Tea";
                break;
            case "it":
                s+="Iced Tea";
                break;
            case "hc":
                s+="Hot Coffee";
                break;
            case "ic":
                s+="Iced Coffee";
                break;
            default:
                s+=getDrink();
        }
        return s;
    }
}
