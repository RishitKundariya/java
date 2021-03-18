import java.io.*;
import java.net.*;
import java.util.*;

public class TCP_Server {
     public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4311);
        Socket s = ss.accept( ); 
        System.out.println("Client Connected");
        OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(osw);
        BufferedReader broutput =new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc=new Scanner(System.in);
        String receiveMessage,sendMessage;
        boolean end=true;
        while(end){
          
           sendMessage = sc.nextLine(); 
           pw.println(sendMessage);             
           pw.flush();
           receiveMessage=broutput.readLine();
           if(receiveMessage.equalsIgnoreCase("bye")||receiveMessage.equalsIgnoreCase("good night")||receiveMessage.equalsIgnoreCase("see you") )
           {
               end=false;
           }
           System.out.print("Client :-");
           System.out.println(receiveMessage);
          
           
        }      
        ss.close();
        s.close();
         
              
    }
}

