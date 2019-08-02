/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements;

import java.util.Map;

/**
 * @author sean.cox
 *
 */
public interface StageMonitor extends RenderableChild{
	/**
	 * 
	 */
	public static final String MODE_DEFAULT = "default";
	/**
	 * 
	 */
	public static final String MODE_LARGE = "large";
	/**
	 * 
	 */
	public static final String MODE_SLIDER = "slider";
	/**
	 * 
	 */
	public static final String MODE_LIST = "list";

	/**
	 * @return the ID of the monitor
	 */
	public String getId();

	/**
	 * @return the name of the relevant target, if any
	 */
	public String getSpriteName();

	/**
	 * @return the opcode
	 */
	public String getOpcode();

	/**
	 * @return the params
	 */
	public Map<String, Object> getParams();

	/**
	 * @return the mode
	 */
	public String getMode();

	/**
	 * @return the sliderMin
	 */
	public double getSliderMin();

	/**
	 * @return the sliderMax
	 */
	public double getSliderMax();

	/**
	 * @return the isDiscrete
	 */
	public boolean isDiscrete();

	/**
	 * @return the x
	 */
	public double getX();

	/**
	 * @return the y
	 */
	public double getY();
}
