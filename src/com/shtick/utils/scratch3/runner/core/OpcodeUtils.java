/**
 * 
 */
package com.shtick.utils.scratch3.runner.core;

import com.shtick.utils.scratch3.runner.core.elements.Block;

/**
 * @author sean.cox
 *
 */
public class OpcodeUtils {
	/**
	 * A string of characters ordered as scratch would order them.
	 */
	public static final String ORDERED_CHARS = " !\"#$%&'()*+,-./0123456789:;<=>?@[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
	
	/**
	 * 
	 * @param obj1 Expected types are Number, Boolean, String. Must never be null.
	 * @param obj2 Expected types are Number, Boolean, String. Must never be null.
	 * @return true if the object can be resolved to a value using ScriptTupleRunner.getValue(), and false otherwise.
	 */
	public static boolean equals(Object obj1,Object obj2) {
		String a0 = obj1+"";
		String a1 = obj2+"";
		if(obj1 instanceof Double) {
			if(((Double)obj1).doubleValue() == ((Double)obj1).longValue())
				a0 = ""+((Double)obj1).longValue();
		}
		if(obj2 instanceof Double) {
			if(((Double)obj2).doubleValue() == ((Double)obj2).longValue())
				a1 = ""+((Double)obj2).longValue();
		}
		if(obj1 instanceof Boolean) {
			a0 = OpcodeUtils.booleanToNumber((Boolean)obj1)+"";
		}
		if(obj2 instanceof Boolean) {
			a1 = OpcodeUtils.booleanToNumber((Boolean)obj2)+"";
		}
		return a0.equals(a1);
	}

	/**
	 * 
	 * @param obj Expected types are java.util.List, Number, Boolean, Block, and String. null is handled, but otherwise, it is assumed that no other types will be passed in.
	 * @return true if the object can be resolved to a value using ScriptTupleRunner.getValue(), and false otherwise.
	 */
	public static boolean isEvaluable(Object obj) {
		if((obj==null)||(obj instanceof java.util.List<?>))
			return false;
		if(obj instanceof Block)
			return true;
		return true;
	}
	
	/**
	 * 
	 * @param b
	 * @return 1 if b and 0 if !b.
	 */
	private static int booleanToNumber(Boolean b) {
		if(b)
			return 1;
		return 0;
	}
	
	/**
	 * 
	 * @param value Number, Boolean, or String
	 * @return The Scratch String representation of the object.
	 *         null, or any other weird value returns an empty String.
	 */
	public static String getStringValue(Object value) {
		if(value == null)
			return "";
		if(value instanceof String)
			return (String)value;
		if(value instanceof Boolean)
			return value.toString();
		if(value instanceof Number) {
			Number n = (Number)value;
			if(n instanceof Long)
				return n.toString();
			String retval = n.toString();
			if(retval.endsWith(".0"))
				return ""+n.longValue();
			return retval;
		}
		return "";
	}
	
	/**
	 * 
	 * @param value The value to resolve to an Numeric type.
	 * @return The numeric value of value as per Scratch's method of resolving data types to numbers.
	 *         The returned value will be either a Long or a Double.
	 *         If value is a Double or a Long, then value is returned.
	 */
	public static Number getNumericValue(Object value) {
		if(value instanceof Number)
			return (Number)value;
		if(value instanceof Boolean)
			return ((Boolean)value).booleanValue()?1L:0L;

		try {
			return new Long(value.toString());
		}
		catch(NumberFormatException t) {}
		if(!(value instanceof String))
			return new Long(0);
		if("NaN".equals(value)||"Infinity".equals(value))
			return new Long(0);
		if(((String)value).startsWith("0x")) // Quick and easy way to exclude hexadecimal floating point values.
			return new Long(0);
		try {
			return new Double(value.toString());
		}
		catch(NumberFormatException t) {}
		return new Long(0);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return Less than zero if a is less than b in Scratch's estimation, greater than zero if a is greater than b in Scratch's estimation, and 0 if they are the same.
	 */
	public static int compareChars(char a, char b) {
		a = Character.toLowerCase(a);
		b = Character.toLowerCase(b);
		if(a==b)
			return 0;
		return ORDERED_CHARS.indexOf(a)-ORDERED_CHARS.indexOf(b);
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return Less than zero if a is less than b in Scratch's estimation, greater than zero if a is greater than b in Scratch's estimation, and 0 if they are the same.
	 */
	public static int compareStrings(String a, String b) {
		int diff;
		for(int i=0;i<Math.min(a.length(), b.length());i++) {
			diff = compareChars(a.charAt(i),b.charAt(i));
			if(diff!=0)
				return diff;
		}
		return a.length()-b.length();
	}
}
