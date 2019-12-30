package com.yq.leetcode;

import jdk.internal.org.objectweb.asm.Handle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_95 {

    Map<Integer,List<TreeNode>> map = new HashMap<>();

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<TreeNode>();

        //初始化map
        TreeNode one = new TreeNode(1);
        List<TreeNode> list = new ArrayList<>();
        list.add(one);
        map.put(1, list);

        if (map.containsKey(n))
            return map.get(n);
        for (int i = 2;i<=n;i++){
            if (!map.containsKey(i))
                map.put(i,addTrees(map.get(i-1), i) );
        }
        return map.get(n);
    }

    public List<TreeNode> addTrees(List<TreeNode> trees,int n){
        List<TreeNode> curTrees = new ArrayList<>();
        TreeNode root,right,pre,cur,r,l;

        for (int i = 0;i<trees.size();i++){
            root = new TreeNode(n);
            pre = trees.get(i);
            root.left = pre;
            curTrees.add(root);
            for (right = trees.get(i).right;right!=null;right = right.right){
                cur = copyTree(trees.get(i));
                root = new TreeNode(n);
                /*root.left = right;
                pre.right = root;*/
                r = findNode(right.val, cur);
                l = findNode(pre.val,cur );
                root.left = r;
                l.right = root;
                curTrees.add(cur);
                pre = right;
            }
            cur = copyTree(trees.get(i));
            l = findNode(pre.val,cur );
            l.right = new TreeNode(n);
            curTrees.add(cur);

        }
        return curTrees;
    }

    public TreeNode copyTree(TreeNode treeNode){
        TreeNode tree;
        tree = new TreeNode(treeNode.val);
        if (treeNode.right!=null)
            tree.right = copyTree(treeNode.right);
        if (treeNode.left!=null)
            tree.left = copyTree(treeNode.left);
        return tree;
    }
    public TreeNode findNode(int val,TreeNode node){
        if (node.val == val)
            return node;
        if (node.val > val)
            return findNode(val,node.left );
        else
            return findNode(val,node.right );
    }

    @Test
    public void test(){
        for (TreeNode treeNode: generateTrees(4)){
            treeNode.printTree(treeNode);
            System.out.println();
        }

    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public void printTree(TreeNode treeNode){
        System.out.print(treeNode.val + ", ");
        if (treeNode.left!=null)
            printTree(treeNode.left);
        if (treeNode.right!=null)
            printTree(treeNode.right);
    }
}
