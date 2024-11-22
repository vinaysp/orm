package org.example;

import Entities.Category;
import Entities.Recipe;

public class Main {

    public static void main(String[] args) {

        var sessionFactory = Database.getSessionFactory();
        sessionFactory.getSchemaManager().exportMappedObjects(true);

        Category category = new Category(1,"Cars");
        System.out.println(category.name);





    }
}