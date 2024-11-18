package org.example;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import org.example.conexion.firebase.DatabaseConnectionFirebase;

import java.util.HashMap;
import java.util.Map;

public class FirestoreCRUD {
    private Firestore db;

    public FirestoreCRUD(DatabaseConnectionFirebase connection) {
        this.db = connection.getConnection();
    }

    // Crear documento con datos definidos internamente
    public String createDocument() {
        String collectionName = "miColeccion"; // Nombre de la colección predeterminado
        String documentId = ""; // Dejar en blanco para que sea auto-generado

        Map<String, Object> data = new HashMap<>();
        data.put("nombre", "Juan Perez");
        data.put("edad", 30);
        data.put("ciudad", "Madrid");

        try {
            if (documentId.isEmpty()) {
                // Crear documento con ID auto-generado
                DocumentReference docRef = db.collection(collectionName).add(data).get();
                return "Documento creado con ID: " + docRef.getId();
            } else {
                // Crear o sobrescribir documento con ID especificado
                db.collection(collectionName).document(documentId).set(data).get();
                return "Documento creado con ID: " + documentId;
            }
        } catch (Exception e) {
            return "Error al crear el documento: " + e.getMessage();
        }
    }


    // Leer documento con ID y colección definidos internamente
    public Map<String, Object> readDocument() {
        String collectionName = "miColeccion";
        String documentId = "idDelDocumento"; // ID del documento a leer

        try {
            DocumentReference docRef = db.collection(collectionName).document(documentId);
            return docRef.get().get().getData();
        } catch (Exception e) {
            System.out.println("Error al leer el documento: " + e.getMessage());
            return null;
        }
    }

    // Actualizar documento con datos y valores internos
    public String updateDocument() {
        String collectionName = "miColeccion";
        String documentId = "idDelDocumento";

        Map<String, Object> data = new HashMap<>();
        data.put("ciudad", "Barcelona"); // Cambios en el documento

        try {
            DocumentReference docRef = db.collection(collectionName).document(documentId);
            WriteResult result = docRef.set(data).get();
            return "Documento actualizado en: " + result.getUpdateTime();
        } catch (Exception e) {
            return "Error al actualizar el documento: " + e.getMessage();
        }
    }

    // Eliminar documento con valores internos
    public String deleteDocument() {
        String collectionName = "miColeccion";
        String documentId = "idDelDocumento";

        try {
            DocumentReference docRef = db.collection(collectionName).document(documentId);
            docRef.delete().get();
            return "Documento eliminado: " + documentId;
        } catch (Exception e) {
            return "Error al eliminar el documento: " + e.getMessage();
        }
    }
}

