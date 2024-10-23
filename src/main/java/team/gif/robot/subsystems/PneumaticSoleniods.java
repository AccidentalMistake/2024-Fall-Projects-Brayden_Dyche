package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class PneumaticSoleniods extends SubsystemBase {
    private DoubleSolenoid solenoid;


    public PneumaticSoleniods() {
        solenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotMap.SOLENIOD_IN_ID, RobotMap.SOLENIOD_OUT_ID);
    }


    public void setSolenoid(DoubleSolenoid.Value state){
        solenoid.set(state);
    }
}
