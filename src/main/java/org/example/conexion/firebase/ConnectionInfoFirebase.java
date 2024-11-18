package org.example.conexion.firebase;

public class ConnectionInfoFirebase {

    private String credetials;
    private String path;

    public ConnectionInfoFirebase(String credetials, String path) {
        this.credetials = credetials;
        this.path = path;
    }

    public String getCredetials() {
        return credetials;
    }

    public void setCredetials(String credetials) {
        this.credetials = credetials;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
