package com.javarush.task.pro.task13.task1335;

/* 
Дорога к выходу
*/

import java.util.List;

public class Solution {

    public static void main(String[] args) {

        printList(clearBoard());

    }

    public static List<Board.Node> clearBoard() {
        Board board = new Board();
        List<Board.Node> boardNodes = board.getBoardNodes();
        for (Board.Node boardNode : boardNodes) {
            if(boardNode.getData().contains("snake")){
                boardNode.setData("board");
            }

        }
        return boardNodes;
    }

    private static void printList(List<?> list) {
        list.forEach(element -> System.out.print(element + " "));
    }
}
