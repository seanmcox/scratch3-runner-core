/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

/**
 * @author sean.cox
 *
 */
public abstract class JumpBlock extends ControlBlock{
	private int index;
	
	/**
	 * @param index
	 */
	public JumpBlock(int index) {
		this.index = index;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}
