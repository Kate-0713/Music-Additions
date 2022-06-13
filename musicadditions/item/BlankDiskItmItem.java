package musicadditions.item;

import musicadditions.init.MusicAdditionsModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Item.Properties;

public class BlankDiskItmItem extends Item {
    public BlankDiskItmItem() {
        super(new Properties().m_41491_(MusicAdditionsModTabs.TAB_MUSIC_ADDITIONS_TB).m_41487_(64).m_41497_(Rarity.COMMON));
    }

    public UseAnim m_6164_(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public int m_8105_(ItemStack itemstack) {
        return 0;
    }
}