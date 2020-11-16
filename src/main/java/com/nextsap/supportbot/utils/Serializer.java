package com.nextsap.supportbot.utils;

import com.google.gson.Gson;

public class Serializer {

    public static String serialize(Object object) {
        return new Gson().toJson(object);
    }

    public static Object deserialize(String json, Class<?> _class) {
        try {
            return new Gson().fromJson(json, _class);
        } catch (Exception exception) {
            return null;
        }
    }

}
