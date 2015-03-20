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
		List<int> Edges;

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
