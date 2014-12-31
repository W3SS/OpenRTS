/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ground;

import com.jme3.input.InputManager;
import com.jme3.renderer.Camera;
import controller.Controller;
import controller.cameraManagement.GroundCameraManager;
import controller.editor.EditorInputInterpreter;
import model.Model;
import tools.LogUtil;
import view.View;

/**
 *
 * @author Benoît
 */
public class GroundController extends Controller {

    public GroundController(Model model, View view, InputManager inputManager, Camera cam) {
        super(model, view, inputManager, cam);
        
        inputInterpreter = new GroundInputInterpreter(this);
        cameraManager = new GroundCameraManager(cam, model);
    }

    
    @Override
    public void update(double elapsedTime) {
    }

    @Override
    public void manageEvent() {
    }

    @Override
    public void activate() {
        super.activate();
        inputManager.setCursorVisible(false);
        LogUtil.logger.info("ground controller on line");
    }
    
    
    
}