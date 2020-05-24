import Controller.Commands;
import Controller.OrganizationCollection;
import Commands.*;
import Utilities.JsonFile;
import Utilities.ReadFromFile;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        OrganizationCollection collection = new OrganizationCollection();
        Commands commands = new Commands();
        commands.regist(new Add(), new Show(), new Help(), new Sort(), new Clear(), new Exit(), new Info(), new Save(), new Count_less_than_official_address(),
                new Remove_by_id(), new Replace_if_lower(), new Replace_if_greater(), new Update());
        ReadFromFile reader = new ReadFromFile();
        JsonFile json = new JsonFile();
        json.parse(reader.read());
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("~ ");
            String commandName = in.nextLine();
            if (!commandName.equals(""))
                commands.executeCommand(commandName);
        }
    }
}