// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Sequences;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.commands.AutonomousDrive;


public class AutonomousSequence extends SequentialCommandGroup {
  /** Creates a new AutonomousSequence. */
  public AutonomousSequence() {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      
    new AutonomousDrive(
      Constants.Timings.AutonomousTimings.m_autonomousTime) 
    
     );
  }
}
