using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tree
{
    class BinTreeNode
    {
        //Variables 
        int key;
        BinTreeNode parent;
        BinTreeNode left;
        BinTreeNode right;

        BinTreeNode(int value) // Constructor
        {
            this.key = value;
            this.left = null;
            this.right = null;
            
        }

        /**
         * In_Order_Walk prints the contents of the tree in sorted order.
         * 
         * @param BinTreeNode $x
         * @return void
          * 
         **/
      void  In_Order_Walk(BinTreeNode x){

            if(x != null){
                In_Order_Walk(x.left);
                Console.Write(x.key);
                In_Order_Walk(x.right);
            }

        }

        /**
         * Post_Order_Walk prints the tree in Post Order:
         *  Which prints the root AFTER the values in its subtrees
         * 
         */

        void Post_Order_walk(BinTreeNode x){
            if (x!=null){
                Post_Order_walk(x.left);
                Post_Order_walk(x.right);
                Console.Write(x.key);
            }

        }
        /**
         * Pre_Order_Walk prints the tree in Pre Order:
         *  which prints the root before the value in its subtrees
         */

        void Pre_Order_walk(BinTreeNode x)
        {
            if (x != null)
            {
                Console.Write(x.key);
                Pre_Order_walk(x.left);
                Pre_Order_walk(x.right);
                
            }

        }

        /**
         *  Tree_Search searches the given tree for a specific integer.
         *  
         *  @param BinTreeNode x 
         *  @param integer k
         *  @return BinTreeNode
         *  
         * **/

        BinTreeNode Tree_Search(BinTreeNode x, int k)
        {
            while(x!=null && k != x.key){
                if (k < x.key)
                    x = x.left;
                else
                    x = x.right;
            }
            return x;
        }

        /**
         * Get_Minimum returns the minimum (leftmost) child of a given node or tree.
         * 
         * @param BinTreeNode x
         * @return BinTreeNode
         */
        BinTreeNode Get_Minimum(BinTreeNode x)
        {
            while (x.left != null)
            {
                x = x.left;
            }
            return x;

        }
        /**
        * Get_Minimum returns the maximum (rightmost) child of a given node or tree.
        * 
        * @param BinTreeNode x
        * @return BinTreeNode
        */
        BinTreeNode Get_Maximum(BinTreeNode x)
        {
            while (x.right != null)
            {
                x = x.right;
            }
            return x;

        }

        /**
        * Get_Next returns the in_order successor to a given node
        * 
        * @param BinTreeNode x
        * @return BinTreeNode
        */
        BinTreeNode Get_Next(BinTreeNode x)
        {
            //If a node has a right child;
            //then the in_order previous node must be the leftmost node of that subtree
            if (x.right != null)
                return Get_Minimum(x.right);

            //If node does not have right child;
            // Traverse up the tree to the first node on the right
            BinTreeNode y = x.parent;
            while (y != null && x == y.right)
            {
                x = y;
                y = y.parent;
            }
            return y;
        }

        /**
        * Get_previous returns the in_order predecessor to a given node
        * 
        * @param BinTreeNode x
        * @return BinTreeNode
        */
        BinTreeNode Get_Previous(BinTreeNode x)
        {
            //If a node has a left child;
            //then the in_order previous node must be the rightmost node of that subtree
            if (x.left != null)
                return Get_Maximum(x.left);

            //if the node does not have a left child;
            // then Traverese up the tree to the first node on the left.
            BinTreeNode y = x.parent;
            while (y != null && x == y.left)
            {
                x = y;
                y = y.parent;
            }
            return y;
        }

        /**
         * # Tree_Insert inserts a new node (z) into the correct position in the tree (t).
         * 
         *  Begin checking at the root of the tree.
         *  x traverses the tree looking for the correct null position.
         *  (x moves left or right depending on the comparison).
         *  y stores the parent of the null position.
         *  set pointers
         *  
         * @param BinTreeNode t
         * @param BinTreeNode z
         * @return void
         */
        void Tree_Insert(BinTreeNode t, BinTreeNode z)
        {
            
            BinTreeNode y = null;
            BinTreeNode x = t;

            while (x != null)
            {
                y = x;
                if (z.key < x.key)
                    x = x.left;
                else
                    x = x.right;
            }

            z.parent = y;
            if (y == null)
                t = z;
            else if (z.key < y.key)
                y.left = z;
            else y.right = z;

        }
    
    }
		
}
