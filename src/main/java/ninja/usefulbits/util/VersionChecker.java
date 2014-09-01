package ninja.usefulbits.util;

import ninja.usefulbits.UsefulBits;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class VersionChecker 
{
    public void doYourThing()
    {
        try
        {
            URLConnection connection = new URL("https://raw.githubusercontent.com/ViolentMod/VersionFiles/master/UsefulBits.txt").openConnection();
            connection.connect();

            Scanner scanner = new Scanner(connection.getInputStream());
            String version = scanner.nextLine();

            scanner.close();

            if(!version.equals(UsefulBits.MOD_VERSION))
            {
                LogHelper.info("A NEW version of Useful Bits is avaliable, " + version + "! Get it as soon as possible ;)");
            }
        }
        catch(Exception e)
        {
            LogHelper.info(e);
        }
    }
}
