/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements;

/**
 * @author scox
 * 
 * See: https://en.scratch-wiki.info/wiki/Scratch_File_Format
 *
 */
public interface TypedValue {
	/**
	 * This is basically a literal value.
	 * 
	 * The value is single-part. Can be 4, 5, 10, 11.
	 * Can be a string , which references another block. (eg. procedure_definition will have a reference to a procedure_prototype)
	 */
	public static final int TYPE_SHADOW = 1;
	/**
	 * A slot with no literal value.
	 * 
	 */
	public static final int TYPE_NOT_SHADOW = 2;
	/**
	 * There's a basic literal value and a block which supercedes it.
	 * 
	 * If the first value is a string, then it is a reference to another sensing/value-generating block.
	 * Otherwise, 12, 13
	 * 
	 * The second value could be 4, 5, 10.
	 */
	public static final int TYPE_OBSCURRED_SHADOW = 3;
	/**
	 * Used to mark a numeric value in looks_sayforsecs and when defining defaults for the same.
	 */
	public static final int TYPE_NUMBER = 4;
	/**
	 * Seems to mark a numeric value in control_wait and when defining defaults in other blocks.
	 * 
	 * Why two of these?
	 * - Not an int/float distinction
	 * - Not a default/non-default distinction
	 */
	public static final int TYPE_POSITIVE_NUMBER = 5;
	/**
	 * 
	 */
	public static final int TYPE_POSITIVE_INTEGER = 6;
	/**
	 * 
	 */
	public static final int TYPE_INTEGER = 7;
	/**
	 * 
	 */
	public static final int TYPE_ANGLE = 8;
	/**
	 * 
	 */
	public static final int TYPE_COLOR = 9;
	/**
	 * 
	 */
	public static final int TYPE_STRING = 10;
	/**
	 * 
	 */
	public static final int TYPE_BROADCAST = 11;
	/**
	 * 
	 */
	public static final int TYPE_VARIABLE = 12;
	/**
	 * 
	 */
	public static final int TYPE_LIST = 13;

	/**
	 * 
	 * @return
	 */
	public int getType();
	
	/**
	 * 
	 * @return
	 */
	public java.util.List<Object> getValue();
}
