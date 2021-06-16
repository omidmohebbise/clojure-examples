 (println (.exists (clojure.java.io/file "Example.txt"))) ;; not exist
  (println (.exists (clojure.java.io/file "02File/temp/Example.txt"))) ;;exist