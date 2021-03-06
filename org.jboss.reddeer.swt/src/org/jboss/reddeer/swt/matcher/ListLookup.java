package org.jboss.reddeer.swt.matcher;

import org.eclipse.swt.widgets.List;
import org.hamcrest.Matcher;
import org.jboss.reddeer.swt.lookup.impl.WidgetLookup;


/**
 * List lookup containing lookup routines for List widget type
 * @author Rastislav Wagner
 *
 */
public class ListLookup {

	private static ListLookup instance = null;

	private ListLookup() {
	}

	/**
	 * Creates and returns instance of List Lookup
	 * 
	 * @return ListLookup instance
	 */
	public static ListLookup getInstance() {
		if (instance == null)
			instance = new ListLookup();
		return instance;
	}

	/**
	 * Return List instance
	 * 
	 * @param matcher
	 * @return List Widget matching criteria
	 */
	@SuppressWarnings({ "rawtypes" })
	public List getList(int index, Matcher... matchers) {
		return (List)WidgetLookup.getInstance().activeWidget(List.class, index, matchers);
	}

}
