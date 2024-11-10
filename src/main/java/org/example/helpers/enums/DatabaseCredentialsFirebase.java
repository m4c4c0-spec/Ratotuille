package org.example.helpers.enums;

public enum DatabaseCredentialsFirebase{
    SEVICECONNECTION("{\n" +
            "  \"type\": \"service_account\",\n" +
            "  \"project_id\": \"ratatoulli\",\n" +
            "  \"private_key_id\": \"40c2c20a42cee82990e0faef5868a3e5b1a6f22d\",\n" +
            "  \"private_key\": \"-----BEGIN PRIVATE KEY-----\\nMIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2zD3ugtRZiYLE\\noUsWqOSkJCk6p/BxnJWJVjehaG2t+Vel/rJQylKdDueRC8xtctyJEMwP9kD2iSi8\\nGafQeoII/KPWk4s92hU9FIgvrTjT7NQomBXPP27RZP/axlSdJNCDCsy6rlzLjw6q\\nvb0lR/WWfgeJoK7qCg6wzqW52jRFdNMQmyfGWIMx07TnjRWzBspfGpA7aa9Yyg97\\nbbS8O8kQR7P+WsfZMDoBfgigPSDXl+EbA4xQthhf19zT76jpcF65vywz7l4LpG32\\n5f4ko2p+V9ld9yOflu24NTFX655OIMdOZHvcrSaBMBw/ogo/W9ZCp5EhWo9SNtcs\\nQqLJPfMdAgMBAAECggEAD+xLIcVeM311uWSWap8kKYMn3z7lRDRAV2H9/w6ebTbo\\n0mIVDNIO77TuaXVWZZtJiBwBNou8HW2VsYrnkhK11IwTRnv8N1NRocwxz7teVaGN\\n2opi7fZn1BAg9GDt2nFsQ1nzuvg4x5eKzscv3Hk/9I++XtfzHJprLK4XhBC0mG8e\\nR4ARG5xeKaxgYiQhtaYWUgYWMUIPpDp7U04h1W4DoCUEgRp7tOxPHye2frZeQ3pZ\\ntSaBlvakj5ut0VTwMpLahJDEiTWJi8MbOdK2EgmLoJ0Q2UVNVFNpZqFBtWTXMGs6\\nXjJIOM0kl0YxNQ1RfLOUE3ZUsmXAoJc3hMR7DDF8aQKBgQD/DBUsHMURrGR/Onhp\\nDLb+G2w9FANgleqbGfh6yrHgHKUqnK4g2CPzwidxc23xgxbaAs1icCXAtobhXTiT\\nC/6RcKim0FyVIhlLA0Haeh8mHAyfocG3x69xijpqfDhSGdqb8az8jLS/g4iLWZ2o\\nvQPFoIYXzTVRv485xOp5V7GFeQKBgQC3exANGTnbPOA/CU/UYSwXux1Km2MVXB6r\\nlNEX1lkVjXbDRNzyMDYZoTpJnyTQg/oV4bS8EXSG9cCflDusyPuANAhKOBRKS2sv\\npUTUUNA5etkiYQvhasoRnlbHxU9h/ImUIYzjdIvUd/arsVYM3cQAfOR38IROuKfE\\nVBhp/OXlxQKBgC/PFwTu264lb609y6Z9gKv/ffmxD7UCRTkP1DlIV7GYDQoA1s9H\\nVO3znisxJRHZreXuEov6U8ldLcl/DQTbgbvHr4Wdl01JWA5srOKEc+RT67Xcv5Bw\\nuR2CeNLPOEuDlywWUIQC6DriMC1W/ivMSrG4ForNp8oMK4/7rqxSWO+ZAoGAYo2l\\nh4OfQhWm1fUofglb57tH9oUUaaq7hqo+zbEC1MLRof1hOG2RAZ9KcbUbzyy0rgA4\\nVjSCBOQH/S9gBmVGQgywzzzkGSv9fPAm0mw+DEHiU8cQ3JnBxEjqkA95nkZJl9mV\\nla9KVGvDgWGVuP99gk2TYqE8UBR7eMc6/eMrkYkCgYBp1Zlgmx36r5ZpPniyYGyk\\ntYewQNOTgywAYyXGwagaUPWIZJKXYduCTgycZ5AgGuU71H1w2DarUuC+vqFYXuas\\nu5zxmR1xThDdDnV3hdITSogsbIWDRzmXyD+k6aB622qDIl3eHrbuxWTQT5vA7cF5\\nrxF//envJJ6R9fBY8eXzJQ==\\n-----END PRIVATE KEY-----\\n\",\n" +
            "  \"client_email\": \"firebase-adminsdk-hymjj@ratatoulli.iam.gserviceaccount.com\",\n" +
            "  \"client_id\": \"100283241814759141999\",\n" +
            "  \"auth_uri\": \"https://accounts.google.com/o/oauth2/auth\",\n" +
            "  \"token_uri\": \"https://oauth2.googleapis.com/token\",\n" +
            "  \"auth_provider_x509_cert_url\": \"https://www.googleapis.com/oauth2/v1/certs\",\n" +
            "  \"client_x509_cert_url\": \"https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-hymjj%40ratatoulli.iam.gserviceaccount.com\",\n" +
            "  \"universe_domain\": \"googleapis.com\"\n" +
            "}"),
    URLDATABASE("https://ratatoulli.firebaseio.com/");

    private final String VALUE;

    DatabaseCredentialsFirebase(String VALUE) {
        this.VALUE = VALUE;
    }

    public String getVALUE() {
        return VALUE;
    }
}
