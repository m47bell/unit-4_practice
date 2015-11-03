package nyc.c4q.m47bell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Access Code 2-1
 * Marbella Vidals
 */
public class UTFServer {
    public static final int PORT = 5230;


    public static void main(String[] args) throws IOException {
        final ServerSocket ss = new ServerSocket(PORT);


        while (!ss.isClosed()) {
            Socket inboundConnection = ss.accept();


            BufferedReader in = new BufferedReader(new InputStreamReader(inboundConnection.getInputStream()));
            int utcTime= Integer.parseInt(in.readLine());
            System.out.println("SERVER received: " + utcTime);


            PrintWriter out = new PrintWriter(inboundConnection.getOutputStream(), true);
            out.println(convertToTimeZone(utcTime));


            inboundConnection.close();
        }
    }

    private static String convertToTimeZone(int utcTime) {

        TimeZone utcUnit= TimeZone.getTimeZone("UTC");
        utcUnit.getOffset(utcTime);
       return "" + utcTime;

    }
}
