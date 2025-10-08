package org.example;

/**
 * Class for mapping JSON objects.
 */
public class People {
    private String name;
    private int age;
    private String country;
    private int id;

    public People(String name, int age, String country, int id) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.id = id;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public int getId() { return id; }
}

