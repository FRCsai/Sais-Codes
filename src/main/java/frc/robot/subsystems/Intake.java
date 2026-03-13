// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Intake extends SubsystemBase {
  /** Creates a new Hopper. */

  SparkMax m_armMotor = new SparkMax(0,MotorType.kBrushless);
  SparkMax m_intakeMotor = new SparkMax(0,MotorType.kBrushless);

  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Arm Speed", m_armMotor.get());
    SmartDashboard.putNumber("Intake Speed", m_intakeMotor.get());

  }

  public void setArmSpeed(double speed){

    m_armMotor.set(speed);

  }

  public double getArmSpeed(){

    return m_armMotor.get();

  }

  public void setIntakeSpeed(double speed){

    m_intakeMotor.set(speed);

  }

  public double getIntakeSpeed(){

    return m_intakeMotor.get();

  }


}
