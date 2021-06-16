;; concatenation => str
 (println (str "Hello" "World"))
;; format => format
(println (format "Hello , %s" "World"))
;;number of characters
(println (count "Hello"))
;; substr => subs
 (println (subs "HelloWorld" 2 5))
;; compare
(println (compare "Hello" "hello"))
(println (compare "Hello" "Hello"))
;;lowercase
(println (clojure.string/lower-case "Hello World"))
;;upper-case
(println (clojure.string/upper-case "Hello World"))
;;join
(println (clojure.string/join ", " [1 2 3]))
;;Splits
(println (clojure.string/split "Hello, World" #","))
;;split lines
(println (clojure.string/split-lines "Hello\nWorld"))
;;revers
(println (reverse "Hello World"))
;match and replace
(println (clojure.string/replace "The tutorial is about Groovy" #"Groovy"  "Clojure"))
;;Trim
(println (clojure.string/trim " White spaces "))
(println (clojure.string/trimr " White spaces ")) ;;???? does not working





