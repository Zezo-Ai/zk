/* LocalCommandDuplicatedDefaultVM.java

	Purpose:
		
	Description:
		
	History:
		Tue May 04 15:43:31 CST 2021, Created by rudyhuang

Copyright (C) 2021 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zephyr.test.mvvm.book.viewmodel.command;

import org.zkoss.bind.annotation.DefaultCommand;
import org.zkoss.zk.ui.util.Clients;

/**
 * @author rudyhuang
 */
public class LocalCommandDuplicatedDefaultVM {
	@DefaultCommand
	public void command1() {
		Clients.log("command1");
	}

	@DefaultCommand
	public void commandOne() {
		Clients.log("commandOne");
	}
}