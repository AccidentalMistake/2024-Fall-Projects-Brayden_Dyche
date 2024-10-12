package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.OI;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;
import team.gif.robot.subsystems.TalonSrxMotor;


public class TalonJoystickControl extends Command {


    public TalonJoystickControl() {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.talonSrxMotor);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
    double left = Robot.oi.driver.getLeftY();
    Robot.talonSrxMotor.motorMove(left);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.talonSrxMotor.motorMove(0);
    }
}
