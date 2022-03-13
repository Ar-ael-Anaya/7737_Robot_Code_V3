// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.ClimbingSystem.RaisingMechanism.RightSideRaising;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class RightRaisingMechanism extends CommandBase {
  Timer m_timer = new Timer();
  double m_time;
 
  
  
  public RightRaisingMechanism(double time) {
    m_time = time;
   addRequirements(Robot.m_climber);
  }

  @Override
  public void initialize() {
    m_timer.start();
  }

  @Override
  public void execute() {
    double leftTrigger = (Robot.m_robotContainer.GetDriverRawAxis(Constants.Controller.Joystick.m_leftTrigger)) * (Constants.m_limiter);
    
    Robot.m_climber.setRightClimberMotorSpeed(leftTrigger);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (m_timer.hasElapsed(m_time)){
      Robot.m_climber.setRightClimberMotorSpeed(0);
      return true;
    }
    return false;
  }
 
}

