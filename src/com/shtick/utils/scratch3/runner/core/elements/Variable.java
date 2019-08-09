package com.shtick.utils.scratch3.runner.core.elements;

/**
 * 
 * @author sean.cox
 *
 */
public interface Variable {
	
	/**
	 * @return the id
	 */
	public String getID();

	/**
	 * @return the value
	 */
	public Object getValue();

	/**
	 * 
	 * @param value
	 */
	public void setValue(Object value);
}
