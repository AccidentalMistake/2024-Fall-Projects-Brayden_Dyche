package team.gif.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj2.command.Command;
import team.gif.robot.RobotMap;
import team.gif.robot.subsystems.Talon_Srx_Motor;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import static team.gif.robot.Constants.motor_Power;
import static team.gif.robot.Constants.motor_Stop;

public class Talon_Srx_Motor_Control extends Command {

    private final TalonSRX motor;

    public Talon_Srx_Motor_Control() {
        super();

        motor = new TalonSRX(RobotMap.TALON_MOTOR_ID);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);

    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs (~20ms) while the command is scheduled
    @Override
    public void execute() {
        motor.set(ControlMode.PercentOutput, motor_Power);
    }

    // Return true when the command should end, false if it should continue. Runs every ~20ms.
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called when the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        motor.set(ControlMode.PercentOutput, motor_Stop);
    }
}
