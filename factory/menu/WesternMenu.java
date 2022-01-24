package factory.menu;

import java.io.IOException;

public class WesternMenu extends Menu{//Product
    public WesternMenu() throws IOException {
        super();
        super.setType("Western style Business Set Lunch");
        create();
    }

    @Override
    public String toString() {
        return getType()+"\nmain dish: "+getMainDish()+"\nwith rice/spaghetti/French fries"
                +"\nprice: "+getPrice()+"\navailable count: "+getCount();//For show Menu Function
    }
    @Override
    public Menu create() throws IOException {
        System.out.println("Enter main dish:");
        setMainDish(scanner.nextLine());
        System.out.println("Enter price:");
        setPrice(scanner.nextInt());
        System.out.println("Enter available count:");
        setCount(scanner.nextInt());
        System.out.println("Menu Updated\n");
        return this;
    }

}
