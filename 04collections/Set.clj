(ns clojure.cljdeveloper.collection.set
   (:require [clojure.set :as set])
   (:gen-class))

;;sorted-set
 (def myset (sorted-set 3 2 1))
(println myset)
;;-------------------------------------------------------------------------------
;;get
(println "---------------------get")
(println (get myset 1))

;;contains
(println "---------------------contains?")
(println (contains? myset 2))
(println (contains? myset 8))

;; conj Appends an element to the set and returns the new set of elements.
(println "---------------------conj")
(println (conj myset 0))

;; disj Disjoins an element from the set.
(println "---------------------disj")
(println (disj myset 2))

;; set/union Return a set that is the union of the input sets
(println "---------------------set/union")
(println (set/union #{1 2 } #{2 3 4 }))

;;difference => Return a set that is the first set without elements of the remaining sets.
(println "---------------------set/difference")
(println (set/difference #{1 2} #{2 3}))

;; intersection => Return a set that is the intersection of the input sets.
(println "---------------------set/intersection")
(println (set/intersection #{1 2} #{2 3}))

;;subset => Is set1 a subset of set2?
(println "---------------------set/subset")
(println (set/subset? #{1 2 3 4} #{2 3}))
(println (set/subset?  #{2 3} #{1 2 3 4}))

;;superset => Is set1 a superset of set2?
(println (set/superset? #{1 2 3 4} #{2 3}))
(println (set/superset?  #{2 3} #{1 2 3 4}))






