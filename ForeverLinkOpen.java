package dev.hause.perry;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * @author hausemasterissue, perry
 * Started 11/16/2021.
 */
public class ForeverLinkOpen {

    public static void main(String[] args) {
        try {
            // open a url forever
            for (;;) {
                String url = "your url here";
                Desktop.getDesktop().browse(URI.create(url));
            }
        } catch (IOException ignored) {
        }
    }
}
