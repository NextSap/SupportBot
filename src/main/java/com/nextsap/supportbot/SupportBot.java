package com.nextsap.supportbot;

import com.nextsap.supportbot.cache.CacheManager;
import com.nextsap.supportbot.config.ConfigManager;
import com.nextsap.supportbot.setup.Initializer;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class SupportBot {

    private static JDA jda;

    private static CacheManager cache;
    private static ConfigManager config;

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder("YOUR TOKEN")
                .setActivity(Activity.playing("Launching..."))
                .build();

        new Register();

        cache = new CacheManager();
        config = new ConfigManager();

        new Initializer();
    }

    public static JDA getJda() {
        return jda;
    }

    public static CacheManager getCache() {
        return cache;
    }

    public static ConfigManager getConfig() {
        return config;
    }
}
