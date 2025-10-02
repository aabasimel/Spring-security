package org.abasimel.spring_security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Student {


    @Id
    private int id;
    private String name;
    private int marks;

    public Student(){}

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
