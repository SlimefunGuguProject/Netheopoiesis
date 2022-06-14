package dev.sefiraat.netheopoiesis.slimefun;

import dev.sefiraat.netheopoiesis.utils.Keys;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

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
}
