package com.vladproduction.working_with_threads;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main04 {
    public static void main(String[] args) {

        try {
//            URL webSite = new URL("https://google.com");
            URL travel = new URL("https://nicepage.com/html-templates/preview/travel-blog-21070?device=desktop");
            ReadableByteChannel rbc = Channels.newChannel(travel.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("travel.html");
            fileOutputStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
