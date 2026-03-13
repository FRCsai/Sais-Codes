// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Hopper extends SubsystemBase {
  /** Creates a new Hopper. */

  SparkMax m_hopperMotor = new SparkMax(3,MotorType.kBrushless);

  public Hopper() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Hopper Speed", m_hopperMotor.get());
    
  }

  public void setHopperSpeed(double speed){

    m_hopperMotor.set(speed);


  }

  public double getHopperSpeed(){

    return m_hopperMotor.get();

  }


}
