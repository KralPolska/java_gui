package ObjectClasses;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String username;

    public User(String id, String username)
    {
        this.id = id;
        this.username = username;
    }

    public String getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

}
