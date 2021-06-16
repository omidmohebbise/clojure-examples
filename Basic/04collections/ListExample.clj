;; Simpel definition
(println (list 1 2 3 4))
;;Creates a new list containing the items prepended to the rest
(println (list* 1 [2,3]))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def mylist (list 1 2 3 4 5))

;;first item
(println (first mylist) )
;;nth item
(println (nth mylist 2))
;;cons => Returns a new list wherein an element is added to the beginning of the list.
(println (cons 0 mylist))
;;conj => Returns a new list wherein the list is at the beginning and the elements to be appended are placed at the end.
(println (conj mylist 6 7 8))
;;rest
(println (rest mylist))