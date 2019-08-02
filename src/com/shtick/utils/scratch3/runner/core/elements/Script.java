/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements;

/**
 * A Tuple containing other Tuples
 * 
 * @author sean.cox
 *
 */
public interface Script{
	/**
	 * @return the context
	 */
	public ScriptContext getContext();
	
	/**
	 * When creating a sprite clone, exactly the same script will be associated with the new clone,
	 * just with a different context.
	 * 
	 * TODO Come up with a pithy name that isn't easily confused with an existing standard function name.
	 * 
	 * @param context
	 * @return A ScriptTupleImplementation that contains the same script with given context.
	 */
	public Script clone(ScriptContext context);

}
