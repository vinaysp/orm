package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Generated;

@Entity
public class Category {

    @Id
    @Generated
    int id;

    public String name;

    Category(){}

    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }

}
