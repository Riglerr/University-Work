cache_example: cache_example.c cache_reader.o
	gcc -std=c99 -g -o cache_example cache_example.c cache_reader.o
cache_reader.o: cache_reader.c
	gcc -std=c99 -g -c cache_reader.c
clean:
	rm *.o cache_example
