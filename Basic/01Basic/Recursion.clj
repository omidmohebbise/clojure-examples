 (loop [x 10]
   (when (> x 1)
     (print x " ")
     (recur (- x 2))))
(println)

(println (-> "welcome"
    (str " to the world") ;;quick form of partial
    (str " of clojure.")))