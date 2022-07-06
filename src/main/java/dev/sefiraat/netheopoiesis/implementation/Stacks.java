package dev.sefiraat.netheopoiesis.implementation;

import dev.sefiraat.netheopoiesis.utils.ItemStackUtils;
import dev.sefiraat.netheopoiesis.utils.Skulls;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import java.util.stream.Stream;

/**
 * Final class used to store and initialise the {@link SlimefunItemStack}s used in the addon
 */
@SuppressWarnings("java:S1192")
public final class Stacks {

    private Stacks() {
        throw new IllegalStateException("Utility class");
    }

    // region Crafting

    public static final SlimefunItemStack ADDON_BERRY = Theme.themedSlimefunItemStack(
        "NPS_ADDON_BERRY",
        Material.SWEET_BERRIES,
        Theme.CRAFTING,
        "附加浆果",
        "一种美味的甜浆果,",
        "可以被制成果酱."
    );

    public static final SlimefunItemStack ADDON_JAM = Theme.themedSlimefunItemStack(
        "NPS_ADDON_JAM",
        ItemStackUtils.potion(Color.RED),
        Theme.CRAFTING,
        "附加果酱",
        "一种非常甜的果酱.",
        "不知为何, 它看上去像赶制的.",
        "(这个物品的英文名是Addon Jam,",
        "也是本次附属竞赛的名称)"
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_FIRE",
        Material.RED_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Fire",
        "This crystal has been attuned and",
        "harmonised with the power of fire."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_WATER",
        Material.CYAN_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Water",
        "This crystal has been attuned and",
        "harmonised with the power of water."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_AIR",
        Material.WHITE_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Air",
        "This crystal has been attuned and",
        "harmonised with the power of air."
    );

    public static final SlimefunItemStack HARMONISED_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_HARMONISED_CRYSTAL_EARTH",
        Material.BROWN_DYE,
        Theme.CRAFTING,
        "Harmonised Crystal: Earth",
        "This crystal has been attuned and",
        "harmonised with the power of earth."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_FIRE",
        Material.MAGENTA_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Fire",
        "This crystal has been attuned",
        "to the direct vacuum of fire",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_WATER",
        Material.LIGHT_BLUE_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Water",
        "This crystal has been attuned",
        "to the direct vacuum of water",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_EARTH",
        Material.BLACK_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Water",
        "This crystal has been attuned",
        "to the direct vacuum of the earth",
        "element."
    );

    public static final SlimefunItemStack DISCORDANT_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_DISCORDANT_CRYSTAL_AIR",
        Material.LIGHT_GRAY_DYE,
        Theme.CRAFTING,
        "Discordant Crystal: Air",
        "This crystal has been attuned",
        "to the direct vacuum of the air",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_FIRE = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_FIRE",
        Material.ORANGE_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Fire",
        "This crystal has been attuned",
        "to the oddities of fire",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_WATER = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_WATER",
        Material.BLUE_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Water",
        "This crystal has been attuned",
        "to the oddities of water",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_EARTH = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_EARTH",
        Material.GREEN_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Water",
        "This crystal has been attuned",
        "to the oddities of the earth",
        "element."
    );

    public static final SlimefunItemStack DISSONANT_CRYSTAL_AIR = Theme.themedSlimefunItemStack(
        "NPS_DISSONANT_CRYSTAL_AIR",
        Material.GRAY_DYE,
        Theme.CRAFTING,
        "Dissonant Crystal: Air",
        "This crystal has been attuned",
        "to the oddities of the air",
        "element."
    );

    public static final SlimefunItemStack ELEMENTAL_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_ELEMENTAL_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Elemental Crystal",
        "This crystal harnesses the power",
        "of the four base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack VACUUM_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_VACUUM_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Vacuum Crystal",
        "This crystal harnesses the vacuum",
        "of power from the base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack IRREGULAR_CRYSTAL = Theme.themedSlimefunItemStack(
        "NPS_IRREGULAR_CRYSTAL",
        ItemStackUtils.enchantedItemStack(Material.QUARTZ),
        Theme.CRAFTING,
        "Irregular Crystal",
        "This crystal harnesses the oddities",
        "of the four base elements to channel",
        "purification power."
    );

    public static final SlimefunItemStack QUARTZ_BLANK = Theme.themedSlimefunItemStack(
        "NPS_QUARTZ_BLANK",
        Material.QUARTZ_BLOCK,
        Theme.CRAFTING,
        "Quartz Blank",
        "This blank can be filled with",
        "elemental power and used to focus",
        "nearby purification energies"
    );

    // endregion

    // region Tools

    public static final SlimefunItemStack CRUDE_HARVESTING_TOOL = Theme.themedSlimefunItemStack(
        "NPS_CRUDE_HARVESTING_TOOL",
        Material.PRISMARINE_SHARD,
        Theme.TOOL,
        "粗制收获工具",
        "这个工具可以收获植物.",
        "似乎是个劣质品,",
        "没法用太久.",
        "",
        LoreBuilder.usesLeft(25)
    );

    public static final SlimefunItemStack HARVESTING_TOOL = Theme.themedSlimefunItemStack(
        "NPS_HARVESTING_TOOL",
        Material.PRISMARINE_SHARD,
        Theme.TOOL,
        "收获工具",
        "这个工具可以收获植物.",
        "它更加结实,",
        "但也没法用太久.",
        "",
        LoreBuilder.usesLeft(150)
    );

    public static final SlimefunItemStack PURIFICATION_BAROMETER = Theme.themedSlimefunItemStack(
        "NPS_PURIFICATION_BAROMETER",
        Material.CLOCK,
        Theme.TOOL,
        "净化测量仪",
        "使用后, 可以获取",
        "当前区块的净化值."
    );

    public static final SlimefunItemStack PURIFICATION_SCANNER = Theme.themedSlimefunItemStack(
        "NPS_PURIFICATION_SCANNER",
        Material.BRICK,
        Theme.TOOL,
        "净化扫描仪",
        "当右键点击方块或植物时,",
        "可以显示出它的净化值."
    );

    public static final SlimefunItemStack CRUX_GATHERER = Theme.themedSlimefunItemStack(
        "NPS_CRUX_GATHERER",
        Material.BLAZE_ROD,
        Theme.TOOL,
        "结构获取器",
        "如果你使用结构获取器",
        "破坏任何结构来收集它.",
        "不会改变生物群系."
    );

    public static final SlimefunItemStack MIXING_QUARTZ = Theme.themedSlimefunItemStack(
        "NPS_MIXING_QUARTZ_1",
        Material.QUARTZ,
        Theme.TOOL,
        "混合石英",
        "在地上丢出3种下界浆糊,",
        "手持混合石英右键点击",
        "将它们混合成为下界丸子.",
        "丸子的类型与风味值取决于",
        "下界浆糊的类型."
    );

    public static final SlimefunItemStack ENDER_CAKE = Theme.themedSlimefunItemStack(
        "NPS_ENDER_CAKE",
        Material.CAKE,
        Theme.TOOL,
        "末影蛋糕",
        "食用这种美味的蛋糕后,",
        "你将会获得跨越维度的能力.",
        Theme.WARNING + "如果你还想找到它,",
        Theme.WARNING + "那么一定要在下界设置记录点!"
    );

    public static final SlimefunItemStack NETHER_BEACON = Theme.themedSlimefunItemStack(
        "NPS_BEACON",
        Material.SHROOMLIGHT,
        Theme.TOOL,
        "Nether Beacon",
        "This beacon will draw nearby",
        "purification and convert it into power.",
        "The beacon's beam will slowly",
        "remove any blocks above this block's",
        "y-level. The radius depends on the",
        "power of the whole beacon's structure.",
        "Place beacon base blocks below this to",
        "increase the power.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 20),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_1 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_1",
        Material.NETHER_WART_BLOCK,
        Theme.TOOL,
        "Nether Beacon Base: Tier 1",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 10),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_2 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_2",
        Material.NETHER_BRICKS,
        Theme.TOOL,
        "Nether Beacon Base: Tier 2",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 15),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack NETHER_BEACON_BASE_3 = Theme.themedSlimefunItemStack(
        "NPS_BEACON_BASE_3",
        Material.RED_CONCRETE,
        Theme.TOOL,
        "Nether Beacon Base: Tier 3",
        "This base will draw purification",
        "from the surrounding area and convert",
        "into a form of power.",
        "Can draw power from other base",
        "blocks below this if they are",
        "one tier higher.",
        Theme.CLICK_INFO.asTitle("Purification Draw", 20),
        Theme.CLICK_INFO.asTitle("Cumulative Power", 1)
    );

    public static final SlimefunItemStack SEED_ANALYSER = Theme.themedSlimefunItemStack(
        "NPS_SEED_ANALYSER",
        Material.COMPASS,
        Theme.TOOL,
        "Seed Analyser",
        "When used on a Nether Plant, this",
        "tool will provide you information",
        "about it's type, growth and",
        "purification values."
    );

    public static final SlimefunItemStack SIPHON_ANALYSER = Theme.themedSlimefunItemStack(
        "NPS_SIPHON_ANALYSER",
        Material.COMPASS,
        Theme.TOOL,
        "Siphon Analyser",
        "When used on a Siphoning block,",
        "tool will provide you information",
        "about it's current power and state"
    );

    // endregion

    // region Crux'

    public static final SlimefunItemStack BASIC_PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
        "NPS_BASIC_PURIFIED_NETHERRACK",
        Material.MYCELIUM,
        Theme.CRUX,
        "基本净化的下界岩",
        "这块下界岩已经被净化,",
        "能让更加复杂的种子在上面生长."
    );

    public static final SlimefunItemStack PURIFIED_NETHERRACK = Theme.themedSlimefunItemStack(
        "NPS_PURIFIED_NETHERRACK",
        Material.PODZOL,
        Theme.CRUX,
        "净化的下界岩",
        "这块下界岩已经被净化,",
        "能让更加复杂的种子在上面生长."
    );

    public static final SlimefunItemStack VORACIOUS_DIRT = Theme.themedSlimefunItemStack(
        "NPS_VORACIOUS_DIRT",
        Material.ROOTED_DIRT,
        Theme.CRUX,
        "贪婪泥土",
        "这块下界岩已经被净化到一定程度,",
        "它已经转化为比较活跃的泥土."
    );

    public static final SlimefunItemStack NETHER_DIRT = Theme.themedSlimefunItemStack(
        "NPS_NETHER_DIRT",
        Material.DIRT,
        Theme.CRUX,
        "下界泥土",
        "这块下界岩已经被净化到一定程度,",
        "它能被视为真正的泥土."
    );

    public static final SlimefunItemStack NETHER_GRASS = Theme.themedSlimefunItemStack(
        "NPS_NETHER_GRASS",
        Material.GRASS_BLOCK,
        Theme.CRUX,
        "下界草方块",
        "这个草方块非常健康."
    );

    public static final SlimefunItemStack JUNGLE_CRUX = Theme.themedSlimefunItemStack(
        "NPS_JUNGLE_CRUX",
        Material.MOSS_BLOCK,
        Theme.CRUX,
        "丛林结构",
        "这种泥土适合温带植物生长."
    );

    public static final SlimefunItemStack BEACH_CRUX = Theme.themedSlimefunItemStack(
        "NPS_BEACH_CRUX",
        Material.SAND,
        Theme.CRUX,
        "海滩结构",
        "走在这种沙子上感觉很棒."
    );

    public static final SlimefunItemStack DESERT_CRUX = Theme.themedSlimefunItemStack(
        "NPS_DESERT_CRUX",
        Material.RED_SAND,
        Theme.CRUX,
        "沙漠结构",
        "像是贫瘠且阴暗的沙漠,",
        "但仍是一种下界岩的改进."
    );

    public static final SlimefunItemStack SNOW_CRUX = Theme.themedSlimefunItemStack(
        "NPS_SNOWY_CRUX",
        Material.SNOW_BLOCK,
        Theme.CRUX,
        "雪地结构",
        "突然的降温肯定会",
        "带来不少新物种."
    );

    public static final SlimefunItemStack STONEY_CRUX = Theme.themedSlimefunItemStack(
        "NPS_STONEY_CRUX",
        Material.STONE,
        Theme.CRUX,
        "岩石结构",
        "虽然并不适合种植,",
        "但万物都有存在的理由."
    );

    public static final SlimefunItemStack SWAMP_CRUX = Theme.themedSlimefunItemStack(
        "NPS_SWAMPY_CRUX",
        Material.GRASS_BLOCK,
        Theme.CRUX,
        "沼泽结构",
        "这片土地过于饱和",
        "且充满生机."
    );

    public static final SlimefunItemStack CRYSTALLINE_CRUX = Theme.themedSlimefunItemStack(
        "NPS_CRYSTALLINE_CRUX",
        Material.HONEYCOMB_BLOCK,
        Theme.CRUX,
        "晶化结构",
        "这个结构与其他的不同,",
        "它可以扩散到附近的",
        "岩浆, 圆石, 石头, 黑曜石."
    );

    // endregion

    // region Seeds

    // region Spreaders

    public static final SlimefunItemStack PURIFICATION_SEED = Theme.themedSeed(
        "NPS_PURIFICATION_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "净化之种",
        new String[]{"这种植物成熟后,", "会缓慢的净化周围的环境."},
        getCanBePlacedOnLore("下界岩", "诡异菌岩", "绯红菌岩")
    );

    public static final SlimefunItemStack SOUL_SEED = Theme.themedSeed(
        "NPS_SOUL_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "灵魂之种",
        new String[]{"这种植物成熟后,", "会进一步净化周围的环境."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SPIRIT_SEED = Theme.themedSeed(
        "NPS_SPIRIT_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "精神之种",
        new String[]{"这种植物成熟后,", "会深入净化周围的环境."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SAINTLY_SEED = Theme.themedSeed(
        "NPS_SAINTLY_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "圣洁之种",
        new String[]{"这种植物成熟后,", "会清除周围环境中所有的下界元素."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack EDEN_SEED = Theme.themedSeed(
        "NPS_EDEN_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "伊甸之种",
        new String[]{"这种植物成熟后,", "会在下界创建伊甸园."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack JUNGLE_SEED = Theme.themedSeed(
        "NPS_JUNGLE_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "丛林之种",
        new String[]{"这种植物成熟后,", "会在周围生成丛林."},
        getCanBePlacedOnLore("下界草方块", "丛林结构")
    );

    public static final SlimefunItemStack BEACH_SEED = Theme.themedSeed(
        "NPS_BEACH_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "海滩之种",
        new String[]{"这种植物成熟后,", "会在周围生成海滩."},
        getCanBePlacedOnLore("下界草方块", "海滩结构")
    );

    public static final SlimefunItemStack DESERT_SEED = Theme.themedSeed(
        "NPS_DESERT_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "沙漠之种",
        new String[]{"这种植物成熟后,", "会在周围生成沙漠."},
        getCanBePlacedOnLore("下界草方块", "沙漠结构")
    );

    public static final SlimefunItemStack SNOW_SEED = Theme.themedSeed(
        "NPS_SNOW_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "雪地之种",
        new String[]{"这种植物成熟后,", "会在周围生成雪地."},
        getCanBePlacedOnLore("下界草方块", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack STONEY_SEED = Theme.themedSeed(
        "NPS_STONEY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "岩石之种",
        new String[]{"这种植物成熟后,", "会在周围生成岩石."},
        getCanBePlacedOnLore("下界草方块", "岩石结构")
    );

    public static final SlimefunItemStack SWAMP_SEED = Theme.themedSeed(
        "NPS_SWAMP_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.PURIFYING_SEED,
        "沼泽之种",
        new String[]{"这种植物成熟后,", "会在周围生成沼泽."},
        getCanBePlacedOnLore("下界草方块", "沼泽结构")
    );

    // endregion

    // region Purification -> Soul

    public static final SlimefunItemStack SPINDLE_SEED = Theme.themedSeed(
        "NPS_SPINDLE_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "橡木之种",
        new String[]{"这种植物成熟后,", "会在周围小概率生成橡木."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack GRAINY_SEED = Theme.themedSeed(
        "NPS_GRAINY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "红石之种",
        new String[]{"这种植物成熟后,", "会不断生成红石粉."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack STRINGY_SEED = Theme.themedSeed(
        "NPS_STRINGY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "丝线之种",
        new String[]{"这种植物成熟后,", "会不断生成线."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack GRASS_SEED = Theme.themedSeed(
        "NPS_GRASS_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "青草之种",
        new String[]{"这种植物成熟后,", "会不断生成各种草."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack COBBLED_SEED = Theme.themedSeed(
        "NPS_COBBLED_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "圆石之种",
        new String[]{"这种植物成熟后,", "会不断生成圆石."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack VOLCANIC_SEED = Theme.themedSeed(
        "NPS_VOLCANIC_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "火山之种",
        new String[]{"这种植物成熟后,", "收获时将获得花岗岩."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack IGNEOUS_SEED = Theme.themedSeed(
        "NPS_IGNEOUS_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "火成岩之种",
        new String[]{"这种植物成熟后,", "收获时将获得安山岩."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack FELDSPAR_SEED = Theme.themedSeed(
        "NPS_FELDSPAR_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "长石之种",
        new String[]{"这种植物成熟后,", "收获时将获得闪长岩."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack DEEPSLATE_SEED = Theme.themedSeed(
        "NPS_DEEPSLATE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "深板岩之种",
        new String[]{"这种植物成熟后,", "收获时将获得深板岩圆石."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack DUSTY_SEED = Theme.themedSeed(
        "NPS_DUSTY_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "沙砾之种",
        new String[]{"这种植物成熟后,", "收获时将获得沙砾."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SEASIDE_SEED = Theme.themedSeed(
        "NPS_SEASIDE_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "海滨之种",
        new String[]{"这种植物成熟后,", "收获时将获得沙子."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack NORI_SEED = Theme.themedSeed(
        "NPS_NORI_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "海苔之种",
        new String[]{"这种植物成熟后,", "收获时将获得海带."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack MOLDABLE_SEED = Theme.themedSeed(
        "NPS_MOLDABLE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "可塑之种",
        new String[]{"这种植物成熟后,", "收获时将获得粘土球."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack WET_SEED = Theme.themedSeed(
        "NPS_WET_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "湿润之种",
        new String[]{"这种植物成熟后,", "使用空桶右键点击可装满水."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SPLINTERED_SEED = Theme.themedSeed(
        "NPS_SPLINTERED_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "分裂之种",
        new String[]{"这种植物成熟后,", "有几率在周围生成骷髅."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack ROTTEN_SEED = Theme.themedSeed(
        "NPS_ROTTEN_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "腐烂之种",
        new String[]{"这种植物成熟后,", "有几率在周围生成僵尸."},
        getCanBePlacedOnLore("基本净化的下界岩", "(或净化等级更高的)")
    );

    // endregion

    // region Soul -> Spirit

    public static final SlimefunItemStack METALLIC_SEED = Theme.themedSeed(
        "NPS_METALLIC_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "金属之种",
        new String[]{"这种植物成熟后,", "收获时将获得铁粒."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack TARNISHED_SEED = Theme.themedSeed(
        "NPS_TARNISHED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "生锈之种",
        new String[]{"这种植物成熟后,", "收获时将获得粗铜."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SHINY_SEED = Theme.themedSeed(
        "NPS_SHINY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "闪耀之种",
        new String[]{"这种植物成熟后,", "收获时将获得金粒."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SMOOTH_SEED = Theme.themedSeed(
        "NPS_SMOOTH_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "平滑之种",
        new String[]{"这种植物成熟后,", "收获时将获得紫水晶碎片."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SEEDY_SEED = Theme.themedSeed(
        "NPS_SEEDY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "作物之种",
        new String[]{"这种植物成熟后,", "会不断生成各种作物种子."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack SWEET_SEED = Theme.themedSeed(
        "NPS_SWEET_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "甜蜜之种",
        new String[]{"这种植物成熟后,", "会在附近的沙子上小概率生成甘蔗."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack ENCHANTED_SEED = Theme.themedSeed(
        "NPS_ENCHANTED_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "附魔之种",
        new String[]{"这种植物成熟后,", "收获时将获得青金石."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack COMBUSTIBLE_SEED = Theme.themedSeed(
        "NPS_COMBUSTABLE_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "可燃之种",
        new String[]{"这种植物成熟后,", "收获时将获得煤炭."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack PROTECTIVE_SEED = Theme.themedSeed(
        "NPS_PROTECTIVE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "保护之种",
        new String[]{"这种植物成熟后,", "会在周围生成铁傀儡."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack PORKY_SEED = Theme.themedSeed(
        "NPS_PORKY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "猪肉之种",
        new String[]{"这种植物成熟后,", "会在周围生成猪!"},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack VALUABLE_SEED = Theme.themedSeed(
        "NPS_VALUABLE_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "村民快乐之种",
        new String[]{"这种植物成熟后,", "收获时将获得绿宝石."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack PERFECTION_SEED = Theme.themedSeed(
        "NPS_PERFECTION_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "完美之种",
        new String[]{"这种植物成熟后,", "收获时将获得钻石."},
        getCanBePlacedOnLore("净化的下界岩", "(或净化等级更高的)")
    );

    // endregion

    // region Spirit -> Saintly

    public static final SlimefunItemStack RAINBOW_SEED = Theme.themedSeed(
        "NPS_RAINBOW_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "彩虹之种",
        new String[]{"这种植物成熟后,", "会不断生成各种染料."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack GLOWING_SEED = Theme.themedSeed(
        "NPS_GLOWING_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "发光之种",
        new String[]{"这种植物成熟后,", "会不断生成各种发光物品."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack GLISTENING_SEED = Theme.themedSeed(
        "NPS_GLISTENING_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "闪闪发光之种",
        new String[]{"这种植物成熟后,", "收获时可获得闪闪发光的西瓜."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack ETHEREAL_SEED = Theme.themedSeed(
        "NPS_ETHEREAL_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "末影之种",
        new String[]{"这种植物成熟后,", "会在周围生成末影人."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack IGNITED_SEED = Theme.themedSeed(
        "NPS_IGNITED_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "烈焰之种",
        new String[]{"这种植物成熟后,", "会在周围生成烈焰人."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack BARTERED_SEED = Theme.themedSeed(
        "NPS_BARTERED_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "交易之种",
        new String[]{"这种植物成熟后,", "会在周围生成猪灵."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack PRISMATIC_SEED = Theme.themedSeed(
        "NPS_PRISMATIC_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "海晶之种",
        new String[]{"这种植物成熟后,", "会不断生成海晶物品."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack POROUS_SEED = Theme.themedSeed(
        "NPS_POROUS_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "多孔之种",
        new String[]{"这种植物成熟后,", "收获时将获得海绵."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack LEARNED_SEED = Theme.themedSeed(
        "NPS_LEARNED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "知识之种",
        new String[]{"这种植物成熟后,", "收获时将获得附魔之瓶."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack BUSY_SEED = Theme.themedSeed(
        "NPS_BUSY_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "忙碌之种",
        new String[]{"这种植物成熟后,", "收获时将获得曲奇."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack OAKENDRAN_SEED = Theme.themedSeed(
        "NPS_OAKENDRAN_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "树精之种",
        new String[]{"这种植物成熟后,", "会在周围生成树."},
        getCanBePlacedOnLore("贪婪泥土", "(或净化等级更高的)")
    );

    // endregion

    // region Saintly -> Eden

    public static final SlimefunItemStack ADDON_BERRY_SEED = Theme.themedSeed(
        "NPS_ADDON_BERRY_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "附加浆果之种",
        new String[]{"这种植物成熟后,", "收获时将获得附加浆果."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack CUTE_SEED = Theme.themedSeed(
        "NPS_CUTE_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "可爱之种",
        new String[]{"这种植物成熟后,", "会在周围生成可爱的美西螈."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack BEST_FRIEND_SEED = Theme.themedSeed(
        "NPS_BEST_FRIEND_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "最好的朋友之种",
        new String[]{"这种植物成熟后,", "会在周围生成狼."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack MATH_SEED = Theme.themedSeed(
        "NPS_MATH_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "数学之种",
        new String[]{"这种植物成熟后,", "会试图教你一些东西."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack BUZZING_SEED = Theme.themedSeed(
        "NPS_BUZZING_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "蜜蜂之种",
        new String[]{"这种植物成熟后,", "收获时将获得蜜脾."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack TERRIFYING_SEED = Theme.themedSeed(
        "NPS_TERRIFYING_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "恐怖之种",
        new String[]{"这种植物成熟后,", "会在周围生成凋灵骷髅."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack HATE_FILLED_SEED = Theme.themedSeed(
        "NPS_HATE_FILLED_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "怨恨之种",
        new String[]{"这种植物成熟后,", "只会有不好的事情发生.", "不要随意摆放!"},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack PULSING_SEED = Theme.themedSeed(
        "NPS_PULSING_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "脉冲之种",
        new String[]{"这种植物成熟后,", "会为周围玩家提供正面药水效果."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack GATEWAY_SEED = Theme.themedSeed(
        "NPS_GATEWAY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "村民之种",
        new String[]{"这种植物成熟后,", "会在周围生成村民."},
        getCanBePlacedOnLore("下界泥土", "(或净化等级更高的)")
    );

    public static final SlimefunItemStack CRYSTALLINE_SEED = Theme.themedSeed(
        "NPS_CRYSTALLINE_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "晶化之种",
        new String[]{"这种种子种植后没有任何作用.", "但你可以试试把它扔到岩浆里."},
        getCanBePlacedOnLore("下界草方块", "(或净化等级更高的)")
    );

    // endregion

    // region 丛林结构

    public static final SlimefunItemStack BLACK_AND_WHITE_SEED = Theme.themedSeed(
        "NPS_BLACK_AND_WHITE_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "黑白之种",
        new String[]{"这种植物成熟后,", "会缓慢生成一些黑白相间的朋友."},
        getCanBePlacedOnLore("丛林结构")
    );

    public static final SlimefunItemStack PARROT_SEED = Theme.themedSeed(
        "NPS_PARROT_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "鹦鹉之种",
        new String[]{"这种植物成熟后,", "会缓慢生成一些拥有美丽羽毛的朋友."},
        getCanBePlacedOnLore("丛林结构")
    );

    public static final SlimefunItemStack WILD_SEED = Theme.themedSeed(
        "NPS_WILD_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "荒野之种",
        new String[]{"这种植物成熟后,", "会缓慢生成一些可爱又毛茸茸的朋友."},
        getCanBePlacedOnLore("丛林结构")
    );

    // endregion

    // region Beach

    public static final SlimefunItemStack SHELLED_SEED = Theme.themedSeed(
        "NPS_SHELLED_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "带壳之种",
        new String[]{"这种植物成熟后,", "会缓慢生成一些带壳的朋友."},
        getCanBePlacedOnLore("海滩结构")
    );

    public static final SlimefunItemStack TREASURED_SEED = Theme.themedSeed(
        "NPS_TREASURED_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "宝藏之种",
        new String[]{"这种植物成熟后,", "会有极小的概率生成宝藏."},
        getCanBePlacedOnLore("海滩结构")
    );

    // endregion

    // region Desert

    public static final SlimefunItemStack SPINEY_SEED = Theme.themedSeed(
        "NPS_SPINEY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "尖刺之种",
        new String[]{"这种植物成熟后,", "会在周围小概率生成仙人掌."},
        getCanBePlacedOnLore("沙漠结构")
    );

    public static final SlimefunItemStack HUSKY_SEED = Theme.themedSeed(
        "NPS_HUSKY_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "尸壳之种",
        new String[]{"这种植物成熟后,", "会在周围生成尸壳."},
        getCanBePlacedOnLore("沙漠结构")
    );

    // endregion

    // region Snow

    public static final SlimefunItemStack STRAY_SEED = Theme.themedSeed(
        "NPS_STRAY_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "流浪者之种",
        new String[]{"这种植物成熟后,", "会在周围生成流浪者."},
        getCanBePlacedOnLore("雪地结构")
    );

    public static final SlimefunItemStack POLAR_SEED = Theme.themedSeed(
        "NPS_POLAR_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "极地之种",
        new String[]{"这种植物成熟后,", "会在周围生成北极熊."},
        getCanBePlacedOnLore("雪地结构")
    );

    public static final SlimefunItemStack CHILLY_SEED = Theme.themedSeed(
        "NPS_CHILLY_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "寒冷之种",
        new String[]{"这种植物成熟后,", "会在周围生成北极狐."},
        getCanBePlacedOnLore("雪地结构")
    );

    // endregion

    // region Stoney


    // endregion

    // region Swamp

    public static final SlimefunItemStack HEXED_SEED = Theme.themedSeed(
        "NPS_HEXED_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "巫术之种",
        new String[]{"这种植物成熟后,", "会在周围生成女巫."},
        getCanBePlacedOnLore("沼泽结构")
    );

    public static final SlimefunItemStack SLIMY_SEED = Theme.themedSeed(
        "NPS_SLIMY_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "粘液之种",
        new String[]{"这种植物成熟后,", "会在周围生成史莱姆."},
        getCanBePlacedOnLore("沼泽结构")
    );

    // @formatter:off
    public static final SlimefunItemStack BLOB_SEED = Theme.themedSeed(
                                "NPS_BLOB_SEED",
                          Skulls.SEED_YELLOW.getPlayerHead(),
                                     Theme.SEED,
                               "布丁之种",
         new String[]{"这种植物成熟后,", "会经常...陷入疯狂."},
                    getCanBePlacedOnLore("沼泽结构")
    );
         // blob <3                                                         // @formatter:on

    // endregion

    // endregion

    @Nonnull
    public static String[] getCanBePlacedOnLore(@Nonnull String... validPlacements) {
        String[] strings = new String[]{
            "",
            Theme.CRUX + "可种植于:"
        };
        return Stream.of(strings, validPlacements).flatMap(Stream::of).toArray(String[]::new);
    }
}
