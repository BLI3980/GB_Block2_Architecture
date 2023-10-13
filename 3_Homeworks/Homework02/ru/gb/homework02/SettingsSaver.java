package ru.gb.homework02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SettingsSaver {
    public static void saveAs(String path, Settings settings) {
        try(FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(settings);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Settings load(String path) {
        Settings settings = null;
        try(FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            settings = (Settings) (objectIn.readObject());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return settings;
    }
}
