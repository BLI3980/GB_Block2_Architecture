package ru.gb.homework02;

public class Main {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        settings1.ip = "192.168.0.1";
        settings1.port = 8081;
        settings1.username = "admin";
        System.out.println(settings1.getInfo());

        String path = "Settings.java.bin";
        SettingsSaver.saveAs(path, settings1);

        Settings settings2 = SettingsSaver.load(path);
        settings2.ip = "255.255.255.0";
        System.out.println(settings2.getInfo());
        System.out.println(settings1.getInfo());
        System.out.println(settings1 == settings2);

    }
}
