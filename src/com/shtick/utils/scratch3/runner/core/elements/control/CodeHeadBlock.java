/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

/**
 * @author sean.cox
 *
 */
public class CodeHeadBlock extends ControlBlock{
	private String blockID;
	
	/**
	 * @param blockID
	 */
	public CodeHeadBlock(String blockID) {
		this.blockID = blockID;
	}

	/**
	 * @return the blockID
	 */
	public String getBlockID() {
		return blockID;
	}
}
