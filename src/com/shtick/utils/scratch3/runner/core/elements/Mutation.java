/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements;

/**
 * A Tuple with a String as the first element.
 * 
 * TODO Don't pass the BlockTuple out to the block implementations.
 * Move this definition to the scratch runner implementation. 
 * 
 * @author sean.cox
 *
 */
public interface Mutation{
	/**
	 * @return the tag name.
	 */
	public String getTagName();
	
	/**
	 * 
	 * @return
	 */
	public Object[] getChildren();
	
	/**
	 * 
	 * @return
	 */
	public String getProccode();
	
	/**
	 * 
	 * @return
	 */
	public String getArgumentIds();
	
	/**
	 * 
	 * @return
	 */
	public String getArgumentNames();
	
	/**
	 * 
	 * @return
	 */
	public String getArgumentDefaults();
	
	/**
	 * 
	 * @return true, false, or null
	 */
	public Boolean getWarp();
}
