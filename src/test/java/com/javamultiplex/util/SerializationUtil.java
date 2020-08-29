package com.javamultiplex.util;

import java.io.*;

/**
 * @author Rohit Agarwal on 29/08/20 6:58 pm
 * @copyright www.javamultiplex.com
 */
public final class SerializationUtil {
    public static void serialize(Object object, String fileName) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(new File(fileName));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(object);
        }
    }


    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (InputStream inputStream = new FileInputStream(new File(fileName));
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            return objectInputStream.readObject();
        }
    }
}
