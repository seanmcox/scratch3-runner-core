/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

/**
 * @author sean.cox
 *
 */
public abstract class JumpBlock extends ControlBlock{
	private Integer index;
	
	/**
	 * @param index
	 */
	public JumpBlock(Integer index) {
		this.index = index;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}
}
