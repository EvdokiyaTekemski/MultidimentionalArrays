package com.company;
//80/100
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Pr7Queen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<PointOfQueen> pointOfQueens = new ArrayList<>();
        List<List<String>> matrix = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            matrix.add(new ArrayList<>());
            List<String> line = Arrays.stream(reader.readLine().split("\\s+"))
                    .collect(Collectors.toList());
            for (int j = 0; j < 8; j++) {
                matrix.get(i).add(line.get(j));
                if (matrix.get(i).get(j).equalsIgnoreCase("q")) {
                    pointOfQueens.add(new PointOfQueen(i, j));
                }
            }
        }
        checkQueens(matrix, pointOfQueens);
        pointOfQueens.stream()
                .filter(PointOfQueen::getIsUnique)
                .forEach(e -> System.out.println(e.getX() + " " + e.getY()));
    }

    private static void checkQueens(List<List<String>> matrix, List<PointOfQueen> pointOfQueens) {
        boolean isUnique = true;
        PointOfQueen pointOfQueen;
        for (int i = 0; i < pointOfQueens.size(); i++) {
            pointOfQueen = pointOfQueens.get(i);
            isUnique = checkRow(pointOfQueen, matrix);
            if (!isUnique) continue;
            isUnique = checkColumn(pointOfQueen, matrix);
            if (!isUnique) continue;
            isUnique = checkDiagonalOne(pointOfQueen, matrix);
            if (!isUnique) continue;
            isUnique = checkDiagonalTwo(pointOfQueen, matrix);
        }
    }

    public static boolean checkDiagonalOne(PointOfQueen pointOfQueen, List<List<String>> matrix) {
        int x = pointOfQueen.getX();
        int y = pointOfQueen.getY();
        int startX;
        int startY;
        if (x >= y) {
            startX = x - y;
            startY = 0;
            for (int i = startX; i < matrix.size(); i++) {
                if (x == i & y == startY) {
                    startY++;
                    continue;
                }
                if (matrix.get(i).get(startY).equals("q")) {
                    pointOfQueen.setUnique(false);
                    return false;
                }
                startY++;
            }
        } else {
            startX = 0;
            startY = y - x;
            int value = startY;
            for (int i = startX; i < matrix.get(0).size() - value; i++) {
                if (x == i & y == startY) {
                    startY++;
                    continue;
                }
                if (matrix.get(i).get(startY).equals("q")) {
                    pointOfQueen.setUnique(false);
                    return false;
                }
                startY++;
            }
        }
        return true;
    }

    private static boolean checkDiagonalTwo(PointOfQueen pointOfQueen, List<List<String>> matrix) {
        int x = pointOfQueen.getX();
        int y = pointOfQueen.getY();
        int startX;
        int startY;
        if (matrix.size() > x + y) {
            startX = 0;
            startY = x + y;
            for (int i = startY; i >= 0; i--) {
                if (x == startX & y == i) {
                    startX++;
                    continue;
                }
                if (matrix.get(startX).get(i).equals("q")) {
                    pointOfQueen.setUnique(false);
                    return false;
                }
                startX++;
            }
        } else {
            int xx = x;
            int yy = y;
            for (int i = x + 1; i < matrix.size(); i++) {
                xx++;
                yy--;
                if (matrix.get(xx).get(yy).equals("q")) {
                    pointOfQueen.setUnique(false);
                    return false;
                }
            }
            xx = x;
            yy = y;
            for (int i = y + 1; i < matrix.get(0).size(); i++) {
                xx--;
                yy++;
                if (matrix.get(xx).get(yy).equals("q")) {
                    pointOfQueen.setUnique(false);
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkColumn(PointOfQueen pointOfQueen, List<List<String>> matrix) {
        int x = pointOfQueen.getX();
        int y = pointOfQueen.getY();
        int startJ = 0;
        for (int j = 0; j < matrix.size(); j++) {
            if (j == x) {
                continue;
            }
            if (matrix.get(y).get(j).equals("q")) {
                pointOfQueen.setUnique(false);
                return false;
            }
        }
        return true;
    }

    private static boolean checkRow(PointOfQueen pointOfQueen, List<List<String>> matrix) {
        int x = pointOfQueen.getX();
        int y = pointOfQueen.getY();
        for (int j = 0; j < matrix.get(x).size(); j++) {
            if (j == y) {
                continue;
            }
            if (matrix.get(x).get(j).equals("q")) {
                pointOfQueen.setUnique(false);
                return false;
            }
        }
        return true;
    }
}

class PointOfQueen {
    private int x;
    private int y;
    private boolean isUnique;

    PointOfQueen(int x, int y) {
        this.x = x;
        this.y = y;
        this.isUnique = true;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void setUnique(boolean unique) {
        isUnique = unique;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public boolean getIsUnique() {
        return isUnique;
    }
}