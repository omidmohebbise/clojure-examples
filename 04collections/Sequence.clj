;;Sequences are created with the help of the ‘seq’ command. Following is a simple example of a sequence creation.
(def mySequence(seq [1 2 3]))
(println "\n---------------------Print Sequence---------------------\n")
(println mySequence)

(println "\n---------------------cons---------------------\n")
(println (cons 0 mySequence))

(println "\n---------------------conj---------------------\n")
(println (conj  mySequence 4))

(println "\n---------------------concat---------------------\n")
(println (concat  mySequence (seq [4 5 ] )))

(println "\n---------------------distinct---------------------\n")
(println (distinct   (seq [4 4 5 5 ] )))

(println "\n---------------------reverse---------------------\n")
(println (reverse   (seq [3 4 5 6 ] )))

(println "\n---------------------first---------------------\n")
(println (first   (seq [3 4 5 6 ] )))

(println "\n---------------------last---------------------\n")
(println (last   (seq [3 4 5 6 ] )))


(println "\n---------------------rest---------------------\n")
(println (rest   (seq [3 4 5 6 ] )))

(println "\n---------------------sort---------------------\n")
(println (sort   (seq [8 4 2 1 ] )))

(println "\n---------------------drop---------------------\n")
(println (drop 1 (seq [8 4 2 1 ] )))


(println "\n---------------------take---------------------\n")
(println (take 3 (seq [8 4 2 1 ] )))

(println "\n---------------------take-last---------------------\n")
(println (take-last 3 (seq [8 4 2 1 ] )))


(println "\n---------------------split-at---------------------\n")
(println (split-at 2 (seq [8 4 6 2 1 ] )))