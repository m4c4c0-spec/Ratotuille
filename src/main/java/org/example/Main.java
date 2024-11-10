package org.example;

import org.example.databases.firestore.DatabaseConnectionFirebase;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionFirebase databaseConnectionFirebase = new DatabaseConnectionFirebase();
        System.out.println("Instancia creada: "+databaseConnectionFirebase.getConnection());


    }
}