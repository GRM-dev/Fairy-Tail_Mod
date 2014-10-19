package en.grm.fairytail;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ProxyClient extends ProxyCommon {
	
	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	@Override
	public void registerRenderInfomation() {
		
	}
	
	@Override
	public void registerRendering() {}
	
	@Override
	public void registerRenderThings() {}
	
	/**
	 * Register the sound event handling class
	 */
	@Override
	public void registerSound() {}
	
	/**
	 * Registers Commands
	 */
	@Override
	public void registerCommands() {}
}