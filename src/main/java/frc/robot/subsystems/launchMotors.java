/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class launchMotors extends SubsystemBase {
  /**
   * Creates a new launchMotors.
   */
  private Victor motor1;
  private Victor motor2;
  public launchMotors() 
  {
    motor1 = new Victor(Constants.launchMotor1);
    motor2 = new Victor(Constants.launchMotor2);
  }
  public void startLaunchMotor()
  {
    motor1.setSpeed(Constants.launchMotorSpeed);
    motor2.setSpeed(Constants.launchMotorSpeed);
  }

  public void stopLaunchMotor()
  {
    motor1.setSpeed(0.0);
    motor2.setSpeed(0.0);
  }
  /**
   * Toggles motors on or off based on if they are already spinning
   */
  public void areTheMotorsOn()
  {
    double checkMotor1 = motor1.getSpeed();
    if(checkMotor1==0.0)
    {
      startLaunchMotor();
    }
    else
    {
      stopLaunchMotor();
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
