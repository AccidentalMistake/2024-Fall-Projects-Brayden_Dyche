package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Talon_Srx_Motor extends SubsystemBase {

    private TalonSRX motor;

    public Talon_Srx_Motor(){
        motor = new TalonSRX(RobotMap.TALON_MOTOR_ID);
    }

    public void Motor_Move(double percentoutput) {
        motor.set(TalonSRXControlMode.PercentOutput, percentoutput);
    }
}
