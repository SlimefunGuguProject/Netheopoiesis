package dev.sefiraat.netheopoiesis.api;

import com.google.common.base.Preconditions;
import dev.sefiraat.netheopoiesis.api.interfaces.WorldCrushable;
import dev.sefiraat.netheopoiesis.api.plant.netheos.NetheoBalls;
import dev.sefiraat.netheopoiesis.listeners.DropListener;
import dev.sefiraat.netheopoiesis.utils.Keys;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * Final class used to store and initialise the {@link RecipeType}s used in the addon
 */
public final class RecipeTypes {

    private RecipeTypes() {
        throw new IllegalStateException("Utility class");
    }

    @Nonnull
    public static final RecipeType NETHER_PURIFICATION = new RecipeType(
        Keys.newKey("nether_purification"),
        Theme.themedItemStack(
            Material.WITHER_ROSE,
            Theme.RECIPE_TYPE,
            "净化下界",
            "该物品可以通过净化下界获得.",
            "种植净化之种以开始净化."
        )
    );

    @Nonnull
    public static final RecipeType PLANT_HARVEST = new RecipeType(
        Keys.newKey("plant_harvest"),
        Theme.themedItemStack(
            Material.PRISMARINE_SHARD,
            Theme.RECIPE_TYPE,
            "收获植物",
            "该物品可以通过收获植物获得."
        )
    );

    @Nonnull
    public static final RecipeType PLANT_BREEDING = new RecipeType(
        Keys.newKey("plant_breeding"),
        Theme.themedItemStack(
            Material.FLOWER_POT,
            Theme.RECIPE_TYPE,
            "培育植物",
            "这个种子可以通过培育获得.",
            "",
            "你需要将两株植物放在一起,",
            "中间间隔一格空气,",
            "来进行培育.",
            "",
            "你可以通过培育笔记",
            "来查看所有已发现的培育.",
            "",
            "提示: 黑色粒子代表",
            "两株植物不能进行培育."
        )
    );

    @Nonnull
    public static final RecipeType VANILLA_DROP = new RecipeType(
        Keys.newKey("vanilla_block_drop"),
        Theme.themedItemStack(
            Material.BROWN_DYE,
            Theme.RECIPE_TYPE,
            "方块掉落物",
            "通过破坏方块获得."
        )
    );

    @Nonnull
    public static final RecipeType CRUSHING = new RecipeType(
        Keys.newKey("crushing"),
        Theme.themedItemStack(
            Material.ANVIL,
            Theme.RECIPE_TYPE,
            "碾碎",
            "这个物品通过碾碎获得.",
            "利用铁砧坠落来碾碎物品."
        )
    );

    @Nonnull
    public static final RecipeType NETHEO_MIXING = new RecipeType(
        Keys.newKey("netheo-mixing"),
        Theme.themedItemStack(
            Material.QUARTZ,
            Theme.RECIPE_TYPE,
            "下界混合",
            "这个物品通过下界混合获得.",
            "向地上丢出3种下界浆糊,",
            "然后手持混合石英右键点击."
        )
    );

    @Nonnull
    public static final RecipeType WANDERING_PIGLIN_TRADE = new RecipeType(
        Keys.newKey("piglin-trade"),
        Theme.themedItemStack(
            Material.PIGLIN_SPAWN_EGG,
            Theme.RECIPE_TYPE,
            "流浪猪灵交易",
            "该物品可以通过与流浪猪灵",
            "(不是普通的猪灵)交易获得.",
            "流浪猪灵会与两只炽足兽一同生成",
            "并提供交易选项.",
            "你可以在净化协议中查看",
            "有关流浪猪灵的生成信息."
        )
    );

    /**
     * This method both registers the drop and returns an ItemStack array that can be used
     * for Slimefun's recipe system. {@link RecipeTypes#VANILLA_DROP}
     *
     * @param stackToDrop The {@link ItemStack} to drop in the world
     * @param dropFrom    The {@link ItemStack} to drop from (#getType() is used) and the stack is used in the recipe.
     * @param dropChance  The chance (0-1) for the drop to occur
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     */
    @Nonnull
    public static ItemStack[] createWorldDropRecipe(@Nonnull ItemStack stackToDrop,
                                                    @Nonnull ItemStack dropFrom,
                                                    double dropChance
    ) {
        final Material material = dropFrom.getType();
        DropListener.getDropMap().put(material, new DropListener.BlockDrop(stackToDrop, material, dropChance));
        return new ItemStack[]{
            null, null, null,
            null, dropFrom, null,
            null, null, null
        };
    }

    /**
     * This method returns an ItemStack array that can be used for Slimefun's recipe system.
     *
     * @param dropFrom The {@link SlimefunItem} (must implement WorldCrushable) to drop from.
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the dropFrom item in the middle.
     * @see RecipeTypes#CRUSHING
     */
    @Nonnull
    public static ItemStack[] createCrushingRecipe(@Nonnull SlimefunItem dropFrom) {
        Preconditions.checkArgument(
            dropFrom instanceof WorldCrushable,
            "A crushing recipe item must implement WorldCrushable"
        );
        return new ItemStack[]{
            null, null, null,
            null, dropFrom.getItem(), null,
            null, null, null
        };
    }

    /**
     * This method returns an ItemStack array that can be used for Slimefun's Recipe system
     *
     * @param ball The Netheoball type required for the trade
     * @param minFlavour The minimum flavour required
     * @return A {@link ItemStack[]} used for Slimefun's Recipe registration with the recipe item in the middle.
     */
    @Nonnull
    public static ItemStack[] createTradingRecipe(@Nonnull ItemStack itemStack, @Nonnull NetheoBalls ball, int minFlavour) {
        final ItemStack flavourStack = new CustomItemStack(
            Material.MELON_SEEDS,
            Theme.MAIN.apply("喜好风味"),
            Theme.CLICK_INFO.asTitle("下界丸子类型", ball.getSlimefunItemStack().getDisplayName()),
            Theme.CLICK_INFO.asTitle("风味数量", minFlavour)
        );
        ball.getTradePool().addTrade(itemStack, minFlavour);
        return new ItemStack[]{
            null, null, null,
            null, flavourStack, null,
            null, null, null
        };
    }
}
