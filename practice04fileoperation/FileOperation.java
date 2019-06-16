package kz.epam.khassenov.practice04fileoperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class FileOperation {
    protected void fileCopy() throws IOException {
            Scanner scannerCopy = new Scanner(System.in);
            System.out.print("Enter the file name and path you wanted to copy: ");
            File currentFile = new File(scannerCopy.nextLine());
            System.out.print("Enter the new file name and path: ");
            File coppiedFile = new File(scannerCopy.nextLine());
            Files.copy(currentFile.toPath(), coppiedFile.toPath());
            System.out.print(currentFile.getPath() + " has successfully copied into " + coppiedFile.getPath() + "\n");
    }

    protected void fileDelete() {
        Scanner scannerDelete = new Scanner(System.in);
        System.out.print("Enter the file name and path you wanted to delete: ");
        File currentFile = new File(scannerDelete.nextLine());
        currentFile.delete();
        System.out.print(currentFile.getName() + " has successfully deleted.\n");
    }

    protected void fileMove() throws IOException {
        Scanner scannerReplace = new Scanner(System.in);
        System.out.print("Enter the file name and path you wanted to replace: ");
        File currentFile = new File(scannerReplace.nextLine());
        System.out.print("Enter the new path: ");
        File replacedFile = new File(scannerReplace.nextLine() + currentFile.getName());
        Files.copy(currentFile.toPath(), replacedFile.toPath());
        currentFile.delete();
        System.out.print(currentFile.getPath() + " has successfully moved to " + replacedFile.getPath() + "\n");
    }
}
