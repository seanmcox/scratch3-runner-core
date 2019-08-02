/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

/**
 * @author sean.cox
 *
 */
public abstract class LocalVarBlock extends ControlBlock{
	private int id;
	
	/**
	 * @param id An ID for the local variable.
	 */
	public LocalVarBlock(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getLocalVarIdentifier() {
		return id;
	}

	/**
	 * @param id the index to set
	 */
	public void setLocalVarIdentifier(int id) {
		this.id = id;
	}
}
