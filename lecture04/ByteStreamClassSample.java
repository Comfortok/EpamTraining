package kz.epam.khassenov.lecture04;

import java.io.*;

public class ByteStreamClassSample {
    public static void main(String[] args) throws IOException {
        {
            byte[] bytesArray = {1, -1, 0};
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytesArray);
            int readedInt = byteArrayInputStream.read();
            System.out.println("First element: " + readedInt);
            readedInt = byteArrayInputStream.read();
            System.out.println("Second element: " + (byte) readedInt);
            readedInt = byteArrayInputStream.read();
            System.out.println("Third element: " + readedInt);
        }
        {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(10);
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(110);
            byte[] bytesArray = byteArrayOutputStream.toByteArray();
            System.out.println(bytesArray[0] + " " + bytesArray[1] + " " + bytesArray[2]);
        }
        {
            byte[] bytesToWrite = {1, 2, 3};
            byte[] bytesReaded = new byte[10];
            String fileName = "C:\\TextFile.txt";
            FileInputStream inputFile = null;
            FileOutputStream outputFile = null;
            outputFile = new FileOutputStream(fileName);
            System.out.println("File is open to write.");
            outputFile.write(bytesToWrite);
            System.out.println(bytesToWrite.length + " bytes has written.");
            outputFile.close();
            System.out.println("Output Stream has closed.");
            inputFile = new FileInputStream(fileName);
            System.out.println("File is open to read.");
            int bytesAvailable = inputFile.available();
            System.out.println(bytesAvailable + " bytes are ready to be read.");
            int count = inputFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println(count + " bytes has read.");
            inputFile.close();
            System.out.println("Input Stream has closed.");
        }
        {
            FileInputStream inputFileOne = null;
            FileInputStream inputFileTwo = null;
            SequenceInputStream sequenceInputStream = null;
            FileOutputStream outputFile = null;
            inputFileOne = new FileInputStream("C:\\FileOne.txt");
            inputFileTwo = new FileInputStream("C:\\FileTwo.txt");
            sequenceInputStream = new SequenceInputStream(inputFileOne, inputFileTwo);
            outputFile = new FileOutputStream("C:\\FileThree.txt");
            int readedByte = sequenceInputStream.read();
            while (readedByte != -1){
                outputFile.write(readedByte);
                readedByte = sequenceInputStream.read();
            }
        }
    }
}
