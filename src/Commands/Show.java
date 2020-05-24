package Commands;


import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;
import Organization.Organization;

import java.io.FileNotFoundException;
import java.util.Map;

public class Show implements CommandWithoutArg {
	OrganizationCollection collection = new OrganizationCollection();

	@Override
	public void execute(Object o) throws FileNotFoundException {
		if (collection.getSize() == 0) System.out.println("Коллекция пустая.");
		else for (Organization organization : collection.getCollection())
			System.out.println(organization.getInfo());
	}

	@Override
	public String getName() {
		return "show";
	}
}
