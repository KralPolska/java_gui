package ObjectClasses;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer polecenie;

    public User(Integer id, String username, Integer polecenie) {
        this.id = id;
        this.username = username;
        this.polecenie = polecenie;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Integer getPolecenie() {
        return polecenie;
    }
}
