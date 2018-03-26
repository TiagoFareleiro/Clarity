package org.academiadecodigo.haltistas.clarityenterprise.server.mainServer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket socket = serverSocket.accept();


            BufferedReader receivedConnection = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {

                String readConnection = receivedConnection.readLine();

                //when accessed in online account and accessed trough a click it will than access to the information requested

            }

        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}
