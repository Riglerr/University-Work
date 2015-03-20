using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Graph
{
    class Graph
    {
		List<Vertex> _list;
			

<<<<<<< HEAD
		bool AddV(int u)
		{
		
			Vertex y = new Vertex (u);
			foreach (Vertex i in _list) {
				if (i.key == y.key)
					return false;
				else
					continue;
			}

			_list.Add (y);
			return true;

		}
=======
        List<int> _list;
           
        bool addVertex(int u)
        {
>>>>>>> 3a145069db63e6e0cd098210dac06ed87e293c9f

    }



}
