package musicadditions;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import musicadditions.init.MusicAdditionsModItems;
import musicadditions.init.MusicAdditionsModTabs;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent.Context;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("music_additions")
public class MusicAdditionsMod {
    public static final Logger LOGGER = LogManager.getLogger(MusicAdditionsMod.class);
    public static final String MODID = "music_additions";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(
        new ResourceLocation("music_additions", "music_additions"), () -> "1", "1"::equals, "1"::equals
    );
    private static int messageID = 0;

    public MusicAdditionsMod() {
        MusicAdditionsModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MusicAdditionsModItems.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(
        Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<Context>> messageConsumer
    ) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        ++messageID;
    }
}