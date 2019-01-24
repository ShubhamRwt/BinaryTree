package com.company;

public class binarytree {


    node root;
    binarytree(){
        root=null;
    }

    class node {
        node left  ;
        node right ;
        int value;

        node(int value) {
            this.value = value;
            left = null;

            right= null;
        }
    }

    public void insert(int value){
        root=populate(root,value);

    }

    public node populate(node root, int value){
        if(root==null){
                root= new node(value);
                return root;
            }

            if(value<root.value )
                root.left= populate(root.left,value);

            else if(value>root.value )
                root.right=populate(root.right,value);


return root;
        }
        public void print(){
        inorder(root);
        }

        public void inorder(node root){
          if(root!=null) {
              inorder(root.left);
              System.out.println(root.value);

              inorder(root.right);
          }

        }



        }

