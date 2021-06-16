;;Since the Clojure framework is derived from Java classes, one can use the date-time classes available in Java in Clojure. The class date represents a specific instant in time, with millisecond precision.
(println "\n---------------------current date---------------------\n")
(def date (.toString (java.util.Date.)))
(println date)

(println "\n---------------------SimpleDateFormat---------------------\n")
(println (.format (java.text.SimpleDateFormat. "MM/dd/yyyy") (new java.util.Date)))
(println(.format (java.text.SimpleDateFormat. "yyyy-MM-dd/") (new java.util.Date)))

(println "\n---------------------getTime---------------------\n")
(println (.getTime (java.util.Date.)))