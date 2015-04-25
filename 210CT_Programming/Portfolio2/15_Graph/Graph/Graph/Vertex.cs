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

		int[10] Edges;
        int count =0;

        public Vertex(int x) {

            this.key = x;
            for (int z = 0 ;z <10; z++){
            
            Edges[z] = -1;
            }
        
        
        }

        void insertEdge(int v){
        int count =0;
            foreach(int i in Edges){
                count += 1;
                if (i != -1)
                    continue;
                else
                    Edges[count] = v;
                    
            }

            }
            
        
        };

}
