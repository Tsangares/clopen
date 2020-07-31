# Quickstart

To compile without running test run

    mvn install -DskipTests
	
To compile and run the given tests execute

    mvn install

The main file that needs editing is located at `clopen/src/main/java/com/clopen/Clopen.java`.

# How to help

Write your code in `clopen/src/main/java/com/clopen/Clopen.java`, filling in the function `getEnclosures`. To compile and test your own syntax errors or general bugs run 

    mvn install -DskipTests
	
Once you feel your algorithm is adequite, run the command

    mvn install
	
To run your code against the designed tests to show if the algorithm is correct.

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

# Verbose Description

Given a grid where walls exist on edges, be able to find the "houses" or *enclosures*. There are four kinds of *corners* ignoring rotation.

 - A corner with two edges that connect in a parralel with sharing where each edge shares one point.
 - A corner with two edges that connect in a right angle, changing direction from veritcal to horizontal or horizontal to vertical. The edges share one common point.
 - A corner with three edges where two align paralel and one bisects the paralel line. These three edges share one point.
 - A corner with four edges that form a cross shape. All four edges share one common point.
 
The main content to be fufilled in the function `getEnclosures` in the file `Clopen.java`. Part of this challenge is beging able to identify continuous edges that form a circuit. The edges need to use a combination of corners in order to wrap around and close.
 
The function `isClosed` is just a helper function used the undefined function `getEnclosures`.

