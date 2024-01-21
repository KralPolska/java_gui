package ServerConnection;
import ObjectClasses.Register;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RegisterClient {
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public RegisterClient(String serverAddress, int port) throws IOException {
        socket = new Socket(serverAddress, port);
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    public boolean sendRegister(Register register) throws IOException, ClassNotFoundException {
        out.writeObject(register);
        return in.readBoolean();
    }

    public void closeConnection() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
