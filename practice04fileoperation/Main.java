package kz.epam.khassenov.practice04fileoperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        try {
            fileOperation.fileCopy();
            fileOperation.fileDelete();
            fileOperation.fileMove();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}