package com.scarytom.mazo;

public final class Maze {

	private final int height;
	private String player;
	private int width;

	public Maze(String maze) {
		String[] rows = maze.split("\n");
		
		player = rows[0].substring(rows[0].lastIndexOf(' ') + 1);
		height = rows.length - 1;
		width = rows[1].length();
	}

	public int height() {
		return height;
	}

	public String player() {
		return player;
	}

	public int width() {
		return width;
	}
}
