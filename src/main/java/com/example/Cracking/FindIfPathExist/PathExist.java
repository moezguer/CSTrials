package com.example.Cracking.FindIfPathExist;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PathExist {

    public static boolean getPath(int[][] dataMatrix) {

        Cell cellSource = getSourceCell(dataMatrix);
        HashSet<Cell> visited = new HashSet<>();
        return rex(visited, cellSource, dataMatrix);
    }

    public static boolean rex(HashSet<Cell> visited, Cell cell, int[][] dataMatrix) {

        visited.add(cell);

        if (dataMatrix[cell.r][cell.c] == 2) {
            return true;
        }

        List<Cell> adjacentList = getAdjacent(cell, dataMatrix);

        boolean flag = false;

        for (Cell adjacentCell : adjacentList) {
            if (!visited.contains(adjacentCell)) {
                flag = flag || rex(visited, adjacentCell, dataMatrix);
            }
        }

        return flag;
    }


    public static Cell getSourceCell(int[][] dataMatrix) {
        for (int r = 0; r < dataMatrix.length; r++) {
            for (int c = 0; c < dataMatrix[0].length; c++) {
                if (dataMatrix[r][c] == 1) {
                    return new Cell(r, c);
                }
            }
        }

        return null;
    }

    public static List<Cell> getAdjacent(Cell cell, int[][] dataMatrix) {

        List<Cell> cells = new ArrayList<>();

        int[][] movement = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};

        for (int i = 0; i < 4; i++) {
            Cell cellOut = new Cell(cell.r + movement[i][0], cell.c + movement[i][1]);

            if ((cellOut.r < dataMatrix.length && cellOut.r >= 0) &&
                (cellOut.c < dataMatrix[0].length && cellOut.c >= 0)) {
                if (dataMatrix[cellOut.r][cellOut.c] == 3 || dataMatrix[cellOut.r][cellOut.c] == 2) {
                    cells.add(cellOut);
                }
            }
        }
        return cells;
    }


    static class Cell {

        int r;
        int c;

        public Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public int hashCode() {
            return (31*r + c);
        }

        @Override
        public boolean equals(Object obj) {
            Cell cell = (Cell) obj;
            return this.r == cell.r && this.c == cell.c;
        }
    }
}
