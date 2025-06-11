Lambda and Stream basics 

*Streams:*

 - Streams brings functional Programming in Java and are supported in JAVA 8
 
 - Stream Pipeline consist of Source followed by ZERO or more intermediate operation with terminal operation.


### Source ----->Filter  ----->Sort  ---->Map  ----->Collect

### Source

 - Streams can be created from Collections , Lists , Sets , ints , longs , doubles , arrays and lines of a file
 
 
 ### Stream operations are either intermediate or terminal
 
 *Intermediate operations :*
 
  - filter, map or sort reaturn a stream so we can chain multiple intermediate operations.
  
  *Terminal operations :*
  
  - forEach, collect or reduce are either void or return a non-stream result.
