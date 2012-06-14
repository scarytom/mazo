package com.scarytom.mazo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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

}
