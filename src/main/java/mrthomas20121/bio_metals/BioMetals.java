package mrthomas20121.bio_metals;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BioMetals.mod_id)
public class BioMetals {

	public static final String mod_id = "bio_metals";
	public static final Logger LOGGER = LogManager.getLogger();

	public BioMetals() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BioConfig.config);
	}
}
