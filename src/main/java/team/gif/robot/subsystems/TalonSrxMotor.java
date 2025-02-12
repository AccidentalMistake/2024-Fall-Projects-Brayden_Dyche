package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class TalonSrxMotor extends SubsystemBase {

    private final TalonSRX motor;

    public TalonSrxMotor(){
        motor = new TalonSRX(RobotMap.TALON_MOTOR_ID);
        motor.configFactoryDefault();
        motor.setNeutralMode(NeutralMode.Brake);
    }

    public void motorMove(double percentOutput) {
        motor.set(TalonSRXControlMode.PercentOutput, percentOutput);

    }
}
