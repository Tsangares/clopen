package com.clopen;
import java.util.ArrayList;
import java.awt.Point;

class Clopen{
    public static void main(String args[]){
	
    }

    // Given a list of points which form edges
    // Return a list of all lists that form enclosurers (pass isClosed)
    public static ArrayList<ArrayList<Point>> getEnclosures(ArrayList<Point> arr){
	ArrayList<ArrayList<Point>> enclosurers = new ArrayList<ArrayList<Point>>();
	//Find enclosures given a list of walls in arr.
	return enclosurers;
    }

    // Given a list of points which form edges
    // Return True if list of point arr is connected and forms a loop
    // Return Flase if arr is either disconnected or does not form a loop
    public static boolean isClosed(ArrayList<Point> arr){
	return false;
    }

    // Given a list of points which form an enclosure and a point p
    // Return True if the point p is inside the enclosure
    // Return False if the point p is outside the enclosure
    public static boolean isInside(ArrayList<Point> arr, Point p){
	if (!isClosed(arr)) return false;
	//Test if inside closed
	return false;
    }
}

