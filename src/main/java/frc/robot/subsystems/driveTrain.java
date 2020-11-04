/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Victor;
import frc.robot.Constants;

public class driveTrain extends SubsystemBase {
  private Victor motorRight;
  private Victor motorLeft;

  /**
   * Creates a new drivetrain.
   */
  public driveTrain() 
  {
    motorRight = new Victor(Constants.driveTrainRight);
    motorLeft = new Victor(Constants.driveTrainLeft);
  }
  public void 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
