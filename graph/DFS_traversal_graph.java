/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author Farzana
 */
import java.util.*;
public class DFS_traversal_graph {
    private LinkedList<Integer> adList[];
    private boolean visited[];
    
    DFS_traversal_graph(int vertext){
        adList=new LinkedList[vertext];
        visited=new boolean[vertext];
        for(int i=0;i<vertext;i++){
           adList[i]=new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int src, int des){
        adList[src].add(des);
    }
    public void dfs(int vertex){
        visited[vertex]=true;
        System.out.println(vertex+" visited vertex");
        Iterator<Integer> ite=adList[vertex].iterator();
        while(ite.hasNext()){
            int adj=ite.next();
            if(!visited[adj])
                dfs(adj);
            
        }
    
    }
    
    public static void main(String args[]){
    
        DFS_traversal_graph s_traversal_graph=new DFS_traversal_graph(4);
        s_traversal_graph.addEdge(0,1);       
        s_traversal_graph.addEdge(0,2);
        s_traversal_graph.addEdge(1,2);
        s_traversal_graph.addEdge(2,3);
        
        s_traversal_graph.dfs(0);
    }
    
}
