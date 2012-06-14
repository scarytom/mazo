package com.scarytom.mazo;

public final class Main {
	public static void main(String[] args) {
		System.out.println(new SatNav(new Maze(args[0])).direction());
	}
}
