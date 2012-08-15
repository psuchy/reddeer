package org.jboss.reddeer.swt.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * With Mnemonic matcher. Should be used for menu item label matching.
 * Removes all ampersands and shortcuts from input text before comparing
 * @author Vlado Pakan
 * 
 */
public class WithMnemonicMatcher extends BaseMatcher<String> {

	String text;
	
	public WithMnemonicMatcher(String text ) {
		this.text = text;
	}
	
	@Override
	public void describeTo(Description description) {
		// TODO Auto-generated method stub

	}

	/**
	 * Text matches
	 */
	@Override
	public boolean matches(Object item) {
		
		if (item instanceof String) {
			String textToMatch = ((String)item).replaceAll("&", "").split("\t")[0];
			if (textToMatch.equals(text)) {
				return true;
			}
			
		}
		return false;
	}

}
