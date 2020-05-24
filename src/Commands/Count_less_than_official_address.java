package Commands;

import Controller.Commandable;
import Controller.OrganizationCollection;
import Organization.Organization;

import java.io.IOException;

public class Count_less_than_official_address implements Commandable {
    OrganizationCollection collection = new OrganizationCollection();

    @Override
    public void execute(Object o) throws IOException {
        if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
        else {
            try {
                int count = 0;
                int n = Integer.parseInt(String.valueOf(0));
                for (Organization organization : collection.getCollection()) {
                    if (organization.getOfficialAddress().getStreet().length() + organization.getOfficialAddress().getTown().length() < n)
                        count++;
                }
                System.out.println("Количество организаций, чей адрес меньше заданного значения: " + count);
            } catch (Exception e) {
                System.out.println("Аргумент команды должен быть тпа int.");
            }
        }
    }

    @Override
    public String getName() {
        return "count_less_than_official_address";
    }
}
