package org.example.conexion.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class DatabaseConnectionFirebase implements DatabaseConnectionsAdapter<Firestore, ConnectionInfoFirebase> {

    public DatabaseConnectionFirebase() {
        ConnectionInfoFirebase connectionInfoFirebase = new ConnectionInfoFirebase(DatabaseCredentialsFirebase.SEVICECONNECTION.getVALUE(), DatabaseCredentialsFirebase.URLDATABASE.getVALUE());
        System.out.println(createConnection(connectionInfoFirebase));
    }


    @Override
    public String createConnection(ConnectionInfoFirebase c) {
        try {
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(new ByteArrayInputStream(c.getCredetials().getBytes(StandardCharsets.UTF_8))))
                    .setDatabaseUrl(c.getPath())
                    .build();

            FirebaseApp.initializeApp(options);
            return "Success Connection";
        } catch (IOException e)
        {
            return "Fail Connection";
        }

    }

    @Override
    public Firestore getConnection() {
        return FirestoreClient.getFirestore();
    }
}