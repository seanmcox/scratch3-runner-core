package com.shtick.utils.scratch3.runner.core;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

import javax.swing.JPanel;

import com.shtick.utils.scratch3.runner.core.elements.RenderableChild;
import com.shtick.utils.scratch3.runner.core.elements.Script;
import com.shtick.utils.scratch3.runner.core.elements.ScriptContext;
import com.shtick.utils.scratch3.runner.core.elements.Target;

/**
 * 
 * @author sean.cox
 *
 */
public interface ScratchRuntime {
	/**
	 * 
	 * @return The current stage, or null if there is none. The stage is a target with isStage set to true.
	 */
	public Target getCurrentStage();
	
	/**
	 * 
	 * @param name
	 * @return The named ScriptContext
	 */
	public ScriptContext getScriptContextByName(String name);
	
	/**
	 * 
	 * @param sprite
	 * @param image If image is null, then sprite can also be null. All bubble images are removed.
	 */
	public void setSpriteBubbleImage(Target sprite, Image image);
	
	/**
	 * 
	 * @return An array of all Sprites/Lists/StageMonitors in order from back to front.
	 */
	public RenderableChild[] getAllRenderableChildren();
	
	/**
	 * @return The Stage width in pixels. Normally this should be 480.
	 */
	public int getStageWidth();

	/**
	 * @return The Stage height in pixels. Normally this should be 360.
	 */
	public int getStageHeight();
	
	/**
	 * 
	 * @return The JPanel component implemented to represent the Stage for the ScratchRuntime.
	 */
	public JPanel getStagePanel();
	
	/**
	 * 
	 * @return The last reported mouse location.
	 */
	public Point2D.Double getMouseStagePosition();
	
	/**
	 * 
	 * @return True if the primary mouse button is depressed and false otherwise.
	 */
	public boolean isMouseDown();
	
	/**
	 * Adds the given ScriptTuple to the list of ScriptTuples being executed. If it is already being executed, then it is restarted.
	 * 
	 * @param script
	 * @return A ScriptTupleRunner for the started ScriptTuple.
	 * 
	 */
	public ScriptTupleRunner startScript(Script script);

	/**
	 * Clears all marks on the pen layer.
	 */
	public void clearPenLayer();
	
	/**
	 * Repositions the given Sprite on top of all the other Sprites.
	 * 
	 * @param sprite
	 */
	public void bringToFront(Target sprite);
	
	/**
	 * Repositions the given Sprite beneath all the other Sprites.
	 * 
	 * @param sprite
	 */
	public void sendToBack(Target sprite);
	
	/**
	 * Moves the given sprite back n layers.
	 * 
	 * @param sprite
	 * @param n Can be a negative number to bring the sprite forward.
	 */
	public void sendBackNLayers(Target sprite, int n);
	
	/**
	 * Used to add a component to the top layer (above all the sprites) of the stage.
	 * Uses a coordinate system similar to scratch's, but with the y-axis reversed.
	 * ie. centered on the middle, with x increasing to the right and y increasing to the bottom.
	 * The width and the height units are stage units.
	 * 
	 * It should not be necessary to call this function in a special thread.
	 * 
	 * @param component
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public void addComponent(Component component, int x, int y, int width, int height);
	
	/**
	 * Removes the given component from the stage.
	 * 
	 * @param component
	 */
	public void removeComponent(Component component);
	
	/**
	 * 
	 */
	public void repaintStage();
	
	/**
	 * Stops all sounds currently being played.
	 */
	public void stopAllSounds();
	
	/**
	 * 
	 * @param listener The KeyListener instance to register.
	 */
	public void addKeyListener(KeyListener listener);
	
	/**
	 * 
	 * @param listener The KeyListener instance to unregister.
	 */
	public void removeKeyListener(KeyListener listener);
	
	/**
	 * 
	 * @param listener A StageMouseListener.  Coordinates will be reported with respect to the stage.
	 */
	public void addStageMouseListener(MouseListener listener);
	
	/**
	 * 
	 * @param listener A StageMouseListener
	 */
	public void removeStageMouseListener(MouseListener listener);
	
	/**
	 * 
	 * @param listener A MouseMotionListener. Coordinates will be reported with respect to the stage.
	 */
	public void addStageMouseMotionListener(MouseMotionListener listener);
	
	/**
	 * 
	 * @param listener A MouseMotionListener
	 */
	public void removeStageMouseMotionListener(MouseMotionListener listener);

	/**
	 * 
	 * @param keyID The scratch identifier for the key.
	 * @return true if the key is currently pressed and false otherwise.
	 * @throws IllegalArgumentException if the keyID is unrecognized.
	 */
	public boolean isKeyPressed(String keyID);
	
	/**
	 * Starts the project running from tis current state.
	 */
	public void start();

	/**
	 * 
	 * @return true if the project is currently running (start has been called, and stop hasn't been called since) and false otherwise.
	 */
	public boolean isRunning();
	
	/**
	 * Exits the application.
	 */
	public void stop();

	/**
	 * 
	 * @return true if stop has been called and false otherwise.
	 */
	public boolean isStopped();
}
