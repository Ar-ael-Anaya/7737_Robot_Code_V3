// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ClimbingSystem.LoweringMechanism.RIghtSideLowering;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class AButtonLoweringMechanism extends CommandBase {
  double m_time;
  public AButtonLoweringMechanism(double time) {
 m_time = time;
  }


  @Override
  public void initialize() {}


  @Override
  
  public void execute() {
    Robot.m_robotContainer.lBumper.whileHeld(new RightLoweringMechanism(m_time));
  }


  @Override
  public void end(boolean interrupted) {}


  @Override
  public boolean isFinished() {
    return false;
  }
}
