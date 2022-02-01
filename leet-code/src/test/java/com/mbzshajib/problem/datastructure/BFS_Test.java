package com.mbzshajib.problem.datastructure;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

import java.util.stream.Collectors;

/**
 * @author: Zaman Shajib
 * @email: mbshajib@gmail.com
 * @git: https://github.com/mbzshajib
 * @linkedin: https://www.linkedin.com/in/mbzshajib/
 * Created on 2/1/2022 at 11:51 AM.
 */
@Suite
public class BFS_Test {
    @Test
    void testAll() {
        BFS dfs = new BFS();
        dfs.insert(1, 2).insert(1, 4).insert(1, 6);
        dfs.insert(2, 1).insert(2, 4).insert(2, 3);
        dfs.insert(3,2).insert(3, 7);
        dfs.insert(4,1).insert(4,2).insert(4, 5);
        dfs.insert(5,4).insert(5, 6);
        dfs.insert(6,1).insert(6,5);
        dfs.insert(7, 3);
        dfs.insert(8, null);

        System.out.println(dfs.visit(1, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(2, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(3, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(4, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(5, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(6, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(7, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
        System.out.println(dfs.visit(8, 8).stream().map(integer -> integer.toString()).collect(Collectors.joining(" -> ")));
    }
}
