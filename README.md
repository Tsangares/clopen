# Quickstart

You must be inside the directory `clopen` to run and compilie the code.

    cd clopen

To compile without running test run

    mvn install -DskipTests
	
To compile and run the given tests execute

    mvn install

The main file that needs editing is located at `clopen/src/main/java/com/clopen/Clopen.java`.

# Dependencies

This project uses maven, maven must be installed to use the `mvn` command.

# Context

Given a bunch of edges thinking of walls, like the one in the folling image: ![Box](https://i.postimg.cc/WpYzxM4Y/box.png)

Each edge is currently being defined by an `Edge` object which is just two points. The following box would be defined like so in an unorderd list, 

	Box = [
	 Edge((0,0),(0,1)),
	 Edge((0,1),(0,2)),
	 Edge((0,3),(0,4)),
	 Edge((1,4),(0,4)),
	 Edge((2,4),(1,4)),
	 Edge((3,4),(2,4)),
	 Edge((4,4),(3,4)),
	 Edge((4,4),(4,3)),
	 Edge((4,3),(4,2)),
	 Edge((4,2),(4,1)),
	 Edge((4,1),(4,0)),
	 Edge((3,0),(4,0)),
	 Edge((2,0),(3,0)),
	 Edge((1,0),(2,0)),
	 Edge((0,0),(1,0))
	]
	
Any points on the wall, can be designated as inside. So given the array of points forming a square above, the point `(0,0)` would be inside. Each edge/wall only has a distance of 1, designated by the context of this problem.
