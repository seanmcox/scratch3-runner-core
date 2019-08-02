/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

import java.util.Map;

import com.shtick.utils.scratch3.runner.core.elements.Block;

/**
 * @author sean.cox
 *
 */
public interface OpcodeControl extends Opcode{
	/**
	 * @param arguments 
	 * @return An array of BlockTuples to be executed by the calling thread, possibly including special constructed BlockTuples that instruct the calling thread to do things like jump specific points in the return instruction set.
	 *         The return value should not depend upon any special condition that might change at runtime.
	 *         The runner should be able to take the result, and use it without ever calling this function again.
	 *         (eg. it may convert the instructions to another convenient form which it will always use in the future)
	 *         Any jump instructions indexes are to be provided relative to the returned BlockTuple array.
	 *         Jumps to 0 through the length of the array are valid (the latter being a jump to skip all remaining instructions provided by the return value).
	 * @throws IllegalArgumentException if one of the arguments is of an unexpected or improper type, or if the an argument is missing or superfluous
	 */
	public Block[] execute(Map<String, Object> arguments);
}
