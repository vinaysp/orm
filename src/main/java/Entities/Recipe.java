package Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.hibernate.annotations.Generated;

import org.jetbrains.annotations.NotNull;
//import jakarta.validation.constraints.NotNull;


import java.util.List;

@Entity
public class Recipe {

    @Id
    @Generated
    int id;

    @NotNull
    String title;

    String description;

    //List<Category> listOfCategories;
    @ManyToMany(fetch = FetchType.LAZY)
    List<Category> listOfCategories;

    Recipe(){}

    Recipe(int id, String title, String description, List<Category> listOfCategories){
        this.id = id;
        this.title = title;
        this.description = description;
        this.listOfCategories = listOfCategories;
    }


}
