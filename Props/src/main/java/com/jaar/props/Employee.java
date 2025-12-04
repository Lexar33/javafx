package com.jaar.props;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty name =new SimpleStringProperty();
    private IntegerProperty salary=new SimpleIntegerProperty();

    public Employee(String name, int salary) {
        this.name.set(name);
        this.salary.set(salary);
    }

    public String getName(){
        return name.getValue();
    }

    public int getSalary(){
        return salary.get();
    }

    public IntegerProperty getSalaryProperty(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary.set(salary);
    }
}
