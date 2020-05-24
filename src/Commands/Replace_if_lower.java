package Commands;

import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

public class Replace_if_lower implements Commandable {
    OrganizationCollection collection = new OrganizationCollection();
    ReadData readData = new ReadData();
    @Override
    public void execute(Object o) throws IOException {
        try{
            Vector<Organization> organizations = collection.getCollection();
            Organization sample =readData.getNewOrganization();
            Iterator<Organization> it = (Iterator<Organization>) organizations.iterator();
            while (it.hasNext()){
                Organization organization = (Organization) it.next();
                if (sample.compareTo(organization) > 0)
                    it.remove();
            }
            collection.setOrganizations(organizations);
            System.out.println("Все элементы коллекции, меньшие, чем заданный успешно удалены");
        }
        catch(Exception e) {
            System.out.println("Коллекция пустая, поэтому элементы коллекции не могут быть удалены");
        }
    }

    @Override
    public String getName() {
        return "replace_if_lower";
    }
}
