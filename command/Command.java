package command;

import java.io.IOException;

public interface Command {//Commant pattern interface
    void execute() throws IOException;
}
