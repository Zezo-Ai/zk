/* ChosenboxTest.java

	Purpose:
		
	Description:
		
	History:
		Mon Apr 26 16:17:45 CST 2021, Created by rudyhuang

Copyright (C) 2021 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zephyr.webdriver.mvvm.book.comp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.zkoss.zephyr.webdriver.ClientBindTestCase;

/**
 * @author rudyhuang
 */
public class ChosenboxTest extends ClientBindTestCase {
	@Test
	public void testMultiple() {
		connect();

		click(jq("$cbox1"));
		waitResponse(true);
		click(jq(".z-chosenbox-option:contains(Item 0):visible"));
		waitResponse();
		assertEquals("[Item 0]", jq("$l1").text());

		click(jq("$cbox1"));
		waitResponse(true);
		click(jq(".z-chosenbox-option:contains(Item 3):visible"));
		waitResponse();
		assertEquals("[Item 0,Item 3]", jq("$l1").text());

		click(jq(".z-chosenbox-item:contains(Item 0) > .z-chosenbox-delete"));
		waitResponse();
		assertEquals("[Item 3]", jq("$l1").text());

		click(jq(".z-chosenbox-item:contains(Item 3) > .z-chosenbox-delete"));
		waitResponse();
		assertEquals("[]", jq("$l1").text());
	}

	@Test
	public void testSingle() {
		connect();

		click(jq("$cbox2"));
		waitResponse(true);
		click(jq(".z-chosenbox-option:contains(Item 0):visible"));
		waitResponse();
		assertEquals("0", jq("$l2").text());

		click(jq("$cbox2"));
		waitResponse(true);
		click(jq(".z-chosenbox-option:contains(Item 3):visible"));
		waitResponse();
		// A value of Chosenbox.getSelectedIndex is always the index of the first selected item
		assertEquals("0", jq("$l2").text());

		click(jq(".z-chosenbox-item > .z-chosenbox-delete"));
		waitResponse();
		assertEquals("-1", jq("$l2").text());
	}
}