package com.practice;

public class ReverseList {

    public static void main(String[] args) {

    }
    public void reverseNode(HeadNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        HeadNode cur = head.next;
        HeadNode next = null;
        HeadNode reverseHead = new HeadNode(0, "", "");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head = reverseHead.next;

    }
}

class HeadNode {
    public int id;
    public String name;
    public String nickname;
    public HeadNode next;

    public HeadNode(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeadNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", next=" + next +
                '}';
    }
}