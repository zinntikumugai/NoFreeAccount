/**
 *
 */
package com.github.zinntikumugai.nofreeaccount;

import net.md_5.bungee.api.plugin.Plugin;

/**
 * @author zinntikumugai
 *
 */
public class NoFreeAccount extends Plugin {

	//プラグイン読み込み
	@Override
	public void onEnable() {
		getProxy().getPluginManager().registerListener(this, new NoFreeAccountListener());
		getLogger().info("load!!");
	}
}
