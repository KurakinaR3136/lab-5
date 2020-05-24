package Commands;

import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.Organization;

import java.io.IOException;
import java.util.Iterator;

public class Remove_by_id implements Commandable {
    OrganizationCollection collection = new OrganizationCollection();
    @Override
    public void execute(Object arg) throws IOException {
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else {
            int id = 0;
            try {
                id = Integer.parseInt((String) arg);
            } catch (NumberFormatException exp) {
            }

            String ans = "Нет организации с таким id.";
            Iterator<Organization> it = (Iterator<Organization>) collection.getCollection().iterator();
            while (it.hasNext()) {
                Organization organization = (Organization) it.next();
                int humanId = (int) organization.getId();
                if (id == humanId) {
                    it.remove();
                    ans = "Организация успешно удалена.";
                }
            }
        }
    }
    @Override
    public String getName() {
        return "remove_by_id";
    }
}
