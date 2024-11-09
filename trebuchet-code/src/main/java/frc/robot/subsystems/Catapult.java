
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Catapult extends SubsystemBase{
    private CANSparkMax motor = new CANSparkMax(49, CANSparkMax.MotorType.kBrushless);

    @Override
    public void periodic(){
        System.out.println("catapult fired!");
        motor.set(0.3);
    } 
    
}

