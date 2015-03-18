// Wave.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <stdlib.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

	/* Functor 'goround':
	*
	* transforms a double in range -1 <= x >= 1
	* to either -1 or 1 depending if abs(x) < 0.5 respectively.
	*
	*/
struct rounder{
	
	int operator() (double x){ if (abs(x) > 0.5) return 1;
								else return -1; }
} goround ;


void dWave(std::vector<double> v){

	//declaring control Variables for the loop.
	double j = 0;
	int y;
	int z;
	
	/* If the element is negative; j will be less that 10
	and the inner loop will iterate 10 times, printing spaces while less than j.

	Iff the element is positive, j will be more than 10,
	the inner loop will iterate j times, printing spaces while less than 10.

	*/


	/* STD::TRANSFORM,
	*
	*	Uses std:transform to transform all elements in :
	*    std::vector<double> v  TO their goround equivalent (either -1 or 1)
	*
	*/
	
	
	std::transform(v.begin(), v.end(), v.begin(), goround);
	for (int i = 0; i < v.size() ; i++){

		j = 10 + (v[i] * 10 );

		if (j > 10) y = j, z = 10;
		
		else y = 10, z = j;

		for (int x = 0; x < y; x++){
			if (x < z)
				std::cout << " ";
			else
				std::cout << "#";
		}
		std::cout << "\n";
		
	}
		
	}


int _tmain(int argc, _TCHAR* argv[])
{
	
	std::vector<double> fvals = { 0.1, 0.2, 0.3, 0.4, 0.5,0.6, 0.7, 0.8, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2, 0.1, -0.1, -0.2, -0.3, -0.4, -0.5, -0.6, -0.7, -0.8, -0.9 };


	dWave(fvals);
	
	//std::cout << "END";
	std::getchar();
	return 0;
}

 
 
 
 
 