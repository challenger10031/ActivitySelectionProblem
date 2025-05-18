package HuffmanCoding;

import java.util.PriorityQueue;

public class Main {


    static void display(HuffmanNode root, String s)
    {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) { 
            System.out.println(root.c + ":" + s); 
            return; 
        } 
        display(root.left, s+"0");
        display(root.right, s+"1");
    }


    public static void main(String[] args) {
        int n = 6; 
	        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
	        int[] charfreq = { 6, 10, 13, 14, 16, 50 }; 
             PriorityQueue<HuffmanNode> Q = new PriorityQueue<HuffmanNode>( 6, new MyComparator()); 
             for(int i=0;i<n;i++)
             {
                HuffmanNode hn=new HuffmanNode();
                hn.c = charArray[i]; 
	            hn.data = charfreq[i]; 
	            hn.left = null; 
	            hn.right = null; 
                Q.add(hn);
             }
             HuffmanNode root = null;
             while (Q.size()>1) {
                HuffmanNode x =Q.peek(); 
	            Q.poll();
                HuffmanNode y =Q.peek(); 
	            Q.poll();
                 HuffmanNode z =new HuffmanNode();
                 z.left=x;
                 z.right=y;
                  root=z;
                  Q.add(z);
             }
             display(root, "");
    }
}
