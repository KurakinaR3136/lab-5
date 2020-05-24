package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;

import java.io.FileNotFoundException;


public class Info implements CommandWithoutArg {
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) throws FileNotFoundException {
        System.out.println(collection.getInfo());
    }

    @Override
    public String getName() {
        return "info";
    }
}