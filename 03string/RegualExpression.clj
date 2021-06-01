;;There are two special positional characters that are used to denote the beginning and end of a line: caret (∧) and dollar sign ($):
;;The plus sign (+) represents one or more times
;;he asterisk (*) is used to represent zero or more occurrences
;;The question mark (?) denotes zero or once
;;the period symbol (.) can represent any character

(println "\n---------------------re-pattern---------------------\n")
(def pat (re-pattern "\\d+")) ;; Create pattern for numbers
(println pat)

(println "\n---------------------re-find---------------------\n")
(def pat (re-pattern "\\d+")) ;; Create pattern for numbers
(println (re-find pat "324234"))
(println (re-find pat "ab1s23s4s"))

(println "\n---------------------replace---------------------\n")
(def pat (re-pattern "\\d+")) ;; Create pattern for numbers
(println (clojure.string/replace "abc123de123" pat "789"))

(println "\n---------------------replace-first---------------------\n")
(def pat (re-pattern "\\d+")) ;; Create pattern for numbers
(println (clojure.string/replace-first "abc123de123" pat "789"))