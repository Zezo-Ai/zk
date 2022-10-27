/* ISpinnerCtrl.java

	Purpose:

	Description:

	History:
		Wed Oct 27 15:39:49 CST 2021, Created by katherine

Copyright (C) 2021 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.stateless.zpr;

import org.zkoss.zul.Spinner;

/**
 * An addition interface to {@link ISpinner}
 * that is used for implementation or tools.
 *
 * @author katherine
 */
public interface ISpinnerCtrl {
	static ISpinner from(Spinner instance) {
		return new ISpinner.Builder()
				.from((ISpinner) instance)
				.build();
	}
}