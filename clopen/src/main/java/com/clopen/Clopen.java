package com.clopen;
import java.util.Arrays
import java.util.ArrayList;
import java.awt.Point;
import javafx.util.Pair;

class Clopen{
    public static void main(String args[]){
	
    }

    // Given a list of edges
    // Return True if list of point arr is connected and forms a loop
    // Return Flase if arr is either disconnected or does not form a loop
    public static boolean isClosed(ArrayList<Pair<Point,Point>> arr){
	return false;
    }

    // Given a list of edges
    // Return True if the point p is inside the enclosure
    // Return False if the point p is outside the enclosure
    public static boolean isInside(ArrayList<Pair<Point,Point>> arr, Point p){
	if (!isClosed(arr)) return false;
	//Test if inside closed
	return false;
    }

    // Given a list of points which form edges
    // Return a list of all lists that form enclosurers (pass isClosed)
    public static ArrayList<ArrayList<Point>> getEnclosures(ArrayList<Pair<Point,Point>> arr){
	ArrayList<ArrayList<Point>> enclosurers = new ArrayList<ArrayList<Point>>();
	//Find enclosures given a list of walls in arr.
	return enclosurers;
    }

}

