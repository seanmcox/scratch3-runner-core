/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

import java.util.Map;

import com.shtick.utils.scratch3.runner.core.elements.Mutation;
import com.shtick.utils.scratch3.runner.core.elements.Script;

/**
 * @author sean.cox
 *
 */
public interface OpcodeHat extends Opcode{
	/**
	 * Should be the first called just after the application starts, marking the moment when event firing can be started.
	 * 
	 * @param runtime
	 */
	public void applicationStarted(ScratchRuntime runtime);
	
	/**
	 * Generally, scripts will be registered before applicationStarted is called,
	 * though clones will register their scripts afterwards. 
	 * 
	 * @param script 
	 * @param arguments 
	 * @param mutation 
	 * 
	 */
	public void registerListeningScript(Script script, Map<String,Object> arguments, Mutation mutation);
	
	/**
	 * Generally, only clones will worry about unregistering their scripts.
	 * 
	 * @param script 
	 * @param arguments 
	 * @param mutation 
	 * 
	 */
	public void unregisterListeningScript(Script script, Map<String,Object> arguments, Mutation mutation);
}
