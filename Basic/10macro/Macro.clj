;; Macros are used to generate inline code. Clojure is no exception and provides simple macro facilities for developers.
;; Macros are used to write code-generation routines, which provide the developer a powerful way to tailor the language to the needs of the developer.

(println "\n---------------------Definition Simple Macro---------------------\n")
(defmacro Simple []
  (println "Hello"))
(macroexpand '(Simple))

(println "\n---------------------Macro with Arguments---------------------\n")
(defmacro Simple [arg]
  (println "Hello" arg))
(macroexpand '(Simple "Omid"))