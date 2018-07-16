/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static class Graph{
	    int V;
	    int [][] adjMatrix;
	    
	    Graph(int V){
	        this.V=V;
	        adjMatrix =new int[V][V];
	    }
	    void addEdge(int src, int dest){
	        adjMatrix[src-1][dest-1]=1;
	    }
	    void removeEdge(int src,int dest){
	        adjMatrix[src-1][dest-1]=0;
	    }
	    void print(){
	        for (int i=0;i< V ;i++ ){
	            for (int k=0;k< V ;k++ ){
	                System.out.print(adjMatrix[i][k]);
	            } 
	            System.out.println();
	        } 
	    }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Graph g = new Graph(3);
		
		g.addEdge(1,2);
		g.addEdge(3,3);
		g.removeEdge(1,2);
		g.print();
	}
}
