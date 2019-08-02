/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

import java.util.Map;

import com.shtick.utils.scratch3.runner.core.elements.Mutation;
import com.shtick.utils.scratch3.runner.core.elements.ScriptContext;

/**
 * @author sean.cox
 *
 */
public interface OpcodeValue extends Opcode{
	/**
	 * TODO Change the arguments parameter to be read-only.
	 * 
	 * @param runtime
	 * @param runner 
	 * @param context
	 * @param arguments 
	 * @param mutation 
	 * @return The value resulting from the execution. Must be one of String, Long, Double, or Boolean
	 */
	public Object execute(ScratchRuntime runtime, ScriptTupleRunner runner, ScriptContext context, Map<String,Object> arguments, Mutation mutation);
}
