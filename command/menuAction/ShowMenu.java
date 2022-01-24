package command.menuAction;

import command.Command;
import factory.menu.Menu;

import java.io.IOException;

public class ShowMenu implements Command {
    private Menu[] menus;
    public ShowMenu(Menu[] menus){
        this.menus=menus;
    }

    @Override
    public void execute() throws IOException,NullPointerException {
        try
        {
            for (Menu menu : menus) {
                System.out.println(menu.toString());
                System.out.println();
            }
        }catch (Exception exception){
            System.out.println("Menu unset");
            return;
        }
    }
}
