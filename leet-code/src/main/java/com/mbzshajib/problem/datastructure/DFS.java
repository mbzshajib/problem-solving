package com.mbzshajib.problem.datastructure;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/1/2022 at 11:51 AM.
 */
public class DFS {
    private Map<Integer, List<Integer>> adjacentListMapping;

    public DFS() {
        adjacentListMapping = new HashMap<>();
    }

    public DFS insert(Integer fromNode, Integer toNode) {
        List<Integer> listOfAdjucentNodes = adjacentListMapping.getOrDefault(fromNode, new LinkedList<>());
        adjacentListMapping.put(fromNode, listOfAdjucentNodes);
        if (toNode != null) listOfAdjucentNodes.add(toNode);
        return this;
    }

    public List<Integer> visit(Integer node, int totalNodes) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        boolean visited[] = new boolean[adjacentListMapping.size()];
        visited[node-1] = true;
        List<Integer> resultList = new LinkedList<>();

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            resultList.add(currentNode);
            List<Integer> currAdjacentList = adjacentListMapping.get(currentNode);
            for (int i = 0; i < currAdjacentList.size(); i++) {
                Integer nodeToAddInQueue = currAdjacentList.get(i);
                if (!visited[nodeToAddInQueue-1]) {
                    queue.add(nodeToAddInQueue);
                    visited[nodeToAddInQueue-1] = true;
                }
            }
        }
        return resultList;
    }


}
