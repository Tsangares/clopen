package com.clopen;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.Point;

class Clopen{
    public static void main(String args[]) throws IOException{
	
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
	//Find enclosures given a list of walls in arr.
	return enclosurers;
    }

}

