package com.scarytom.mazo;

import java.awt.Point;

public final class SatNav {

	private final Maze maze;

	public SatNav(Maze maze) {
		this.maze = maze;
	}

	public String direction() {
		return directionOf(maze.me(), maze.goal());
	}

	private String directionOf(Point me, Point goal) {
		if (me.y == goal.y) {
		    return me.x > goal.x ? "W" : "E";
		}
		return (me.y > goal.y) ? "N" : "S";
	}
}
