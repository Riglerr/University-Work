﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Graph
{
    class Graph
    {
	

        int[] _List;


        public Graph(){
        
            for (int z = 0 ;z <10; z++){
            
            _List[z] = -1;
            }
        
        
        }


        void insertVertex(int v){
        
        foreach(int i in _List){
            int count =0;
             
                if (i != -1){
                    count += 1 
                continue;}
                    
                else
                    _List[count] = v;

        }
        
        
        };




}
