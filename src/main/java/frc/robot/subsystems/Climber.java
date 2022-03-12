// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {
  /** Creates a new Climber. */
  public Climber() {}
  PWMSparkMax leftClimber = new PWMSparkMax(Constants.Motors.ClimberMotors.m_leftClimber);
  PWMSparkMax rightClimber = new PWMSparkMax(Constants.Motors.ClimberMotors.m_rightClimber);
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setLeftClimberMotorSpeed(double axis){
    leftClimber.set(axis);
  }
  public void setRightClimberMotorSpeed(double axis){
    rightClimber.set(axis);
  }
}
