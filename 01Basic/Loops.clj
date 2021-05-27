
(println "While Statement--------------------------------------------------")
(def x (atom 1))
   (while ( < @x 5 )
      (do
         (print  @x " " )
         (swap! x inc)))
(println "")
(println "Doseq Statement---------------------------------------------------")
 (doseq [n [0 1 2]]
   (print n " "))
(println)

(println "Dotimes Statement---------------------------------------------------")
(dotimes [n 5]
(print n " "))
(println)

(println "Loop Statement---------------------------------------------------")
 (loop [x 10]
      (when (> x 1)
         (print x " ")
         (recur (- x 2))
         )) 
(println)