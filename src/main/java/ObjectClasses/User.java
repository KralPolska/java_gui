package ObjectClasses;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String username;

    private String email;
    private Integer polecenie;

    public User(Integer id, String username, String email, Integer polecenie) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.polecenie = polecenie;
    }

    public String getEmail() {
        return email;
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
