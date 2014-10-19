package en.grm.fairytail;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import en.grm.fairytail.libs.References;

@Mod(
		modid = References.MODID,
		version = References.VERSION,
		name = References.NAME)
/**
 * Main class of mod
 */
public class FairyTail {
	@SidedProxy(
			clientSide = References.Client,
			serverSide = References.Common)
	/** Proxy */
	public static ProxyCommon	proxy;
	/** Create mod instance */
	@Instance(References.MODID)
	public static FairyTail		instance;
	
	/**
	 * Constructor to Registry Lists of mod elements
	 */
	public FairyTail() {}
	
	/** preInit event */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	/** Init event */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	/** Load event */
	@EventHandler
	public void load(FMLPostInitializationEvent event) {
		
	}
}
