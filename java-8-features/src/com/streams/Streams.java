package com.streams;

public class Streams {
	/*
	 # An aggregate operation computes a single value from collection of values.
	   Results may be primitive, void or an Object which can be a Person,List, Map
	 # A Stream is a collection of 'data elements' supporting 'Sequential' and 'Parallel' aggregate operations
	 # Stream are not collections. Streams focuses on Aggregate computations on data elements from data source
	 # A Collection is a 'In memory' data structure that stores elements. Where as Streams are not data 
	   structures that does not stores any elements.
	   
	 # A Streams 'pulls elements from data source' on demand and passes them to a pipeline of operations
	   for processing
	 # Streams don't change original data structure, they only provide the result as per the pipelined methods
	 # A stream is a 'sequence of objects' that supports various methods which can be 'pipelined' to produce 
	   the desired results.
	 # Each intermediate operation is lazily executed and returns a stream as result, hence various intermediate
	   operations can be pipelined. Terminal operations mark the end of the stream and return the result.
	   
	 # source -> intermediate operation -> terminal method
	 # A stream 'cannot be reusable' after calling a terminal method on it.
	 # A stream implements can throw an IllegalStateException if it defects a stream is reused.
	 
	 #################### Different operations on Streams ##############
	 
	 # A Stream consists of 'source' followed by zero or more 'intermediate methods' combined together(pipelined)
	   and a 'terminal method' to process the objects obtained from the source as per the methods described.
	   
	   List<Integer> list = Arrays.asList(3,4,8,9,7);
	   list.stream()   -------> get a stream from the list 
	   .filter(number ->number>10)  -------> intermediate operation
	   .limit(3)  ------------> intermediate operation
	   .collect(Collectors.toList())  -----> converts the Stream into a List(Terminal Operation)
	   
	 ################## Intermediate Operations ##############
	 
	 # Intermediate operations such as filter or sorted 'return another stream' as the return type
	 # This allows the operation to be connected to form query.
	 
	 Intermediate operations -> filter, map, limit, distinct 
	 Operation    Type            ReturnType   (Arguments of the Operation)  (Function Descriptor)
	 filter       Intermediate    Stream<T>     Predicate<T>                  T -> boolean
	 map          Intermediate    Stream<T>     Function<T,R>                 T -> R
	 limit 		  Intermediate    Stream<T>
	 distinct	  Intermediate	  Stream<T>
	 
	 ############### Terminal Operations ###############
	 
	 # Terminal operations produces a result from a stream pipeline
	 # A Result can be any non stream values such as List, Integer, void
	 
	 Operation		    Type 		Purpose
	 ForEach            Terminal    Consumes each element from a stream and applies a lambda to each of them.
	                                The Operation return void.
	 count				Terminal	Returns the number of elements in a stream. The Operation return long
	 collect			Terminal    Reduces the stream to create a collect such as a List, a Map or even an integer
	 
	 
	 ############ How to Build Streams ############
	 
	 # There are many ways to create streams. Many Existing classes in java libraries have received new
	   methods that return Streams.
	   
	   * Stream from values
	   * Empty Streams
	   * Stream from functions
	   * Stream from Arrays
	   * Stream from Collections
	   * Stream from Files
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}
