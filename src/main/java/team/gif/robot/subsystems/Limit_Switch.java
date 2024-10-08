package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class Limit_Switch extends SubsystemBase {
    private final DigitalInput limit_Switch;

    public Limit_Switch(){
        limit_Switch = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);
    }

    public boolean limit_Switch_State() {
        return limit_Switch.get();
    }
}
