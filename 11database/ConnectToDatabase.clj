
(require '[clojure.java.jdbc :as j])

   (def mysql-db {
      :subprotocol "mysql"
      :subname "//127.0.0.1:3306/db"
      :user "user"
      :password "password"})
;;    (println (sql/query mysql-db
;;       ["select table_name from tables"]
;;       :row-fn :table_name))
(println "End")