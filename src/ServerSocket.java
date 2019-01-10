
import java.io.*;
import java.net.*;

public class ServerSocket {

    public static void main(String args[]) throws IOException{
        ServerSocket serverSocket=null;
        PrintWriter out=null;
        try{
            //实例化一个服务器端的Socket连接
            serverSocket=new ServerSocket();
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
