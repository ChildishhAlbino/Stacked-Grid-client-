/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.Commands;

import server.Controller.Controller;

/**
 *
 * @author conno
 */
public abstract class ControllerCommand implements ICommand<Controller> {

    public static class AddOneCommand extends ControllerCommand {

        @Override
        public ResultCode execute(Controller commandHandler) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static class StartServerCommand extends ControllerCommand {

        @Override
        public ResultCode execute(Controller commandHandler) {
            commandHandler.run();
            return ResultCode.Success;
        }
    }
}
