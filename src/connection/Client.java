/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author linhsama
 */
public class Client {
    
    public static void main(String[] args) {
        try(Socket clientSocket = new Socket("localhost", 5000);
            BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        ) {
            String message;
            while(true) {
                System.out.print("Send to server: ");
                message = user.readLine();
                if(message.length() == 0)
                    break;
                out.println(message);
                out.flush();
                String reply;
                reply = in.readLine();
                System.out.println("Reply from Server:" + reply);
            }
            clientSocket.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}