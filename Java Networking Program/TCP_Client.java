import java.io.*;
import java.net.*;
import java.util.*;

public class TCP_Client {
 public static void main(String[] args) throws Exception {
    Socket s=new Socket("localhost",4311);
    System.out.println("Server is connected");
    Scanner sc=new Scanner(System.in);

    OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
    PrintWriter pw=new PrintWriter(osw);
    BufferedReader broutput =new BufferedReader(new InputStreamReader(s.getInputStream()));
    String receiveMessage, sendMessage;
    boolean end=true;
   while(end){
        receiveMessage = broutput.readLine();
        if( receiveMessage != null ) 
        { 
          System.out.print("Server : - ");
          System.out.println(receiveMessage);
         }

     sendMessage = sc.nextLine();
     pw.println(sendMessage);
     pw.flush();
      if(sendMessage.equalsIgnoreCase("bye") || sendMessage.equalsIgnoreCase("good night") || sendMessage.equalsIgnoreCase("see you") )
      {
        end=false;
      }

    }
    s.close();
   }
}
