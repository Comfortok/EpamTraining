package kz.epam.khassenov.lecture03string;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTF16EncodingSample {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReaderBE = new InputStreamReader(
                    new FileInputStream("C:\\test16be.txt"), "utf16");
            InputStreamReader inputStreamReaderLE = new InputStreamReader(
                    new FileInputStream("C:\\test16le.txt"), "utf16");
            char[] charArray = new char[40];
            inputStreamReaderBE.read(charArray);
            System.out.println(new String(charArray).trim());
            charArray = new char[40];
            inputStreamReaderLE.read(charArray);
            System.out.println(new String(charArray).trim());
            inputStreamReaderBE.close();
            inputStreamReaderLE.close();
        }catch (IOException ioexception){
            ioexception.printStackTrace();
        }
    }
}
