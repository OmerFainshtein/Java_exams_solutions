public class Node
{
    private int _number;
    private Node _leftSon, _rightSon;
    // constructor
    public Node(int number) {
        _number = number;
        _leftSon = null;
        _rightSon = null;
    }
    // the get methods
    public int getNumber() {
        return _number;
    }

    public Node getLeftSon() {
        return _leftSon;
    }

    public Node getRightSon() {
        return _rightSon;
    }
    // the set methods
    public void setNumber(int number) {
        _number = number;
    }

    public void setLeftSon(Node node) {
        _leftSon = node;
    }

    public void setRightSon(Node node) {
        _rightSon = node;
    }

    //******************insert methods***********************************
    public static boolean f (Node root, int num)
    {
        if(root==null)
            return false;
        if(root.getNumber()==num)
            return true;
        return f(root.getLeftSon(),num)||f(root.getRightSon(),num);
    }
    
    public static int what (Node root, int x)
    {
        if(f(root,x))
            return secret(root,x);
        return 0;
    }
    
    public static int secret(Node root, int x)
    {
        if(root==null)
            return 0;
        if((root.getLeftSon() != null && (root.getLeftSon()).getNumber() == x) || root.getRightSon() != null && (root.getRightSon()).getNumber()==x)
        {
            return root.getNumber()+secret(root.getLeftSon(),x) + secret(root.getRightSon(),x);
        }
        return secret(root.getLeftSon(),x) + secret(root.getRightSon(),x);
    }

    
    
    

} //end of class Node