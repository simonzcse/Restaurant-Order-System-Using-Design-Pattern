package command.menuAction;

import command.Command;
import factory.Creater;
import factory.menu.Menu;
import factory.menu.MenuCreater;

import java.io.IOException;
import java.util.Stack;

public class EditMenu implements Command {
    private Menu[] menus;
    private Stack<Menu[]> stack;//unuse undo
    public EditMenu(Menu[] menus){this.menus=menus;
    stack = new Stack();}

    public void execute() throws IOException {
        Creater menuCreater = new MenuCreater();
        Menu m = (Menu) menuCreater.create();
        if(m.getClass().getSimpleName().equals("ChineseMenu")){
            menus[0]=m;//store Chinese Menu
        }
        else if(m.getClass().getSimpleName().equals("WesternMenu")){
            menus[1]=m;//Western Chinese Menu
        }
        stack.push(menus);
    }
}
