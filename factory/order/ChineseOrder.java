package factory.order;

import factory.menu.Menu;

import java.io.IOException;

public class ChineseOrder extends Order{
    private String dishName;
    public ChineseOrder(Menu[] menus) throws IOException {
        super(menus);
        setType("c");
        if (getMenu(0).getCount()==0){
            System.out.println("Sold Out!");
        }
        else{create();}
    }
    public Order create(){
        System.out.println("Oolong Tea: hot or iced (h | i):");
        setDrink(scanner.nextLine());
        System.out.println("Staff Number:");
        setStaffNumber(scanner.nextInt());
        System.out.println("Office Location:");
        setOfficeLocation(scanner.nextInt());
        dishName=getMenu(0).getMainDish();
        System.out.println("Order Placed");
        setCreated(true);
        return this;//return self to orderlist
    }
    public String toString(){//List orders function
        String s = getType().toUpperCase();
        s+=": "+getStaffNumber()+", "+getOfficeLocation();
        s+=", "+this.dishName+", Chinese Soup, ";
        switch (getDrink()){
            case "h":
                s+="Hot Tea";
                break;
            case "i":
                s+="Iced Tea";
                break;
            default:
                s+=getDrink();
        }
        return s;
    }
}
