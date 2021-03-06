package com.clopen;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Point;
import java.util.Map;
import java.util.HashMap;

    
class Clopen{
<<<<<<< HEAD
    public static void main(String args[]){
=======
    public static void main(String args[]) {
>>>>>>> e6675fc507c040b1579fd4ff01bbdc856f32601a
	
    }

    // Given a list of edges
    // Return True if list of point arr is connected and forms a loop
    // Return Flase if arr is either disconnected or does not form a loop
    public static boolean isClosed(ArrayList<Edge> arr){
	
	return false;
    }

    // Given a list of edges
    // Return True if the point p is inside the enclosure
    // Return False if the point p is outside the enclosure
    public static boolean isInside(ArrayList<Edge> arr, Point p){
	if (!isClosed(arr)) return false;
	//Test if inside closed
	
	return false;
    }

    // Given a list of points which form edges
    // Return a list of all lists that form enclosurers (pass isClosed)
    public static ArrayList<ArrayList<Edge>> getEnclosures(ArrayList<Edge> arr){
	ArrayList<ArrayList<Edge>> enclosurers = new ArrayList<ArrayList<Edge>>();

	//Build hashmap to go from point -> edge
	Map<Point,ArrayList<Edge>> space = new HashMap<Point,ArrayList<Edge>>();
	for (Edge edge: arr){
	    if (!space.containsKey(edge.alpha)){
		space.put(edge.alpha,new ArrayList<Edge>());
	    }
	    if (!space.containsKey(edge.beta)){
		space.put(edge.beta,new ArrayList<Edge>());
	    }
	    space.get(edge.alpha).add(edge);
	    space.get(edge.beta).add(edge);
	}

	
	//Find enclosures given a list of walls in arr.
	return enclosurers;
    }

    public static boolean follow(Map<Point,ArrayList<Edge>> map, Point from, Point to){
	
    }

}

