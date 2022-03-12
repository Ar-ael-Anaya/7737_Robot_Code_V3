// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ClimbingSystem.RaisingMechanism;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class AButtonRaisingDetector extends CommandBase {
  double m_time;
  public AButtonRaisingDetector(double time) {
  m_time = time;
  }

  
  @Override
  public void initialize() {}

  
  @Override
  public void execute() {
  new RightRaisingMechanism(m_time);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
