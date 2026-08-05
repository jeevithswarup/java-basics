class Tree_Implementation {
        int data;
        Tree_Implementation left;
        Tree_Implementation right;    

        Tree_Implementation(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
   
    public static void main(String[] args) {

        Tree_Implementation root = new Tree_Implementation(1);

        root.left = new Tree_Implementation(2);
        root.right = new Tree_Implementation(3);

        root.left.left = new Tree_Implementation(4);
        root.left.right = new Tree_Implementation(5);
        System.out.println(root.data);              
System.out.println(root.left.data);         
System.out.println(root.right.data);        
System.out.println(root.left.left.data);    
System.out.println(root.left.right.data);   
    }
}    

