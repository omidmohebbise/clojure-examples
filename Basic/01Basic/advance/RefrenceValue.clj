;;Reference values are another way Clojure can work with the demand to have mutable variables.
;;Clojure provides mutable data types such as atoms, agents, and reference types.

(println "\n---------------------Refrence Value Definition---------------------\n")

(def my-ref (ref 1 :validator pos?))
(println @my-ref)

(try
  (def my-ref1 (ref -1 :validator pos?))
  (println @my-ref1)
  (catch Exception e (println (str "Error: " (.toString e)))))

(println "\n---------------------ref-set---------------------\n")
(def my-ref3 (ref 1 :validator pos?))
(println @my-ref3)
(dosync
 (ref-set my-ref3 2))
(println @my-ref3)

(println "\n---------------------alter---------------------\n")
;;This function is used to alter the value of a reference type but in a safe manner.
;;This is run in a thread, which cannot be accessed by another process. 
;;This is why the command needs to be associated with a ‘dosync’ method always.
;; Secondly, to change the value of a reference type, a function needs to be called to make the necessary change to the value.
(def names (ref []))

(defn change [newname]
  (dosync
   (alter names conj newname)))
(change "John")
(change "Mark")
(println @names)

(println "\n---------------------Commute---------------------\n")
   ;;Commute is also used to change the value of a reference type just like alter and ref-set.
   ;;The only difference is that this also needs to be placed inside a ‘dosync’ block.
   ;;However, this can be used whenever there is no need to know which calling process actually changed the value of the reference type.
   ;;Commute also uses a function to change the value of the reference variable.
(def counter (ref 0))
(defn change [counter]
  (dosync
   (commute counter inc)))
(change counter)
(println @counter)

(change counter)
(println @counter)