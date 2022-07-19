package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("search.maven.org",80);

        InputStream response = socket.getInputStream();
        OutputStream request = socket.getOutputStream();

        byte[] data = ("GET /solrsearch/select?q=guice&rows=22&wt=json HTTP/1.1\n"
                + "host: search.maven.org\n\n").getBytes();

        request.write(data);

        int c;

        while((c = response.read()) != -1) {
            System.out.print((char) c);
        }

        socket.close();
    }
}
