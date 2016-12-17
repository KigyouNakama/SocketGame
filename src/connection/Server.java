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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author linhsama
 */
public class Server {

    public final static int DEFAULT_PORT = 5000;
public static void main(String[] args) {
try(ServerSocket servSocket = new ServerSocket(DEFAULT_PORT)
){
while(true
){
Runnable t = new s(servSocket.accept());
new Thread(t).start();
}
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
     }

