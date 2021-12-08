package jp.axer.cocoainput.loader;


import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import jp.axer.cocoainput.util.FCConfig;

public class CocoaInputModMenu implements ModMenuApi {

	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> (new FCConfig().getScreen(parent));
	}
}
