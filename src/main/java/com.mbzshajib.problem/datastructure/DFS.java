package com.mbzshajib.problem.datastructure;

import java.util.*;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/1/2022 at 1:36 PM.
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
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        boolean visited[] = new boolean[totalNodes];

        List<Integer> result = new LinkedList<>();

        while (!stack.isEmpty()) {
            Integer currNode = stack.pop();
            if (!visited[currNode - 1]) {
                result.add(currNode);
                visited[currNode - 1] = true;
            }
            List<Integer> currAdjacentNodes = adjacentListMapping.get(currNode);
            for (int i = 0; i < currAdjacentNodes.size(); i++) {
                Integer curNode = currAdjacentNodes.get(i);
                if (!visited[curNode-1]) stack.push(curNode);
            }
        }
        return result;
    }


}
