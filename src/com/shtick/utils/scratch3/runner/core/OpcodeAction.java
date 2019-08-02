/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

import java.util.Map;

import com.shtick.utils.scratch3.runner.core.elements.ScriptContext;

/**
 * @author sean.cox
 *
 */
public interface OpcodeAction extends Opcode{
	/**
	 * TODO Change the arguments parameter to be read-only.
	 * 
	 * @param runtime
	 * @param scriptRunner 
	 * @param context A ScriptContext. This will either be an instance of a Stage or a Sprite.
	 * @param arguments
	 * @return An OpcodeSubaction or null. (Null indicates no subaction should be performed.)
	 * @throws IllegalArgumentException if one of the arguments is of an unexpected or improper type, or if the an argument is missing or superfluous
	 */
	public OpcodeSubaction execute(ScratchRuntime runtime, ScriptTupleRunner scriptRunner, ScriptContext context, Map<String,Object> arguments);
}
