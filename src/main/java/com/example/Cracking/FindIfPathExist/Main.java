package com.example.Cracking.FindIfPathExist;

import com.example.Cracking.FindIfPathExist.PathExist;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[][] datamatrix = {{3,0, 0, 0},
                                {0, 3, 3, 2,},
                                {0, 1, 0, 3,},
                                {0, 3, 3, 3}};

        System.out.println(PathExist.getPath(datamatrix));

        HashSet<PathExist.Cell> cellHashSet = new HashSet<>();

        PathExist.Cell cell1 = new PathExist.Cell(1, 2);

        cellHashSet.add(cell1);

        PathExist.Cell cell2 = new PathExist.Cell(1, 2);

        System.out.println(cellHashSet.contains(cell2));
        System.out.println(cell1.hashCode() == cell2.hashCode());

    }
}
