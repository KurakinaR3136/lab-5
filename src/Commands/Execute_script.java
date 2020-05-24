package Commands;

import Controller.*;
import Utilities.ReadFromFile;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Execute_script implements Commandable {
    String name = "execute_script";
    OrganizationCollection collection = new OrganizationCollection();
    Commands invoker = new Commands();

    @Override
    public void execute(Object arg) {
        try {
            String data = ReadFromFile.readFromFile((String) arg);
            Commands command = new Commands();
            if (data != null) {
                String[] commands = data.split("\n|\r\n");
                for (int i = 0; i < commands.length; i++) {
                    if (!(commands[i].equals(""))) {
                        if (!(commands[i].equals("execute_script " + arg))) {
                            try {
                                String[] commandAndName = commands[i].split(" ");
                                CommandWithObject commandWithObject = (CommandWithObject) invoker.getCommand(commandAndName[0]);
                            } catch (Exception e) {
                                System.out.println("Команда \"" + commands[i] + "\":");
                                command.executeCommand(commands[i]);
                                System.out.println();
                            }

                        } else System.out.println("Команда \"" + commands[i] + "\": невыполнима.");
                    }
                }
            } else System.out.println("Указанный файл не найден.");
        } catch (NullPointerException | FileNotFoundException e) {

        }
    }

    @Override
    public String getName() {
        return name;
    }
}
