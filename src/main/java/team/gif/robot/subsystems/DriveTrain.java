package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.WPI_PigeonIMU;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class DriveTrain  extends SubsystemBase {
    private final WPI_TalonSRX frontLeftCIM;
    private final WPI_TalonSRX frontRightCIM;
    private final WPI_TalonSRX backLeftCIM;
    private final WPI_TalonSRX backRightCIM;

    private DifferentialDrive drive;
    public DriveTrain(){
        frontLeftCIM = new WPI_TalonSRX(RobotMap.LEFT_FRONT_ID);
        backLeftCIM = new WPI_TalonSRX(RobotMap.LEFT_BACK_ID);
        backRightCIM = new WPI_TalonSRX(RobotMap.RIGHT_BACK_ID);
        frontRightCIM = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_ID);

        frontLeftCIM.configFactoryDefault();
        backLeftCIM.configFactoryDefault();
        frontRightCIM.configFactoryDefault();
        backRightCIM.configFactoryDefault();

        frontLeftCIM.setNeutralMode(NeutralMode.Brake);
        backRightCIM.setNeutralMode(NeutralMode.Brake);
        frontRightCIM.setNeutralMode(NeutralMode.Brake);
        backLeftCIM.setNeutralMode(NeutralMode.Brake);

        backLeftCIM.follow(frontLeftCIM);
        backRightCIM.follow(frontRightCIM);

        drive = new DifferentialDrive(frontLeftCIM, frontRightCIM);
    }
    public void driveArcade(double speed, double rotation){
        drive.arcadeDrive(speed, rotation);
    }
    public void driveTank(double leftSpeed, double rightSpeed){
        drive.tankDrive(leftSpeed, rightSpeed);
    }
}

