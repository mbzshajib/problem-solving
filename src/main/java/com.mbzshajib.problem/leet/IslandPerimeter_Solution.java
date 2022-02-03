package com.mbzshajib.problem.leet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 4:00 PM.
 */
public class IslandPerimeter_Solution {
    public class Coordinate {
        private int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "Coordinate{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        if (grid.length == 0) return result;
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int column = 0; column < columnLength; column++) {
                if (grid[row][column] == 1) return findPerimeter(new Coordinate(row, column), grid);
            }
        }
        return result;


    }

    private int findPerimeter(Coordinate coordinate, int[][] grid) {
        int result = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(coordinate);
        grid[coordinate.x][coordinate.y]=-1;
        int[] dirX = new int[]{0, 0, 1, -1};
        int[] dirY = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Coordinate currCoordinate = queue.poll();
            for (int i = 0; i < 4; i++) {
                Coordinate adjCoordinate = new Coordinate(currCoordinate.x + dirX[i], currCoordinate.y + dirY[i]);
                if (adjCoordinate.x < 0 || adjCoordinate.y < 0 || adjCoordinate.x >= grid.length || adjCoordinate.y >= grid[0].length) {
                    result++;
                    continue;
                }
                if (grid[adjCoordinate.x][adjCoordinate.y] == 0) {
                    result++;
                    continue;
                }
                if (grid[adjCoordinate.x][adjCoordinate.y] == 1) {
                    queue.add(adjCoordinate);
                    grid[adjCoordinate.x][adjCoordinate.y] = -1;
                }

            }

        }
        return result;
    }
}
