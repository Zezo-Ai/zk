/* B101_ZK_5793Test.java

	Purpose:

	Description:

	History:
		12:56 PM 2024/9/26, Created by jumperchen

Copyright (C) 2024 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.zats.test2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.zkoss.test.webdriver.WebDriverTestCase;

/**
 * @author jumperchen
 */
public class B101_ZK_5793Test extends WebDriverTestCase {
	@Test
	public void testFileupload() {
		connect();
		waitResponse();
		sendKeys(jq("input[type=file]"), System.getProperty("user.dir") + "/src/main/webapp/test2/B101_ZK_5793.png");

		int count = 0;
		boolean hasProgress = false;
		while (count++ < 200) {
			sleep(10);
			if (jq(".z-fileupload-manager.z-popup-open").length() > 0) {
				hasProgress = true;
				break;
			}
		}

		assertTrue(hasProgress);
	}
}
