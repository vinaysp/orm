package org.example;

public class Main {

    public static void main(String[] args) {

        var sessionFactory = Database.getSessionFactory();
        sessionFactory.getSchemaManager().exportMappedObjects(true);




    }
}