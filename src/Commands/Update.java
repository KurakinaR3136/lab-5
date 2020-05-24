package Commands;

import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.Organization;
import Organization.ReadData;

import java.io.IOException;

public class Update implements Commandable {
    OrganizationCollection collection = new OrganizationCollection();
    ReadData readData = new ReadData();

    @Override
    public void execute(Object arg) throws IOException {
        try {
            if (collection.isIndexBusy(Integer.parseInt((String) arg))) {
                Organization organization = new Organization();
                organization = readData.getNewOrganization();
                collection.add(organization);
                System.out.println("Организация [id:" + arg + "] успешно обновлена.");
            } else System.out.println("Организации с таким id нет.");
        } catch (Exception e) {
            System.out.println("Такого элемента нет в коллекции");
        }
    }

    @Override
    public String getName() {
        return "update";
    }
}

