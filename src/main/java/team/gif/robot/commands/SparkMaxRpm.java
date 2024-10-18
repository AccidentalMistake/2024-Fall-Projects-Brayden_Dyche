package team.gif.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.subsystems.SparkMaxMotor;

public class SparkMaxRpm extends Command {

    public SparkMaxRpm() {
        super();
        //addRequirements(Robot.climber); // uncomment
        addRequirements(Robot.sparkMaxMotor);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        Robot.sparkMaxMotor.pidControlRpm(Constants.SPARKMAX_MOTOR_RPM);
    }

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {}

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        Robot.sparkMaxMotor.pidControlRpm(0);
    }
}
