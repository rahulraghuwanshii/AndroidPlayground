package com.rahulraghuwanshi.androidplayground.lru_cache

class LRU(capacity: Int = 2) {
    private val cache: LinkedHashMap<Int, String> =
        object : LinkedHashMap<Int, String>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, String>?): Boolean {
                return size > capacity
            }
        }

    fun get(key: Int): String? {
        return cache[key]
    }

    fun put(key: Int, value: String) {
        cache[key] = value
    }

    fun printHashMap() {
        println("HashMap: $cache")
    }
}

//fun main() {
//    val cache = LRU()
//    cache.put(1, "1")
//    cache.put(2, "2")
//    println("Value at index 1: ${cache.get(1)}")  // returns 1
//    cache.put(3, "3")        // evicts key 2
//    println("Value at index 2: ${cache.get(2)}")  // returns null (not found)
//    cache.put(4, "4")        // evicts key 1
//    println("Value at index 1: ${cache.get(1)}")  // returns null (not found)
//    println("Value at index 3: ${cache.get(3)}")  // returns 3
//    println("Value at index 4: ${cache.get(4)}")  // returns 4
//}


class LRUCache<K, V>(private val capacity: Int) {

    private val cache: LinkedHashMap<K, V> = object : LinkedHashMap<K, V>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: Map.Entry<K, V>): Boolean {
            return size > capacity
        }
    }

    fun get(key: K): V? {
        return cache[key]
    }

    fun put(key: K, value: V) {
        cache[key] = value
    }
    fun printHashMap() {
        println("HashMap: $cache")
    }
}

// Usage Example:
fun main() {
    val cache = LRUCache<Int, Int>(2)
    cache.put(1, 1)
    cache.put(2, 2)
    println("Value at index 1: ${cache.get(1)}")  // returns 1
    cache.printHashMap()
    cache.put(3, 3)        // evicts key 2
    cache.printHashMap()
    println("Value at index 2: ${cache.get(2)}")  // returns null (not found)
    cache.printHashMap()
    cache.put(4, 4) // evicts key 1
    cache.printHashMap()
    println("Value at index 1: ${cache.get(1)}")  // returns null (not found)
    cache.printHashMap()
    println("Value at index 3: ${cache.get(3)}")  // returns 3
    cache.printHashMap()
    println("Value at index 4: ${cache.get(4)}")  // returns 4
    cache.printHashMap()
}
