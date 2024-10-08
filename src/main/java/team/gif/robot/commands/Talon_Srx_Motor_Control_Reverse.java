package team.gif.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.RobotMap;

import static team.gif.robot.Constants.motor_Power_Reverse;
import static team.gif.robot.Constants.motor_Stop;

public class Talon_Srx_Motor_Control_Reverse extends Command {

    private final TalonSRX motor_Reverse;

    public Talon_Srx_Motor_Control_Reverse() {
        super();

        motor_Reverse = new TalonSRX(RobotMap.TALON_MOTOR_ID);
        motor_Reverse.configFactoryDefault();
        motor_Reverse.setNeutralMode(NeutralMode.Brake);

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        motor_Reverse.set(ControlMode.PercentOutput, motor_Power_Reverse);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        motor_Reverse.set(ControlMode.PercentOutput, motor_Stop);
    }
}
