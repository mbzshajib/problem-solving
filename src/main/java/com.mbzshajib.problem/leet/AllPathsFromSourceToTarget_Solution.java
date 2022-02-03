package com.mbzshajib.problem.leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/2/2022 at 1:04 PM.
 */
public class AllPathsFromSourceToTarget_Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> rootList = new LinkedList<>();
        rootList.add(0);

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(rootList);

        while (!queue.isEmpty()) {
            List<Integer> currList = queue.poll();
            Integer currentVertex = currList.get(currList.size() - 1);

            if (currentVertex == graph.length - 1) {
                result.add(currList);
                continue;
            }
            for (int i = 0; i < graph[currentVertex].length; i++) {
                List<Integer> newList = new LinkedList<>(currList);
                newList.add(graph[currentVertex][i]);
                queue.add(newList);
            }
        }
        return result;
    }
}
