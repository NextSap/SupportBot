package com.nextsap.supportbot.config;

import com.nextsap.supportbot.utils.Serializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ConfigManager {

    private CustomConfig config;

    public void saveConfig() {
        try {
            Files.write(Paths.get("Config.txt"), Serializer.serialize(this.config).getBytes(), StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getConfig() {
        try {
            File file = new File("Config.txt");
            Scanner scanner = new Scanner(file);
            String content = null;
            while (scanner.hasNextLine()) {
                content = scanner.nextLine();
            }

            this.config = (CustomConfig) Serializer.deserialize(content, CustomConfig.class);
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.config = new CustomConfig();
    }

    public void createFile() {
        try {
            File file = new File("Config.txt");

            if (!file.exists())
                file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CustomConfig getCustomConfig() {
        return this.config;
    }
}
