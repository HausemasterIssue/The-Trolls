package com.perry;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

/**
 * @author perry.
 * Started 11/16/2021.
 */
public
class ForeverLinkOpen {

    public static
    void main(String[] args) {
        try {
            // open a url forever
            for (; ; ) {
                String url = "pornhub.com";
                Desktop.getDesktop().browse(URI.create(url));
            }
        } catch (IOException ignored) {
        }
    }
}
