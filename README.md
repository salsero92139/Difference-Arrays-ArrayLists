# Difference-Arrays-ArrayLists
This is for a project at school about arrays vs arrayLists

Hi class,

From what I could gather from the book reading material and lecture, the fundamental difference between arrays and arrayLists comes down to the word "dynamic."  In essence, arrayLists are dynamic in nature which means that space allocation of the elements is automatically created and sustained to further additions or modifications of the elements within reasonable limits or bounds. It is as if we are using array elements as needed and length is not necessarily ever defined in an arrayList. On the opposite side, regular arrays are created with initialization in mind or purpose, specially when in comes to the size of the array and contents. Arrays are also immutable, their length cannot be changed, it is fixed. (page 262, Horstmann) You must make a copy to change the size of it but of course the elements can always be changed by identifying the index location. 

The URL to my GitHub repository for the project is this:

https://github.com/salsero92139/Difference-Arrays-ArrayLists.git

Also, another difference I noticed with regards to arrays and arrayLists is that arrayLists tend to have methods instead of expressions. What I mean by that, is the following example: If we want to find out how big an array is, we use array.length. Whereas, if we want to find out the same for an arrayList, we use arrayList.size(), as an example. And the arrayList class has a variety of methods or "wrapper classes" for various operations such as adding, removing or getting. These are a few examples:

arrayList.add("x");
arrayList.get(i);
arrayList.set(i, "x");
arrayList.size();
arrayList.remove(i);
To do the various tasks mentioned above on an array, we must use the index of the array to modify its elements. Another difference that came to mind but I am not quite sure, is that of multi-dimensional, does any one know? I do know that arrays in general can have the double [] or even more dimensions to represent matrixes or multi-dimensions but I could not catch that from arrayLists. Please if anyone can respond to this inquiry, I would appreciate it.

Resources

Horstmann, C. S. (2016). Big Java Late Objects (2nd ed.). Wiley Global Education US. https://bookshelf.vitalsource.com/books/9781119321071
