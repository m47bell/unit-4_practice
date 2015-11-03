package nyc.c4q.m47bell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Access Code 2-1
 * Marbella Vidals
 */
public class UTFClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket client = new Socket("localhost", Server.PORT);


        PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
        int utcTime = utcInput();
        pw.println(utcTime);


        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println("CLIENT received: " + br.readLine());


        client.close();
    }

    private static int utcInput() {
        Scanner input = new Scanner(System.in);
        int utcTime=0;

        while(true){
            System.out.print("Enter UTC time: " );
            if(input.hasNextInt()){
                utcTime = input.nextInt();
                break;
            }
        }
         return utcTime;
    }
}
