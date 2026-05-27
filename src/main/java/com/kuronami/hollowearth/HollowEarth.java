package com.kuronami.hollowearth;

import com.kuronami.isekaiapi.api.Isekai;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(HollowEarth.MODID)
public final class HollowEarth {
    public static final String MODID = "hollow_earth";
    public static final String VERSION = "0.1.0";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HollowEarth(IEventBus modBus) {
        LOGGER.info("Hollow Earth v{} loading", VERSION);
        LOGGER.info("Hollow Earth: Isekai API facade ready (query={}, remap={})",
                Isekai.query().getClass().getSimpleName(),
                Isekai.remap().getClass().getSimpleName());
    }
}
