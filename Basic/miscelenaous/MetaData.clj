;;In Clojure, metadata is used to annotate the data in a collection or for the data stored in a symbol.
;;This is normally used to annotate data about types to the underlying compiler, but can also be used for developers.

(def my-map (with-meta [1 2 3] {:prop "values"}))
;;This function is used to see if any metadata is associated with an object.
(println "\n---------------------meta---------------------\n")
(println (meta my-map))

;;Returns an object of the same type and value as the original object, but with a combined metadata.
(println "\n---------------------vary-meta---------------------\n")
(def my-map1 (with-meta [1 2 3] {:prop "values"}))
(println (meta my-map1))
(def new-map (vary-meta my-map1 assoc :newprop "new values"))
(println (meta new-map))