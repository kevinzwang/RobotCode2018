package org.usfirst.frc.team199.Robot2018.commands;

import org.usfirst.frc.team199.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ToggleIntake extends InstantCommand {

	public ToggleIntake() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		super();
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.intakeEject.toggleIntake();
	}
}
