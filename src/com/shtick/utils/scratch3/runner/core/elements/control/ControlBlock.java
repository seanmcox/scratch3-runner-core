/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

import com.shtick.utils.scratch3.runner.core.elements.Block;
import com.shtick.utils.scratch3.runner.core.elements.Mutation;

/**
 * A Tuple with a String as the first element.
 * 
 * @author sean.cox
 *
 */
public abstract class ControlBlock implements Block{
	/* (non-Javadoc)
	 * @see com.shtick.utils.scratch.runner.core.elements.BlockTuple#getOpcode()
	 */
	@Override
	public String getOpcode() {
		return this.getClass().getName();
	}

	/* (non-Javadoc)
	 * @see com.shtick.utils.scratch3.runner.core.elements.Block#getID()
	 */
	@Override
	public String getID() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.shtick.utils.scratch3.runner.core.elements.Block#getMutation()
	 */
	@Override
	public Mutation getMutation() {
		return null;
	}
}
