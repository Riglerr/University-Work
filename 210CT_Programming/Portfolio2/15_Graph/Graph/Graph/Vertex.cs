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


        Vertex(int v) { key = v; }
    }
}
