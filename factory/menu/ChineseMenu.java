package factory.menu;

import java.io.IOException;

public class ChineseMenu extends Menu{
    public ChineseMenu() throws IOException {
        super();
        super.setType("Chinese style Business Set Lunch");
        create();
    }

    @Override
    public String toString() {
        return getType()+"\nmain dish: "+getMainDish()+"\nwith rice, Chinese soup, Chinese tea"
                +"\nprice: "+getPrice()+"\navailable count: "+getCount();//For Show Menu Function
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
