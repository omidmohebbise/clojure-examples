(println "\n---------------------even/odd---------------------\n")
(def x (even? 0))
(println x)
(def x (odd? 3))
(println x)
(println "\n---------------------neg/pos---------------------\n")
(def x (neg? 2))
(println x)
(def x (pos? 3))
(println x)
(println "\n---------------------every---------------------\n")
;;Returns true if the predicate is true for every value, else false.
(println (every? even? '(2 4 6)))
(println (every? odd? '(2 4 5)))

(println "\n---------------------every-pred---------------------\n")
;;Takes a set of predicates and returns a function ‘f’ that returns true if all of its composing predicates return a logical true value against all of its arguments, else it returns false.
(println ((every-pred number? even?) 2 4 6))
(println ((every-pred number? odd?) 2 4 6))

(println "\n---------------------some---------------------\n")
;;Takes a set of predicates and returns a function ‘f’ that returns true if all of its composing predicates return a logical true value against all of its arguments, else it returns false.
(println (some  even? '(2 4 6) ))
(println (some  odd? '(2 8 5)))
(println (some  odd? '(2 8 6)))

(println "\n---------------------any---------------------\n")
;;Returns false if any of the predicates of the values in a collection are logically true, else true.
(println (not-any? even? '(1 3 5)))
(println (not-any? even? '(2 4 6)))
(println (not-any? even? '(2 4 5)))

