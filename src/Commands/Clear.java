package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;

import java.io.FileNotFoundException;

public class Clear implements CommandWithoutArg {
	OrganizationCollection collection = new OrganizationCollection();

	@Override
	public void execute(Object o) throws FileNotFoundException {
		collection.clear();
		System.out.println("Коллекция успешно очищена.");
	}

	@Override
	public String getName() {
		return "clear";
	}
}