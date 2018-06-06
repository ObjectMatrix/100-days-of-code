# LRU Cache 

## Data Structure:
We use two dats structures to implement an LRU Cache. 

* A doubly-linked list:  

```
Each node is a page.
The most recently used page will be Head node and least recently used page will be tail node
```

* Hash Map   

```
A Hash Map with page number as key and address of the corresponding page (list) node as value.
```
Algorithm:

![LRU Flowchart](../../images/LRU.png)

### Complexity 

  * Time Complexity O(1)  
  * Space Complexity O(n)  


### API:

lru(limit)
Initialize LRU cache with default limit being 10 items  

* get(key)  
Retrieve a single entry from the cache  

* set(key, value)  
Change or add a new value in the cache
We overwrite the entry if it already exists  

* remove(key)  
Remove a single entry from the cache  

* removeAll()  
Resets the entire cache  
Argument limit is optional to be reset  

* forEach(function(){})  
  * Traverse through the cache elements using a callback function  
  * Returns args [node element, element number, cache instance] for the callback function to use
  * toJSON()  
    * Returns a JSON representation of the cache
  * toString()  
    * Returns a String representation of the cache
  





