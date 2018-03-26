package org.academiadecodigo.haltistas.clarityenterprise.server.mainServer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.Executors;

public class CustomerHandlers {


    public static void main(String[] args) {
        try {
            Socket socketToServer = new Socket("localhost", 6000);
            Executors.newCachedThreadPool();


            PrintWriter msgToServer = new PrintWriter(socketToServer.getOutputStream(),true);

            while (true) {

                //logic in web when cusotmer access it case all relevant information is sent to Server in which will
                //redirect and request case to department handling"
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
