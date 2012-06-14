package com.scarytom.mazo;

public final class Maze {

	private final int rowCount;

	public Maze(String maze) {
		String[] rows = maze.split("\n");
		rowCount = rows.length - 1;
	}

	public int rowCount() {
		return rowCount;
	}

}
