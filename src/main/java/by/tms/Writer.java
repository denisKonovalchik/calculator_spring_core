package by.tms;

import java.io.PrintWriter;

public class Writer {

    public static PrintWriter getPrint(){
        PrintWriter pw = new PrintWriter(System.out, true);
        String text = "";
        return pw.append(text);
    }
}
