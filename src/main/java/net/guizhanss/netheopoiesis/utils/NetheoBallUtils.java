package net.guizhanss.netheopoiesis.utils;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public final class NetheoBallUtils {

    private static final Map<String, String> BALL_NAMES = new HashMap<>();

    private NetheoBallUtils() {}

    static {
        BALL_NAMES.put("SWEET", "甜味");
    }

    @Nonnull
    public static String getName(String ball) {
        return BALL_NAMES.getOrDefault(ball, "");
    }
}
