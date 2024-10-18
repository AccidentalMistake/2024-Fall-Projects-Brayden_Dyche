package team.gif.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkPIDController;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.Constants;
import team.gif.robot.Robot;
import team.gif.robot.RobotMap;

import java.beans.Encoder;

public class SparkMaxMotor extends SubsystemBase {
    public static CANSparkMax motor = new CANSparkMax(RobotMap.SparkMax_ID, CANSparkLowLevel.MotorType.kBrushless);
    public static SparkPIDController pidController = motor.getPIDController();


    public SparkMaxMotor(){
        motor.restoreFactoryDefaults();
        motor.setInverted(true);
        motor.setIdleMode(CANSparkBase.IdleMode.kBrake);
        pidController.setP(Constants.NeoConstants.kP_NEO);
        pidController.setFF(Constants.NeoConstants.FF_NEO);
    }

    public void sparkMaxMove(double voltageOutput){
        motor.setVoltage(voltageOutput);
    }

    public void pidControlRpm(double RpmOutput){
        //This top line is the right one
        pidController.setReference(RpmOutput, CANSparkBase.ControlType.kVelocity);
    }

    public double getMotorRpm(){
        return motor.getEncoder().getVelocity();
    }
}
