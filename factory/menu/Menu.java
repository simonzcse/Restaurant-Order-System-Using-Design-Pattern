package factory.menu;
import java.io.IOException;
import java.util.*;

public abstract class Menu {//abstract Product
    private String type;
    private String mainDish;
    private int price;
    private int count;
    protected Scanner scanner;
    public Menu(){scanner = new Scanner(System.in);
        setCount(3);
        setPrice(100);
        setMainDish("Nameless");
        setType("Menu");}

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public abstract Menu create() throws IOException;
}
