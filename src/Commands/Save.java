package Commands;

import Controller.CommandWithoutArg;
import Controller.OrganizationCollection;
import Organization.Organization;
import Utilities.WriterToFile;
import com.google.gson.Gson;

import java.io.IOException;

public class Save implements CommandWithoutArg {
    OrganizationCollection collection = new OrganizationCollection();
    WriterToFile writer = new WriterToFile();

    @Override
    public void execute(Object o) throws IOException {
        try {
            Gson json = new Gson();
//            for (Organization organization: collection.getCollection()){
//                writer.write(json.toJson(organization)+"\n");
//            }
            writer.write(json.toJson(collection.getCollection()));
            System.out.println("Коллекция успешно сохранена.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Override
        public String getName () {
            return "save";
        }
    }
