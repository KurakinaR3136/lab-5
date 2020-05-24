package Utilities;

import java.io.*;
import java.util.Scanner;

public class WriterToFile {
    Scanner scanner = new Scanner(System.in);

    public void write(String data) throws IOException {
        OutputStream outputStream = new FileOutputStream(new File(this.getFilename()));
        byte[] dataToBytes = data.getBytes();
        outputStream.write(dataToBytes);
    }

    public String getFilename() {
        Object filename = ReadFromFile.filename;
        while (filename == null) {
            System.out.print("Введите имя файла:\n~ ");
            filename = scanner.nextLine();
            if (filename.equals(""))
                return this.getFilename();
        }
        return (String) filename;
    }
}
