package net.namozdizex.nura.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.namozdizex.nura.NuraRise;
import net.namozdizex.nura.world.item.RihyonSwordItem;
import net.namozdizex.nura.world.item.YokaiSwordItem;

public class NRItems
{
    public static final Item NENEKIRIMARU = new RihyonSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item DEMON_LORD_HAMMER = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item FINAL_DEMON_LORD_HAMMER = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item NENEKIRIMARU2 = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));
    public static final Item YOKAI_SWORD_UNFINISH = new YokaiSwordItem(new Item.Properties().tab(NuraRise.TAB));

    public static final Item ICE_SHARD = new Item(new Item.Properties().tab(NuraRise.TAB));
    public static final Item SHIKIGAMI = new Item(new Item.Properties().tab(NuraRise.TAB));
    public static final Item YOKAI_BLADE = new Item(new Item.Properties().tab(NuraRise.TAB));
    public static final Item YOKAI_HANDLE = new Item(new Item.Properties().tab(NuraRise.TAB));
    public static final Item YOKAI_SOUL = new Item(new Item.Properties().tab(NuraRise.TAB));

    public static void init() {
        register("nenekirimaru", NENEKIRIMARU);
        register("demon_lord_hammer", DEMON_LORD_HAMMER);
        register("nenekirimaru2", NENEKIRIMARU2);
        register("final_demon_lord_hammer", FINAL_DEMON_LORD_HAMMER);
        register("yokai_sword_unfinish", YOKAI_SWORD_UNFINISH);

        register("shikigami", SHIKIGAMI);
        register("ice_shard", ICE_SHARD);
        register("yokai_blade", YOKAI_BLADE);
        register("yokai_handle", YOKAI_HANDLE);
        register("yokai_soul", YOKAI_SOUL);
    }
    private static void register(String key, Item item)
    {
        Registry.register(Registry.ITEM, new ResourceLocation(NuraRise.MOD_ID, key), item);
    }
}
