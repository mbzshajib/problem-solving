package com.mbzshajib.problem.leet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 5:20 PM.
 */
public class NumberOfIslands_Solution {
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

    public int numIslands(char[][] grid) {
        int result = 0;
        if (grid.length == 0) return result;
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < columnLength; col++) {
                if (grid[row][col] == '1') {
                    markLand(new Coordinate(row, col), grid);
                    result++;
                }
            }
        }

        return result;
    }

    public void markLand(Coordinate coordinate, char[][] grid) {
        Queue<Coordinate> queue = new LinkedList<>();
        grid[coordinate.x][coordinate.y] = '2';
        queue.add(coordinate);
        int[] adjX = new int[]{0, 0, 1, -1};
        int[] adjY = new int[]{1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Coordinate curr = queue.poll();
            for (int i = 0; i < 4; i++) {
                Coordinate adjCoordinate = new Coordinate(curr.x + adjX[i], curr.y + adjY[i]);
                if (adjCoordinate.x < 0 || adjCoordinate.y < 0 || adjCoordinate.x >= grid.length || adjCoordinate.y >= grid[0].length)
                    continue;
                if (grid[adjCoordinate.x][adjCoordinate.y] == '1') {
                    grid[adjCoordinate.x][adjCoordinate.y] = '2';
                    queue.add(adjCoordinate);

                }
            }

        }
    }

}
