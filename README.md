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

Given a bunch of points related to walls, like `[(0,0),(1,0),(1,1),(0,1)]` is the equivalent to a square. Any points on the wall, can be designated as inside. So given the array of points forming a square above, the point `(0,0)` would be inside.
