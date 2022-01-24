package factory.order;

import factory.menu.Menu;

import java.util.Scanner;

public abstract class Order {//Originator
    protected Scanner scanner;
    private String type;
    private String side;
    private String drink;
    private int staffNumber;
    private int officeLocation;
    private Menu[] menus;
    private boolean created = false;
    public Order(Menu[] menus){
        this.scanner=new Scanner(System.in);
        this.menus=menus;
    }
    public abstract Order create();
    public void setCreated(boolean b){
        this.created = b;
    }
    public boolean getCreated(){return created;}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(int officeLocation) {
        this.officeLocation = officeLocation;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    public Menu getMenu(int i){
        return menus[i];
    }
}
