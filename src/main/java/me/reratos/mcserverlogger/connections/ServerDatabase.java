package me.reratos.mcserverlogger.connections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerDatabase {
    private String dialect;
    private String url;
    private int port;
    private String schema;
    private String username;
    private String passwordBase64;
    private String timeZone;

    /* Constructors */
    public ServerDatabase(String url, int port, String schema, String username, String passwordBase64, String timeZone) {
        this.url = url;
        this.port = port;
        this.schema = schema;
        this.username = username;
        this.passwordBase64 = passwordBase64;
        this.timeZone = timeZone;
    }

    public ServerDatabase(String url, int port, String schema, String username, String passwordBase64) {
        this.url = url;
        this.port = port;
        this.schema = schema;
        this.username = username;
        this.passwordBase64 = passwordBase64;
    }

    public ServerDatabase(String url, String schema, String username, String passwordBase64) {
        this.url = url;
        this.schema = schema;
        this.username = username;
        this.passwordBase64 = passwordBase64;
    }

}
