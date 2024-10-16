package team.gif.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.RobotMap;

public class SparkMaxMotor extends SubsystemBase {
    private CANSparkMax motor;

    public SparkMaxMotor(){
        motor = new CANSparkMax(RobotMap.SparkMax_ID, CANSparkLowLevel.MotorType.kBrushless);
        motor.restoreFactoryDefaults();
        motor.setIdleMode(CANSparkBase.IdleMode.kBrake);
    }

    public void sparkMaxMove(double voltageOutput){
        motor.setVoltage(voltageOutput);
    }
    

}
