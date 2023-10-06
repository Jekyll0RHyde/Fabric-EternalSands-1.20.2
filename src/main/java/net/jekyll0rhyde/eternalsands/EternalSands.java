package net.jekyll0rhyde.eternalsands;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EternalSands implements ModInitializer {
	public static final	String MOD_ID = "eternalsands";
    public static final Logger LOGGER = LoggerFactory.getLogger("eternalsands");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}