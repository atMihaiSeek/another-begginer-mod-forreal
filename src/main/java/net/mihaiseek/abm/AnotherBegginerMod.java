package net.mihaiseek.abm;

import net.fabricmc.api.ModInitializer;

import net.mihaiseek.abm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnotherBegginerMod implements ModInitializer {
	public static final String MOD_ID = "anotherbegginermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}