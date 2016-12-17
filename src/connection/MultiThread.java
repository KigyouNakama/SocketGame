/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author linhsama
 */
public class s implements Runnable{
    private Socket socket;
    
    
    public s(Socket s){
        socket = s;
    }
    
    @Override
    public void run(){
        try(BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()))
        ){
            String message;
                while((message = in.readLine()) != null){
                System.out.println("Receive from client:" + message);
                out.println(message);
                out.flush();
            }
            System.out.println("Client has stopped sending data!");
            socket.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
