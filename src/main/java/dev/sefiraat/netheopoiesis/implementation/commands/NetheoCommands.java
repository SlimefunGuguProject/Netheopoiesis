package dev.sefiraat.netheopoiesis.implementation.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import dev.sefiraat.netheopoiesis.Netheopoiesis;
import dev.sefiraat.netheopoiesis.api.mobs.MobCap;
import dev.sefiraat.netheopoiesis.api.mobs.MobCapType;
import dev.sefiraat.netheopoiesis.managers.MobManager;
import dev.sefiraat.netheopoiesis.utils.TextUtils;
import dev.sefiraat.netheopoiesis.utils.Theme;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("netheopoiesis|netheo")
public class NetheoCommands extends BaseCommand {

    @Default
    public void onDefault(CommandSender sender) {
        sender.sendMessage(Theme.ERROR + "请输入子指令.");
    }

    @Subcommand("MobCaps")
    @Description("显示生物上限设置信息")
    @CommandPermission("netheopoiesis.admin.mobcaps")
    public void viewMobCaps(CommandSender sender) {
        final MobCapType[] mobCapTypes = MobCapType.values();
        final String[] messages = new String[mobCapTypes.length];

        for (int i = 0; i < mobCapTypes.length; i++) {
            final MobCapType type = mobCapTypes[i];
            final MobCap mobCap = MobManager.getInstance().getMobCap(type);
            messages[i] = TextUtils.toTitleCase(type.name()) + ": " + mobCap.count() + "/" + mobCap.getMaxAmount();
        }

        for (String message : messages) {
            if (sender instanceof Player player) {
                player.sendMessage(Theme.CLICK_INFO.apply(message));
            } else {
                Netheopoiesis.logInfo(message);
            }
        }
    }

    @Subcommand("PurgeMobCap")
    @Description("清除指定类型的所有生物")
    @CommandPermission("netheopoiesis.admin.mobcaps")
    @CommandCompletion("@MOB_CAPS")
    public void purgeMobCap(CommandSender sender, String mobCapType) {
        final MobCap mobCap = MobManager.getInstance().getMobCap(MobCapType.valueOf(mobCapType));
        final String message = "已清除指定类型的所有生物";

        mobCap.killAllMobs();
        if (sender instanceof Player player) {
            player.sendMessage(Theme.SUCCESS.apply(message));
        } else {
            Netheopoiesis.logInfo(message);
        }
    }

    @Subcommand("PurgeAllMobCap")
    @Description("清除所有生物")
    @CommandPermission("netheopoiesis.admin.mobcaps")
    public void purgeMobCap(CommandSender sender) {
        final String message = "已清除所有生物";

        for (MobCapType type : MobCapType.values()) {
            MobManager.getInstance().getMobCap(type).killAllMobs();
        }

        if (sender instanceof Player player) {
            player.sendMessage(Theme.SUCCESS.apply(message));
        } else {
            Netheopoiesis.logInfo(message);
        }
    }

}

