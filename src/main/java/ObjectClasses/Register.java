package ObjectClasses;

import java.io.Serializable;

public class Register implements Serializable {
    private String username;
    private String password;
    private String passwordConfirm;
    private String email;
    private String emailConfirm;

    public Register(String username, String password, String passwordConfirm, String email, String emailConfirm)
    {
        this.username = username;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.email = email;
        this.emailConfirm = emailConfirm;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getPasswordConfirm()
    {
        return passwordConfirm;
    }

    public String getEmail()
    {
        return email;
    }

    public String getEmailConfirm()
    {
        return emailConfirm;
    }


}
