package com.scarytom.mazo;

import java.awt.Point;

public final class Maze {

	private final int height;
	private String player;
	private int width;
	
	private String[] content;

	public Maze(String maze) {
		String[] rows = maze.split("\n");
		
		player = rows[0].substring(rows[0].lastIndexOf(' ') + 1);
		height = rows.length - 1;
		width = rows[1].length();
		
		content = new String[height];
		for (int i = 1; i < rows.length; i++) {
			content[i-1] = rows[i];
		}
	}
	
	public String player() {
		return player;
	}

	public int height() {
		return height;
	}

	public int width() {
		return width;
	}

	public Point me() {
		return locationOf(player);
	}

	public Point goal() {
		return locationOf("F");
	}

	private Point locationOf(String item) {
		for (int y = 0; y < content.length; y++) {
			final String row = content[y];
			if (row.contains(item)) {
				return new Point(row.indexOf(item) ,y);
			}
		}
		return null;
	}

}
