(println "\n---------------------Destructure a vector---------------------\n")
(def my-vector [1 2 3 4])
(let [[a b c d] my-vector]
  (println a b c d))

(println "\n---------------------Destructure maps---------------------\n")
(def my-map {"a" 1 "b" 2})
(let [{a "a" b "b"} my-map]
  (println a b))

(println "\n---------------------the-rest---------------------\n")
(def my-vector [1 2 3 4])
(let [[a b & the-rest] my-vector]
  (println a b the-rest))