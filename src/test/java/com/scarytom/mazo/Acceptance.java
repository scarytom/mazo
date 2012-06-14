package com.scarytom.mazo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Acceptance {

	@Test
	public void test() {
		String rawMaze = "You are player 1\n***********\n*..1...__.*\n....***...F\n*2........*\n***********";
	    Maze maze = new Maze(rawMaze);
	    
	    assertThat(maze.rowCount(), is(5));
	}

}
