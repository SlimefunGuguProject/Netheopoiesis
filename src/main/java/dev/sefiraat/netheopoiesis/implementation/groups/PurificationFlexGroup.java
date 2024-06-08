package dev.sefiraat.netheopoiesis.implementation.groups;

import dev.sefiraat.netheopoiesis.Purification;
import dev.sefiraat.netheopoiesis.implementation.Groups;
import dev.sefiraat.netheopoiesis.utils.ItemStackUtils;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("java:S1192")
public class PurificationFlexGroup extends FlexItemGroup {

    private static final int GUIDE_BACK = 1;

    private static final int SLEEP_SLOT = 9;
    private static final int WATER_SLOT = 10;
    private static final int REGEN_SLOT = 11;
    private static final int MOB_1_SLOT = 12;
    private static final int MOB_2_SLOT = 13;
    private static final int PIGLIN_SLOT = 14;
    private static final int BARTERING_SLOT = 15;
    private static final int END_CAKE_SLOT = 16;


    private static final int[] HEADER = new int[]{
        0, 1, 2, 3, 4, 5, 6, 7, 8
    };
    private static final int[] FOOTER = new int[]{
        45, 46, 47, 48, 49, 50, 51, 52, 53
    };

    private static final ItemStack SLEEP_STACK = new CustomItemStack(
        Material.BLACK_BED,
        Theme.MAIN + "在下界睡觉",
        Theme.PASSIVE.apply("你终于能在下界睡觉了!"),
        Theme.PASSIVE.apply("但是, 先看一眼净化等级,"),
        Theme.PASSIVE.apply("不然你就会爆炸的!"),
        "",
        Theme.CLICK_INFO.asTitle("需要净化值达到", Purification.SLEEP_IN_BED)
    );

    private static final ItemStack WATER_STACK = new CustomItemStack(
        Material.BUCKET,
        Theme.MAIN + "在下界放水",
        Theme.PASSIVE.apply("当净化等级足够高时,"),
        Theme.PASSIVE.apply("你就可以在下界中放水了."),
        Theme.PASSIVE.apply("你可以用来种植主世界的植物."),
        Theme.PASSIVE.apply("水也可以增加净化值."),
        "",
        Theme.CLICK_INFO.asTitle("需要净化值达到", Purification.PLACE_WATER)
    );

    private static final ItemStack REGEN_STACK = new CustomItemStack(
        ItemStackUtils.enchantedItemStack(Material.APPLE),
        Theme.MAIN + "恢复光环",
        Theme.PASSIVE.apply("当净化等级足够高时,"),
        Theme.PASSIVE.apply("你会被治疗迷雾笼罩,"),
        Theme.PASSIVE.apply("效果会随着净化等级提升"),
        Theme.PASSIVE.apply("而增强。"),
        "",
        Theme.PASSIVE.apply("净化值需求:"),
        Theme.CLICK_INFO.asTitle("生命恢复1", Purification.REGEN_1),
        Theme.CLICK_INFO.asTitle("生命恢复2", Purification.REGEN_2),
        Theme.CLICK_INFO.asTitle("生命恢复3", Purification.REGEN_3)
    );

    private static final ItemStack MOBS_1_STACK = new CustomItemStack(
        Material.SPAWNER,
        Theme.MAIN + "生物生成 1",
        Theme.PASSIVE.apply("当净化等级足够高时,"),
        Theme.PASSIVE.apply("某些下界生物将不再生成,"),
        Theme.PASSIVE.apply("取而代之,生成主世界生物."),
        Theme.PASSIVE.apply("当下界为白天(?)时, 生成友好生物."),
        Theme.PASSIVE.apply("当下界为夜间时, 生成敌对生物."),
        Theme.PASSIVE.apply("净化等级提升会取代更多生物."),
        "",
        Theme.PASSIVE.apply("净化值需求:"),
        Theme.CLICK_INFO.asTitle("岩浆怪", Purification.SWAP_MAGMA_CUBE),
        Theme.CLICK_INFO.asTitle("烈焰人", Purification.SWAP_BLAZE),
        Theme.CLICK_INFO.asTitle("僵尸猪灵", Purification.SWAP_ZOMBIFIED_PIGLIN),
        Theme.CLICK_INFO.asTitle("疣猪兽", Purification.SWAP_HOGLIN),
        Theme.CLICK_INFO.asTitle("猪灵蛮兵", Purification.SWAP_PIGLIN_BRUTE),
        Theme.CLICK_INFO.asTitle("恶魂", Purification.SWAP_GHAST),
        Theme.CLICK_INFO.asTitle("凋零骷髅", Purification.SWAP_WITHER_SKELETON)
    );

    private static final ItemStack MOBS_2_STACK = new CustomItemStack(
        Material.SPAWNER,
        Theme.MAIN + "生物生成 2",
        Theme.PASSIVE.apply("当净化等级足够高时,"),
        Theme.PASSIVE.apply("这些友好生物将生成在玩家附近."),
        Theme.PASSIVE.apply("净化等级提升会生成更多生物."),
        "",
        Theme.PASSIVE.apply("净化值需求:"),
        Theme.CLICK_INFO.asTitle("鱿鱼", Purification.SPAWN_SQUID),
        Theme.CLICK_INFO.asTitle("鲑鱼", Purification.SPAWN_SALMON),
        Theme.CLICK_INFO.asTitle("鳕鱼", Purification.SPAWN_COD),
        Theme.CLICK_INFO.asTitle("河豚", Purification.SPAWN_PUFFER_FISH),
        Theme.CLICK_INFO.asTitle("热带鱼", Purification.SPAWN_TROPICAL_FISH),
        Theme.CLICK_INFO.asTitle("美西螈", Purification.SPAWN_AXOLOTL),
        Theme.CLICK_INFO.asTitle("流浪商人", Purification.WANDERING_TRADER),
        Theme.CLICK_INFO.asTitle("流浪猪灵", Purification.WANDERING_PIGLIN)
    );

    private static final ItemStack PIGLIN_STACK = new CustomItemStack(
        Material.PIGLIN_SPAWN_EGG,
        Theme.MAIN + "友好生物",
        Theme.PASSIVE.apply("当净化等级足够高时,"),
        Theme.PASSIVE.apply("附近的猪灵将不再视你为敌,"),
        Theme.PASSIVE.apply("它们会非常满意你所做的一切,"),
        Theme.PASSIVE.apply("其他的生物也会紧随其后."),
        "",
        Theme.PASSIVE.apply("净化值需求:"),
        Theme.CLICK_INFO.asTitle("猪灵", Purification.FRIENDLY_PIGLINS),
        Theme.CLICK_INFO.asTitle("疣猪兽", Purification.FRIENDLY_HOGLINS)
    );

    private static final ItemStack BARTERING_STACK = new CustomItemStack(
        Material.GOLD_INGOT,
        Theme.MAIN + "更好的交易",
        Theme.PASSIVE.apply("随着净化等级的提升,"),
        Theme.PASSIVE.apply("你会有更高的几率"),
        Theme.PASSIVE.apply("从猪灵交易中获得双倍物品."),
        "",
        Theme.CLICK_INFO.asTitle("双倍概率", "(净化值 / " + Purification.FRIENDLY_PIGLINS + ") * 5%")
    );

    private static final ItemStack ENDER_CAKE = new CustomItemStack(
        Material.CAKE,
        Theme.MAIN + "深入末地!",
        Theme.PASSIVE.apply("你可以从全新的下界植物中"),
        Theme.PASSIVE.apply("获取材料, 来制作末影蛋糕."),
        Theme.PASSIVE.apply("如果净化等级足够, 你就能够"),
        Theme.PASSIVE.apply("传送到末地."),
        "",
        Theme.CLICK_INFO.asTitle("需要净化值达到", Purification.ENDER_CAKE)
    );

    public PurificationFlexGroup(NamespacedKey key, ItemStack item) {
        super(key, item);
    }

    @Override
    @ParametersAreNonnullByDefault
    public boolean isVisible(Player player, PlayerProfile playerProfile, SlimefunGuideMode guideMode) {
        return true;
    }

    @Override
    @ParametersAreNonnullByDefault
    public void open(Player p, PlayerProfile profile, SlimefunGuideMode mode) {
        final ChestMenu chestMenu = new ChestMenu(Theme.MAIN.getColor() + "净化协议");

        for (int slot : HEADER) {
            chestMenu.addItem(slot, ChestMenuUtils.getBackground(), (player1, i1, itemStack, clickAction) -> false);
        }

        for (int slot : FOOTER) {
            chestMenu.addItem(slot, ChestMenuUtils.getBackground(), (player1, i1, itemStack, clickAction) -> false);
        }

        chestMenu.setEmptySlotsClickable(false);
        setupPage(p, profile, mode, chestMenu);
        chestMenu.open(p);
    }

    @ParametersAreNonnullByDefault
    private void setupPage(Player player, PlayerProfile profile, SlimefunGuideMode mode, ChestMenu menu) {
        for (int slot : FOOTER) {
            menu.replaceExistingItem(slot, ChestMenuUtils.getBackground());
            menu.addMenuClickHandler(slot, ((player1, i, itemStack, clickAction) -> false));
        }

        // Sound
        menu.addMenuOpeningHandler((p) -> p.playSound(p.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1.0F, 1.0F));

        // Back
        menu.replaceExistingItem(
            GUIDE_BACK,
            ChestMenuUtils.getBackButton(
                player,
                "",
                ChatColor.GRAY + Slimefun.getLocalization().getMessage(player, "guide.back.guide")
            )
        );
        menu.addMenuClickHandler(GUIDE_BACK, (player1, slot, itemStack, clickAction) -> {
            openPage(profile, Groups.MAIN, mode, 1);
            return false;
        });

        menu.replaceExistingItem(SLEEP_SLOT, SLEEP_STACK);
        menu.addMenuClickHandler(SLEEP_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(WATER_SLOT, WATER_STACK);
        menu.addMenuClickHandler(WATER_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(REGEN_SLOT, REGEN_STACK);
        menu.addMenuClickHandler(REGEN_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(MOB_1_SLOT, MOBS_1_STACK);
        menu.addMenuClickHandler(MOB_1_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(MOB_2_SLOT, MOBS_2_STACK);
        menu.addMenuClickHandler(MOB_2_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(PIGLIN_SLOT, PIGLIN_STACK);
        menu.addMenuClickHandler(PIGLIN_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(BARTERING_SLOT, BARTERING_STACK);
        menu.addMenuClickHandler(BARTERING_SLOT, ChestMenuUtils.getEmptyClickHandler());

        menu.replaceExistingItem(END_CAKE_SLOT, ENDER_CAKE);
        menu.addMenuClickHandler(END_CAKE_SLOT, ChestMenuUtils.getEmptyClickHandler());
    }

    @ParametersAreNonnullByDefault
    public boolean openPage(PlayerProfile profile, ItemGroup itemGroup, SlimefunGuideMode mode, int page) {
        profile.getGuideHistory().add(this, 1);
        SlimefunGuide.openItemGroup(profile, itemGroup, mode, page);
        return false;
    }
}
