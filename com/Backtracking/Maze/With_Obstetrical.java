package com.Backtracking.Maze;

public class With_Obstetrical {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        printPaths("",board,0,0);
    }

    static void printPaths(String p ,boolean[][] maze , int r , int c)
    {
        if(r == maze.length -1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
        if(r < maze.length-1)
        {
            printPaths(p+"D",maze,r+1,c);
        }
        if(c< maze.length-1)
        {
            printPaths(p+"R",maze,r,c+1);
        }
    }
}
