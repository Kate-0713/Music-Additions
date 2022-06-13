package musicadditions.init;

import minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

class MusicAdditionsModTabs$1 extends CreativeModeTab {
    MusicAdditionsModTabs$1(String arg0) {
        super(arg0);
    }

    public ItemStack m_6976_() {
        return new ItemStack(Items.f_42712_);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean hasSearchBar() {
        return false;
    }
}