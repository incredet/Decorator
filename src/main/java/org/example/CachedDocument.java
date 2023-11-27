package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CachedDocument extends SmartDocument {
    private static final String DB_URL = "jdbc:sqlite:database.db";
    public CachedDocument(String gcsPath) {
        super(gcsPath);
    }

}