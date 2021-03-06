// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Arm extends SubsystemBase {
  PWMSparkMax armMotor = new PWMSparkMax(Constants.Motors.ArmMotors.m_armMotor);


  public Arm() {}

  @Override
  public void periodic() {

  }
public void setArmMotorSpeed(double axis){
  armMotor.set(axis);
}

}
