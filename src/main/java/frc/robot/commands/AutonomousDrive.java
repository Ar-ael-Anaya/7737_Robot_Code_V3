// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class AutonomousDrive extends CommandBase {
  Timer m_timer = new Timer();
  double m_time;
 
  public AutonomousDrive(double time) {
    m_time = time;
    addRequirements(Robot.m_driveTrain);
  }


  @Override
  public void initialize() {
    m_timer.start();
    Robot.m_driveTrain.setMotorSpeed(Constants.MotorSpeeds.AutonomousValues.m_autonomousXSpeed , Constants.MotorSpeeds.AutonomousValues.m_autonomousYSpeed , Constants.MotorSpeeds.AutonomousValues.m_autonomousZSpeed);
  }

  @Override
  public void execute() {
    Robot.m_driveTrain.setMotorSpeed(Constants.MotorSpeeds.AutonomousValues.m_autonomousXSpeed , Constants.MotorSpeeds.AutonomousValues.m_autonomousYSpeed , Constants.MotorSpeeds.AutonomousValues.m_autonomousZSpeed);
  }


  @Override
  public void end(boolean interrupted) {}

  
  @Override
  public boolean isFinished() {
    if (m_timer.hasElapsed(m_time)){
      Robot.m_driveTrain.setMotorSpeed(0 , 0, 0);
      return true;
    }else{
    return false;
  }
 }
}
