package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;

/**
 * sorts the elements of a collection
 *
 * @author Diana
 */

public class Sort implements CommandWithoutArg {
	OrganizationCollection collection = new OrganizationCollection();
    @Override
    public void execute(Object o) {
        if (collection.getSize() != 0) {
            collection.toSortArray();
            System.out.println("Коллекция успешно отсортировна.");
        } else System.out.println("Коллекция пустая.");
    }

    @Override
    public String getName() {
        return "sort";
    }
}