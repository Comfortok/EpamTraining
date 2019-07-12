package kz.epam.khassenov.lecture04iostream;

import java.io.*;

public class CharStreamClassSample {
    public static void main(String[] args) throws IOException {
        {
            String tmp = "qwertyuiopasdfghjklzxcvbnm";
            int length = tmp.length();
            char charArray[] = new char[length];
            tmp.getChars(0, length, charArray, 0);
            CharArrayReader inputOne = new CharArrayReader(charArray);
            CharArrayReader inputTwo = new CharArrayReader(charArray, 0, 6);
            int readedChar;
            System.out.println("inputOne is: ");
            while ((readedChar = inputOne.read()) != -1){
                System.out.print((char) readedChar);
            }
            System.out.println();
            System.out.println("inputTwo is: ");
            while ((readedChar = inputTwo.read()) != -1){
                System.out.print((char) readedChar);
            }
        }
        {
            Writer outputWriter = new BufferedWriter(
                    new OutputStreamWriter(
                    new FileOutputStream("C:\\outputWriterText.txt"),"UTF16"));
            outputWriter.write("ЛОЛКЕК");
            outputWriter.close();
        }
        {
            String stringOne = "if (a == 4) a = 0;\n";
            char charBuffer[] = new char[stringOne.length()];
            stringOne.getChars(0, stringOne.length(), charBuffer,0);
            CharArrayReader charArrayReader = new CharArrayReader(charBuffer);
            PushbackReader pushbackReader = new PushbackReader(charArrayReader);
            int readedChar;
            while ((readedChar = pushbackReader.read()) != -1){
                switch (readedChar){
                    case '=':
                        if ((readedChar = pushbackReader.read()) == '='){
                            System.out.print(".eq.");
                        }
                        else {
                            System.out.print("<-");
                            pushbackReader.unread(readedChar);
                        }
                        break;
                        default:
                            System.out.print((char) readedChar);
                            break;
                }
            }
        }
        {
            FileReader fileReader = new FileReader("C:\\Users\\Olzhas\\IdeaProjects" +
                    "\\EpamPractice\\src\\kz\\epam\\khassenov\\lecture04\\CharStreamClassSample.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String stringOne;
            while ((stringOne = bufferedReader.readLine()) != null){
                System.out.println(stringOne);
            }
            fileReader.close();
        }
    }
}
