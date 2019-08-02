/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

/**
 * @author sean.cox
 *
 */
public interface Opcode {
	/**
	 * @author Sean
	 *
	 */
	public enum DataType{
	/**
	 * 
	 */
	STRING,
	/**
	 * 
	 */
	NUMBER,
	/**
	 * 
	 */
	BOOLEAN,
	/**
	 * Indicates that the value should be an encoded reference to a block.
	 * The string identifier of the meta block will be passed in.
	 */
	POINTER_META,
	/**
	 * Indicates that the value should be an encoded reference to a list.
	 * The reference should be resolved when executing an opcode expecting this type, resulting in a List object being passed in.
	 */
	POINTER_LIST,
	/**
	 * Indicates that the value should be an encoded reference to a broadcast.
	 * The reference should be resolved when executing an opcode expecting this type, resulting in a Broadcast object being passed in.
	 */
	POINTER_BROADCAST,
	/**
	 * Indicates that the value should be an encoded reference to a variable.
	 * The reference should be resolved when executing an opcode expecting this type, resulting in a Variable object being passed in.
	 */
	POINTER_VARIABLE,
	/**
	 * Shows up in arguments as a List<>
	 */
	SCRIPT,
	/**
	 * This means any one of the preceding data types, except TUPLE, or SCRIPT.
	 */
	OBJECT,
	};
	
	/**
	 * 
	 * @return The opcode for the instruction.
	 */
	public String getOpcode();

	/**
	 * 
	 * @return An map associating parameters with data types.
	 */
	public java.util.Map<String,DataType> getArgumentTypes();
}
