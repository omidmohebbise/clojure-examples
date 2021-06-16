;;A Vector is a collection of values indexed by contiguous integers. A vector is created by using the vector method in Clojure.
(ns clojure.cljdeveloper.collection.vector
;;    (:require [clojure.set :as set])
   (:gen-class))
(def myvector (vector-of :int 1 2 3 4 5 6))
(println myvector)   

;;nth 
(println "---------------------nth")
(println (nth myvector 2))


;;get
(println "---------------------get")
(println (get myvector 2))

;;conj
(println "---------------------conj")
(println (conj myvector 5))

;;pop
(println "---------------------pop")
(println (pop myvector ))

;;subvec Returns a sub vector from a starting and ending index.
(println "---------------------subvec")
(println (subvec myvector 1 3))