package com.lab.ocp.day09;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.Set;

public class PersonDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\lab\\ocp\\day09\\exams.json");
        String json = new Scanner(file).useDelimiter("\\A").next();
        
        Type type = new TypeToken<Set<Person>>() {}.getType();
        Set<Person> persons = new Gson().fromJson(json, type);
        persons.stream().forEach(p -> System.out.println(p.getName()));
        
    }
}
