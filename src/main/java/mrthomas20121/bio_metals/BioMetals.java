package mrthomas20121.bio_metals;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BioMetals.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = BioMetals.MOD_ID)
public class BioMetals {

	public static final String MOD_ID = "bio_metals";
	public static final Logger LOGGER = LogManager.getLogger();

	public BioMetals() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BioConfig.config);
	}

	@SubscribeEvent
	static void gatherData(final GatherDataEvent event) {

	}
}
