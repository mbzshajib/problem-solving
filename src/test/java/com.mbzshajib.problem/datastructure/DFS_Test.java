package com.mbzshajib.problem.datastructure;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/1/2022 at 1:36 PM.
 */
public class DFS_Test {
    @Test
    void testAll(){
        DFS bfs = new DFS();
        bfs.insert(1, 2).insert(1, 4).insert(1, 6);
        bfs.insert(2, 1).insert(2, 4).insert(2, 3);
        bfs.insert(3,2).insert(3, 7);
        bfs.insert(4,1).insert(4,2).insert(4, 5);
        bfs.insert(5,4).insert(5, 6);
        bfs.insert(6,1).insert(6,5);
        bfs.insert(7, 3);
        bfs.insert(8, null);
        System.out.println(bfs.visit(1, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(2, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(3, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(4, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(5, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(6, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(7, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(bfs.visit(8, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));

    }
}
