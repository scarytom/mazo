package com.scarytom.mazo;

public final class Maze {

	private final int rowCount;
	private String player;

	public Maze(String maze) {
		String[] rows = maze.split("\n");
		
		player = rows[0].substring(rows[0].lastIndexOf(' ') + 1);
		
		rowCount = rows.length - 1;
	}

	public int rowCount() {
		return rowCount;
	}

	public String player() {
		return player;
	}

}
