package com.mbzshajib.problem.leet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 3:23 PM.
 */
public class MaxAreaOfIsland_Solution {
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

    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 1)
                    result = Math.max(result, findIslandArea(new Coordinate(row, column), grid));
            }
        }
        return result;
    }

    private int findIslandArea(Coordinate coordinate, int[][] grid) {
        int result = 1;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(coordinate);
        grid[coordinate.getX()][coordinate.getY()] = -1;
        int adjX[] = new int[]{1, -1, 0, 0};
        int adjY[] = new int[]{0, 0, 1, -1};
        while (!queue.isEmpty()) {
            Coordinate currCoordinate = queue.poll();
            for (int i = 0; i < 4; i++) {
                Coordinate adjCoordinate = new Coordinate(currCoordinate.x + adjX[i], currCoordinate.y + adjY[i]);
                if (adjCoordinate.x < 0 || adjCoordinate.x >= grid.length || adjCoordinate.y < 0 || adjCoordinate.y >= grid[0].length)
                    continue;
                if (grid[adjCoordinate.x][adjCoordinate.y] == 1) {
                    queue.add(adjCoordinate);
                    grid[adjCoordinate.x][adjCoordinate.y] = -1;
                    result++;
                }

            }

        }
        return result;
    }
}
