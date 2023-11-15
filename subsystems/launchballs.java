// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class launchballs extends SubsystemBase {
  static PWMSparkMax duck1 = new PWMSparkMax(0);
  static PWMSparkMax duck2 = new PWMSparkMax(1);
  
  /** Creates a new launchballs. */
  
  public launchballs() {}

  
 public static void setspeed(double speed, double speed2){
  duck1.set(speed);
  duck2.set(speed2);
 }

  public static void stopmotor(){
    duck1.set(0);
    duck2.set(0);

  }
 
}
