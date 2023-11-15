// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.launchballs;

public class ball extends CommandBase {
  /** Creates a new ball. */
  private Supplier<Double> speed;
  public ball(launchballs launchballs,Supplier<Double> speed) {
    this.speed=speed;
    addRequirements(launchballs);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
      launchballs.setspeed(speed.get(),speed.get());


      }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    launchballs.stopmotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
