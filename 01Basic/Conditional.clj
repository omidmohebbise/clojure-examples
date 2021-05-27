   ;;if cluase---------------------------------------------------

   (if ( = 2 2)
   (println "Values are equal")
   (println "Values are not equal"))

   ;;If/do Expression--------------------------------------------

   (if (= 2 2)
      (do(println "Both the values are equal")
          (println "true"))
      (do
      (println "Both the values are not equal")
         (println "false")))

   ;;Nested If Statement-------------------------------------------

 (if ( and (= 2 2) (= 3 3))
   (println "Values are equal")
   (println "Values are not equal"))
   
   ;;Case Statement-----------------------------------------------
   (def x 11)
   ( case x 5(println "number is 5") 
      10 (println "number is 10")      
   )
 
