// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ball;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.launchballs;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
 GenericHID controller=new GenericHID(0);
  launchballs launchballs=new launchballs();
  int axis=5;
 
  public RobotContainer() {
    launchballs.setDefaultCommand(new ball(launchballs, () -> controller.getRawAxis(axis)));
    configureBindings();
  }

  private void configureBindings() {



  }

}
