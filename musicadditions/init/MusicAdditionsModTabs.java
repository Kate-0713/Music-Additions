package musicadditions.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MusicAdditionsModTabs {
    public static CreativeModeTab TAB_MUSIC_ADDITIONS_TB;

    public MusicAdditionsModTabs() {
    }

    public static void load() {
        TAB_MUSIC_ADDITIONS_TB = new CreativeModeTab("tabmusic_additions_tb") {
            public ItemStack m_6976_() {
                return new ItemStack(Items.f_42712_);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}