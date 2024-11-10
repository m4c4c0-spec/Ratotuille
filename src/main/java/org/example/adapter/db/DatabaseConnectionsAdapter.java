package org.example.adapter.db;

public interface DatabaseConnectionsAdapter <I,C> {

    public String createConnection(C c);
    public I getConnection();
}
