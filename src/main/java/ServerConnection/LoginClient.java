package ServerConnection;

import java.io.*;
import java.net.Socket;

import ObjectClasses.Login;
import ObjectClasses.User;

public class LoginClient {

    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public LoginClient(String serverAddress, int port) throws IOException {
        socket = new Socket(serverAddress, port);
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    public User sendLogin(Login login) throws IOException, ClassNotFoundException {
        out.writeObject(login);
        return (User) in.readObject();
    }

    public void closeConnection() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}