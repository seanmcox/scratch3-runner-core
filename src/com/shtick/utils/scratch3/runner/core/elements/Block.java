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
public interface Block{
	/**
	 * 
	 * @return The ID of the block.
	 */
	public String getID();
	
	/**
	 * @return the opcode, the first element of the tuple.
	 */
	public String getOpcode();
	
	/**
	 * 
	 * @return The Mutation for the Block, or null if there is none.
	 */
	public Mutation getMutation();
}
