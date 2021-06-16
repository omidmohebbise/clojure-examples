
(println "Simple Function --------------------------------")
(defn firstFucntion []
  (println  "Hello I am simple function"))
;;Call function
(firstFucntion)
(println "Anonymous Functions --------------------------------------------")
(defn AnonymousFunctionExample []
  (println ((fn [x] (* 2 x)) 2)))
(AnonymousFunctionExample)
(println "Variadic Functions --------------------------------------------")
(defn demo
  [message & others]
  (println (str message (clojure.string/join " " others)) )  
  )
(demo "Hello" " Guys" "From" "Other" "Side")
(println "Higher Order Functions --------------------------------------------")
(println (filter even? (range 0 10) ))