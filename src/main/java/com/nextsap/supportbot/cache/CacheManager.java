package com.nextsap.supportbot.cache;

import com.nextsap.supportbot.object.CustomTicket;
import com.nextsap.supportbot.utils.Serializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CacheManager {

    private Map<String, CustomTicket> tickets = new HashMap<>();

    public void addCache(String id, CustomTicket ticket) {
        tickets.put(id, ticket);
    }

    public void removeCache(String id) {
        tickets.remove(id);
    }

    public void saveCache() {
        try {
            Files.write(Paths.get("Cache.txt"), Serializer.serialize(tickets).getBytes(), StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getCache() {
        try {
            File file = new File("Cache.txt");
            Scanner scanner = new Scanner(file);
            String content = null;
            while (scanner.hasNextLine()) {
                content = scanner.nextLine();
            }
            this.tickets = (Map<String, CustomTicket>) Serializer.deserialize(content, HashMap.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createFile() {
        try {
            File file = new File("Cache.txt");

            if (!file.exists())
                file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
