package com.company.Networking;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

@Ignore
public class NetworkingServer implements Runnable {

    static private Socket connection;
    static private ObjectOutputStream output;
    static private ObjectInputStream input;
    static private ServerSocket server;


    @Override
    public void run() {
        try {
            server = new ServerSocket(5678, 10);
            while(true){
                connection = server.accept();
                output = new ObjectOutputStream(connection.getOutputStream());
                input = new ObjectInputStream(connection.getInputStream());
                output.writeObject("You've sent: " + (String)input.readObject());// or JOptionPane.showMessageDialog(null, (String)input.readObject());
            }
        } catch (IOException | HeadlessException ignored) {} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
