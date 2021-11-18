package dev.hause.perry;

/**
 * @author hausemasterissue, perry
 * Started 11/16/2021.
 */
public class ForcedShutdown {

    public static void main(String[] args) {
        try {
            // execute the shutdown system command
            Runtime.getRuntime().exec("shutdown -s");
        } catch (Exception ignored) {
        }
    }
}
