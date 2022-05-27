package mrthomas20121.bio_metals;

import mrthomas20121.bio_metals.init.BioMetalsBlocks;
import mrthomas20121.bio_metals.init.BioMetalsItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BioMetals.MOD_ID)
public class BioMetals {

	public static final String MOD_ID = "bio_metals";
	public static final Logger LOGGER = LogManager.getLogger();

	public BioMetals() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BioMetalsBlocks.BLOCKS.register(bus);
		BioMetalsItems.ITEMS.register(bus);
	}
}
