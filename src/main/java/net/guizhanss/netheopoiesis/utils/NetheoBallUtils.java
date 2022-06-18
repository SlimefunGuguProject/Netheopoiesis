package net.guizhanss.netheopoiesis.utils;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

public final class NetheoBallUtils {

    private static final Map<String, String> BALL_NAMES = new HashMap<>();

    private NetheoBallUtils() {}

    static {
        BALL_NAMES.put("SWEET", "甜味");
        BALL_NAMES.put("TANGY", "辛味");
        BALL_NAMES.put("POPCORN", "爆米花味");
        BALL_NAMES.put("BITTERSWEET", "苦偏甜味");
        BALL_NAMES.put("SWEETPEA", "香豌豆味");
        BALL_NAMES.put("CANDY", "糖味");
        BALL_NAMES.put("COMPLEX", "复合味");
        BALL_NAMES.put("CITRUS", "酸味");
        BALL_NAMES.put("BAD", "怪味");
        BALL_NAMES.put("SALTED_CARAMEL", "咸焦糖味");
        BALL_NAMES.put("COCOA", "可可味");
        BALL_NAMES.put("TOMATO", "番茄味");
        BALL_NAMES.put("BERRY", "浆果味");
        BALL_NAMES.put("TERIYAKI", "红烧味");
        BALL_NAMES.put("SOY", "酱油味");
        BALL_NAMES.put("TART", "辣味");
        BALL_NAMES.put("GROSS", "糟味");
        BALL_NAMES.put("SPOILT", "腐味");
        BALL_NAMES.put("BONITO", "鲣鱼味");
        BALL_NAMES.put("SEAWEED", "海藻味");
        BALL_NAMES.put("ASTRINGENT", "涩味");
        BALL_NAMES.put("TASTY", "美味");
        BALL_NAMES.put("GREEN_TEA", "绿茶味");
        BALL_NAMES.put("BROTHY", "多汁");
        BALL_NAMES.put("VEGEMITE", "维洁麦味");
        BALL_NAMES.put("SALTY", "咸味");
        BALL_NAMES.put("NASTY", "臭味");
        BALL_NAMES.put("ANCHOVY", "鳀味");
        BALL_NAMES.put("GRIM", "针刺味");
        BALL_NAMES.put("SUSHI", "寿司味");
        BALL_NAMES.put("FISHY", "腥味");
        BALL_NAMES.put("CRUCIFEROUS", "花味");
        BALL_NAMES.put("HEALTHY", "益味");
        BALL_NAMES.put("FUNGI", "蘑菇味");
        BALL_NAMES.put("SAVOURY", "齁咸味");
    }

    @Nonnull
    public static String getName(String ball) {
        return BALL_NAMES.getOrDefault(ball, "");
    }
}
