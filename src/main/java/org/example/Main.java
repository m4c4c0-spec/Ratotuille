package org.example;

import org.example.conexion.firebase.DatabaseConnectionFirebase;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionFirebase databaseConnectionFirebase = new DatabaseConnectionFirebase();
        System.out.println("Instancia creada: "+databaseConnectionFirebase.getConnection());

        FirestoreCRUD CRUD = new FirestoreCRUD(databaseConnectionFirebase);
        CRUD.createDocument();
        CRUD.readDocument();
        CRUD.updateDocument();
        CRUD.deleteDocument();


    }
}