package net.namozdizex.nura.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.namozdizex.nura.NuraRise;
import net.namozdizex.nura.world.item.YokaiSwordItem;

public class NRItems
{
    public static final Item NENEKIRIMARU = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item DEMON_LORD_HAMMER = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item FINAL_DEMON_LORD_HAMMER = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item NENEKIRIMARU2 = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));

    public static final Item SHIKIGAMI = new Item(new Item.Properties().tab(NuraRise.TAB));

    public static void init() {
        register("nenekirimaru", NENEKIRIMARU);
        register("demon_lord_hammer", DEMON_LORD_HAMMER);
        register("nenekirimaru2", NENEKIRIMARU2);
        register("final_demon_lord_hammer", FINAL_DEMON_LORD_HAMMER);

        register("shikigami", SHIKIGAMI);

    }
    private static void register(String key, Item item)
    {
        Registry.register(Registry.ITEM, new ResourceLocation(NuraRise.MOD_ID, key), item);
    }
}
