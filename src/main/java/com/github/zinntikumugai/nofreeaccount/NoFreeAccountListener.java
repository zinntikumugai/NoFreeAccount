package com.github.zinntikumugai.nofreeaccount;

import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.PreLoginEvent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class NoFreeAccountListener implements Listener {

	@EventHandler
	public void onLogin(LoginEvent event) {
		System.out.println("LoginEvent");
	}

	@EventHandler
	public void onPreLogin(PreLoginEvent event) {
		System.out.println("PreLofinEvent");
	}

	@EventHandler
	public void onPostLogin(PostLoginEvent event) {
		System.out.println("PostLoginEvent");
	}

	@EventHandler
	public void onServerConect(ServerConnectEvent event) {
		System.out.println("ServerConnectEvent");
	}

}
