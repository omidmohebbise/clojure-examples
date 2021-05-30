;;A Map is a collection that maps keys to values. Two different map types are provided - hashed and sorted.
;;HashMaps require keys that correctly support hashCode and equals. 
;;SortedMaps require keys that implement Comparable, or an instance of Comparator.
(ns clojure.cljdeveloper.collection.map
    (:require [clojure.set :as set])
   (:gen-class))

;HashMaps have a typical key value relationship and is created by using hash-map function.
(def myHashedMap (hash-map "z" "1" "b" "2" "q" "3"))
(println myHashedMap)

(def mySortedMap (sorted-map "z" "1" "b" "2" "q" "3"))
(println mySortedMap)


;;get
(println "---------------------get")
(println (get myHashedMap "b"))

;;contains?
(println "---------------------contains?")
(println (contains? myHashedMap "b"))
(println (contains? myHashedMap "f"))

;;find
(println "---------------------find")
(println (find myHashedMap "b"))

;;keys
(println "---------------------keys")
(println (keys myHashedMap ))

;;vals
(println "---------------------vals")
(println (vals myHashedMap ))

;;dissoc => Dissociates a key value entry from the map.
(println "---------------------dissoc")
(println (dissoc myHashedMap "b"))

;;merge => Merges two maps entries into one single map entry.
(println "---------------------merge")
(println (merge-with + myHashedMap (hash-map "f" "5" "nn" "33")))

;;seleceted keys
(println "---------------------select-keys")
(println (select-keys myHashedMap ["b" "z"]))

;;map invert
(println "---------------------map invert")
(println (set/map-invert myHashedMap ))

