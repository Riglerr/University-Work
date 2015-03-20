using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Graph
{
    class Vertex
    {
        int key;
<<<<<<< HEAD
		List<int> Edges;
=======
        LinkedList<int> Edges
        
>>>>>>> 3a145069db63e6e0cd098210dac06ed87e293c9f

      public  Vertex(int v)
		{
			key = v; 
		}

		bool addE(int v){
		
			foreach (integer i in Edges) {

				if (i == v)
				{
					return false;
				}

			}
			Edges.Add ((v));
			this.addE (key);
		ss
		}
    }
}
