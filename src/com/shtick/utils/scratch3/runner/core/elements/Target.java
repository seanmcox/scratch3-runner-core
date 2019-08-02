/**
 * 
 */
package com.shtick.utils.scratch3.runner.core.elements;

import java.awt.geom.Area;
import java.util.Set;

/**
 * @author sean.cox
 *
 */
public interface Target extends ScriptContext, RenderableChild{
	/**
	 * The rotation style in which the sprite faces the rotation direction by rotating about its rotation center.
	 */
	public static final String ROTATION_STYLE_NORMAL = "normal";
	/**
	 * The rotation style in which the sprite faces the rotation direction by flipping to face either left to right.
	 */
	public static final String ROTATION_STYLE_LEFT_RIGHT = "leftRight";
	/**
	 * The rotation style in which the sprite doesn't rotate at all.
	 */
	public static final String ROTATION_STYLE_NONE = "none";
	
	/**
	 * @return the objName
	 */
	@Override
	public String getObjName();

	/**
	 * 
	 * @return The current Costume.
	 */
	public Costume getCurrentCostume();

	/**
	 * 
	 * @return The current Costume index. (base-0)
	 */
	public int getCurrentCostumeIndex();
	
	/**
	 * 
	 * @param i The index of the new current costume. (base-0)
	 * @return true if a i>=0 and i is less than the number of costumes. False otherwise.
	 */
	public boolean setCurrentCostumeIndex(int i);

	/**
	 * 
	 * @return The the number of costumes.
	 */
	public int getCostumeCount();
	
	/**
	 * Sets the costume by its name.
	 * @param name
	 * @return true if a costume with the given name existed, and false otherwise
	 */
	public boolean setCostumeByName(String name);

	/**
	 * @param scratchX the scratchX to set
	 * @param scratchY 
	 */
	public void gotoXY(double scratchX, double scratchY);

	/**
	 * @return the scratchX
	 */
	public double getScratchX();

	/**
	 * @param scratchX the scratchX to set
	 */
	public void setScratchX(double scratchX);

	/**
	 * @return the scratchY
	 */
	public double getScratchY();

	/**
	 * @param scratchY the scratchY to set
	 */
	public void setScratchY(double scratchY);

	/**
	 * @return the size; a value where 0 means 0%, 100 means 100%, etc.
	 */
	public double getSize();

	/**
	 * @param size the size to set; a value where 0 means 0%, 100 means 100%, etc.
	 */
	public void setSize(double size);

	/**
	 * @return the direction in degrees where 0 degrees is oriented pointing up. A value in the range of -180 to 180.
	 */
	public double getDirection();

	/**
	 * @param direction the direction to set; a value in degrees where 0 degrees is oriented pointing up.
	 */
	public void setDirection(double direction);

	/**
	 * @return the rotationStyle
	 */
	public String getRotationStyle();

	/**
	 * @param rotationStyle the rotationStyle to set
	 */
	public void setRotationStyle(String rotationStyle);
	
	/**
	 * An intensive calculation if this needs to be calculated.
	 * 
	 * The coordinate system of the shape will be centered on the rotation center of the current costume, with x increasing to the right and y increasing to the bottom.
	 * The shape will be scaled to match the Sprite's scale and rotated per the Sprite's direction and rotation style.
	 * 
	 * 
	 * @return An area describing the shape of the Sprite's current costume, using the current look of the sprite. null if the Target is not a Sprite.
	 */
	public Area getShape();
	
	/**
	 * 
	 * @return true of this is a Sprite and is a clone of another Sprite
	 */
	public boolean isClone();
	
	/**
	 * 
	 * @return The Sprite which is the parent of this clone, or null if this Sprite is not a clone.
	 */
	public Target getCloneParent();
	
	/**
	 * Causes a clone of this Sprite to be created.
	 */
	public void createClone();
	
	/**
	 * Deletes this sprite. This function must be called by a thread belonging to the Sprite's ThreadGroup, and the Sprite must be a clone.
	 */
	public void deleteClone();
	
	/**
	 * 
	 * @return All clones of this sprite. (Clones only advertise child clones.)
	 */
	public Set<Target> getClones();
	
	/**
	 * 
	 * @param name
	 * @return The value for the given effect.
	 */
	public double getEffect(String name);

	/**
	 * Sets the value for the named effect.
	 * 
	 * @param name
	 * @param value
	 */
	public void setEffect(String name, double value);
	
	/**
	 * Unsets all effects.
	 */
	public void clearEffects();
}
