/* IListheaderRichlet.java

	Purpose:

	Description:

	History:
		Fri Apr 08 15:37:00 CST 2022, Created by katherine

Copyright (C) 2022 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.stateless.test.docs.data;

import org.zkoss.stateless.annotation.RichletMapping;
import org.zkoss.stateless.sul.IColumn;
import org.zkoss.stateless.ui.StatelessRichlet;
import org.zkoss.stateless.sul.IListbox;
import org.zkoss.stateless.sul.IListhead;
import org.zkoss.stateless.sul.IListheader;
import org.zkoss.statelessex.state.IListboxController;
import org.zkoss.zul.RowComparator;
import org.zkoss.zul.SimpleListModel;

/**
 * A set of example for {@link IColumn} Java Docs.
 * And also refers to something else on <a href="https://www.zkoss.org/wiki/ZK_Component_Reference/Data/Listbox/Listheader">IListheader</a>,
 * if any.
 *
 * @author katherine
 * @see IColumn
 */
@RichletMapping("/data/iListheader")
public class IListheaderRichlet implements StatelessRichlet {
	@RichletMapping("/sort")
	public IListbox sort() {
		IListhead head = IListhead.of(IListheader.of("column").withSortDirection(IListheader.SortDirection.DESCENDING)
				.withSortAscending(new RowComparator(1, true, true))
				.withSortDescending(new RowComparator(1, false, true)));
		IListbox listbox = IListbox.ofListhead(head).withAutosort(IListbox.Autosort.ENABLE);
		return IListboxController.of(listbox, initListheaderModel()).build();
	}

	private SimpleListModel initListheaderModel() {
		String[] data = new String[3];
		data[0] = "2";
		data[1] = "1";
		data[2] = "3";
		return new SimpleListModel(data);
	}
}