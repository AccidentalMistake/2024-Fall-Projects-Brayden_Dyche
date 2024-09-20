package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.DigitalInput;
import team.gif.robot.subsystems.drivers.Limelight;

public class LimitSwitch extends SubsystemBase {
    public static DigitalInput LimitSwitch = new DigitalInput(8);
    public LimitSwitch(){}
    public boolean Switch_State() {
        return LimitSwitch.get();
    }
}
