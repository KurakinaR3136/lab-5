package Controller;


import Organization.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class OrganizationCollection {
    private static Vector<Organization> organizations;
    private static LocalDate creationDate;
    public OrganizationCollection() {
        organizations = new Vector<Organization>();
        creationDate = LocalDate.now();
    }

    public Vector<Organization> getCollection() {
        return organizations;
    }

    public void setOrganizations(Vector<Organization> organizations) {
        organizations = organizations;
    }

    public void add(Organization organization) {
        organizations.add(organization);
        creationDate = LocalDate.now();
    }

    public void clear() {
        organizations.clear();
    }

    public int getSize(){
        return organizations.size();
    }

    public String getInfo() {
        return "Тип коллекции: Vector\nРазмер коллекции: " + this.getSize() + "\nВремя создания: " + creationDate;
    }
    public boolean isIndexBusy(int id){
        for (Organization organization: organizations)
            if (organization.getId() == id) return true;
        return false;
    }
    public void toSortArray() {
        Collections.sort(organizations);
    }
}




