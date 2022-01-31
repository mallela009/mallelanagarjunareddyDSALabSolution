package com.greatlearning.dsa;

import java.util.ArrayList;

public class FindLongestPath {
	static class Node{
		int nodeData;
		Node rightNode;
		Node leftnode;
	};

	
	static Node newNode(int data) {
		Node temp = new Node();
		temp.nodeData = data;
		temp.leftnode = null;
		temp.rightNode = null;
		
		return temp;
		
	};
	public static ArrayList<Integer> findLongestPath(Node root){
		// if root is null which means there is no binary tree
		//then return empty lists
		if(root == null) {
			
			ArrayList<Integer>output = new ArrayList<Integer>();
			 
			return output;
		}
		// recursive call on root.right node
		ArrayList<Integer>rightNodeList = findLongestPath(root.rightNode);
		// recursive call on root.left node
		ArrayList<Integer> leftNodeList = findLongestPath(root.leftnode);
		
		
		// comparing the size of two arrayList and accordingly inserting the current node
		
		if(rightNodeList.size() <leftNodeList.size()) {
			leftNodeList.add(root.nodeData);
			
		}else {
			rightNodeList.add(root.nodeData);
		}
		return leftNodeList.size()> rightNodeList.size() ? leftNodeList:rightNodeList;
	
		
		}
	
	public static void main(String args[]){
		
		Node root = newNode(100);
		
		root.leftnode = newNode(20);
		root.rightNode = newNode(130);
		root.leftnode.leftnode = newNode(10);
	
		
		root.leftnode.rightNode = newNode(50);
		root.rightNode.leftnode = newNode(110);
		root.rightNode.rightNode = newNode(140);
		root.leftnode.leftnode.leftnode = newNode(5);
		ArrayList<Integer>logestPath = findLongestPath(root);
	System.out.println(logestPath);
		
		
		
		
		}
	
	
	
	}


