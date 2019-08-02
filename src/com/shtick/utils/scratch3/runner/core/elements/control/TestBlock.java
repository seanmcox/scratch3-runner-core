/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements.control;

/**
 * @author sean.cox
 *
 */
public class TestBlock extends ControlBlock{
	private Object test;
	
	/**
	 * @param test Either a Boolean, or a BlockTuple that should resolve to a Boolean.
	 */
	public TestBlock(Object test) {
		super();
		this.test = test;
	}

	/**
	 * 
	 * @return Either a Boolean, or a BlockTuple that should resolve to a Boolean.
	 */
	public Object getTest() {
		return test;
	}
}
