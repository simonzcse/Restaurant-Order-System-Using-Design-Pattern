package factory;

import java.io.IOException;
import java.util.Scanner;

public abstract class Creater {//Abstract Concrete
    protected Scanner scanner;
    public Creater(){scanner = new Scanner(System.in);}
    public abstract Object create() throws IOException;
}
