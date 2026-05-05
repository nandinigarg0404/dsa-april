class Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data=data;
        left=right=null;
    }

}
class tree{
    public static void print(Tree root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
    /*void sum(Tree root){
        int sum=0;
        if(root==null){
            return;
        }
        sum+=root.data;

    }*/
    public static void main(String[] args) {
        Tree root=new Tree(10);
        root.left=new Tree(20);
        root.left.left=new Tree(30);
        root.left.right=new Tree(40);
        root.right=new Tree(50);
        print(root);
    }
}