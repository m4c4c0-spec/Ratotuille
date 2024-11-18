package org.example.conexion.firebase;

public interface DatabaseConnectionsAdapter <I,C> {

    String createConnection(C c);
    I getConnection();
}
