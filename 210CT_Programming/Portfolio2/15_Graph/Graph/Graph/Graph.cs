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

    }



}
