package com.scarytom.mazo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.awt.Point;

import org.junit.Test;

public class Acceptance {
	private final String rawMaze = "You are player 1\n***********\n*..1...__.*\n....***...F\n*2........*\n***********";
	private final Maze maze = new Maze(rawMaze);

	@Test
	public void know_the_maze() {
		assertThat(maze.player(), is("1"));
	    assertThat(maze.height(), is(5));
	    assertThat(maze.width(), is(11));
	}
	
	@Test
	public void know_where_you_are() {
		assertThat(maze.me(), is(new Point(3, 1)));
	}

	@Test
	public void know_where_the_goal_is() {
		assertThat(maze.goal(), is(new Point(10, 2)));
	}
}
