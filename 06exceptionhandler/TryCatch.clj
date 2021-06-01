;; (try
;;    (//Protected code)
;;    catch Exception e1)
;; (//Catch block)

  (println "\n---------------------Try Catch Example---------------------\n")
(try
  (def string1 (slurp "Example.txt"))
  (catch Exception e (println (str "caught exception: " (.toString e))))
  (finally (println "This is our final block")))


  ;;multiple catch blocks
(println "\n---------------------Try with multi catch block example---------------------\n")
(try
  (def string1 (slurp "Example.txt"))
  (println string1)
  (catch java.io.FileNotFoundException e (println (str "File not Found00" (.getMessage e))))
  (catch Exception e (println (str "finl cat block" (.getMessage e))))
  (finally (println "I am final block")))


