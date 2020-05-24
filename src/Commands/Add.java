package Commands;

import Controller.*;
import Organization.ReadData;

import java.io.FileNotFoundException;

public class Add implements CommandWithoutArg, CommandWithObject {
    OrganizationCollection collection = new OrganizationCollection();
    ReadData readData = new ReadData();
    @Override
    public boolean check(Object arg) {
        return true;
    }

    @Override
    public void execute(Object o) throws FileNotFoundException {
		collection.add(readData.getNewOrganization());
        System.out.println("Организация успешно добавлена.");
    }

    @Override
    public String getName() {
        return "add";
    }
}