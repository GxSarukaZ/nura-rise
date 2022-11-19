package net.namozdizex.nura.world.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class YokaiSwordItem extends SwordItem {
    public YokaiSwordItem(Item.Properties properties) {
        super(TiersNR.YOKAI_HEART, 3, -2.4F, properties);
    }
}
