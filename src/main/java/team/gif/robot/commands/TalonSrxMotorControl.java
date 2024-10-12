package team.gif.robot.commands;


import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;

public class TalonSrxMotorControl extends Command {



    public TalonSrxMotorControl() {
        super();
        addRequirements(Robot.talonSrxMotor);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        Robot.talonSrxMotor.motorMove(Constants.CIM_MOTOR_PERCENT);
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
