/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class launchMotors extends SubsystemBase {
  /**
   * Creates a new launchMotors.
   */
  Victor motor1;
  Victor motor2;
  public launchMotors() 
  {
    motor1 = new Victor(1);
    motor2 = new Victor(2);
  }
  public void startmotah()
  {
    motor1.setSpeed(0.4);
    motor2.setSpeed(0.4);
  }
  public void stopmotah()
  {
    motor1.setSpeed(0.0);
    motor2.setSpeed(0.0);
  }
  public void aredatmotahson()
  {
    double checkmotah1 = motor1.getSpeed();
    if(checkmotah1==0.0)
    {
      startmotah();
    }
    else
    {
      stopmotah();
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
