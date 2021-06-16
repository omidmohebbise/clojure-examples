 ;;Atoms are a data type in Clojure that provide a way to manage shared, synchronous, independent state.
 ;; An atom is just like any reference type in any other programming language.
 ;; The primary use of an atom is to hold Clojure’s immutable datastructures.
 ;; The value held by an atom is changed with the swap! method.
 (def myatom (atom 1))
(println @myatom)

(println "\n---------------------reset!---------------------\n")
(reset! myatom 5)
(println @myatom)

(println "\n---------------------compare-and-set!---------------------\n")
(reset! myatom 1)

(compare-and-set! myatom 0 3)
(println @myatom)

(compare-and-set! myatom 1 3)
(println @myatom)

(println "\n---------------------swap!---------------------\n")
(reset! myatom 1)
(swap! myatom inc)
(println @myatom)
(swap! myatom dec)
(println @myatom)

