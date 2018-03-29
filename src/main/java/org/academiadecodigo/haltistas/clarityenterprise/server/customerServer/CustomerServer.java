package org.academiadecodigo.haltistas.clarityenterprise.server.customerServer;

import java.io.*;
import java.net.Socket;

public class CustomerServer {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 6000);

            PrintWriter toMainServer = new PrintWriter(socket.getOutputStream(), true);



        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
