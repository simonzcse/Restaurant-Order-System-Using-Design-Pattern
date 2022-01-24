package factory.menu;
import factory.Creater;

import java.io.IOException;

public class MenuCreater extends Creater {//ConcreteFactory
    private Menu menu;
    public MenuCreater(){
        super();
    }
    @Override
    public Object create() throws IOException {
        System.out.println("Edit Menu:");
        System.out.println("Chinese or Western (c | w):");
        switch (scanner.nextLine().toLowerCase()){
            case "c":
                menu = new ChineseMenu();//create Chinese
                break;
            case "w":
                menu = new WesternMenu();//create Western
                break;
            default:
                System.out.println("Type Not Found");
                menu = null;
        }
        return menu;
    }
}
