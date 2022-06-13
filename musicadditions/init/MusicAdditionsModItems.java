package musicadditions.init;

import musicadditions.item.BlankDiskItmItem;
import musicadditions.item.BlankNetherDiskItem;
import musicadditions.item.FibreItmItem;
import musicadditions.item.HardenedFibreItmItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MusicAdditionsModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "music_additions");
    public static final RegistryObject<Item> FIBRE_ITM = REGISTRY.register("fibre_itm", () -> new FibreItmItem());
    public static final RegistryObject<Item> HARDENED_FIBRE_ITM = REGISTRY.register("hardened_fibre_itm", () -> new HardenedFibreItmItem());
    public static final RegistryObject<Item> BLANK_DISK_ITM = REGISTRY.register("blank_disk_itm", () -> new BlankDiskItmItem());
    public static final RegistryObject<Item> BLANK_NETHER_DISK = REGISTRY.register("blank_nether_disk", () -> new BlankNetherDiskItem());

    public MusicAdditionsModItems() {
    }
}