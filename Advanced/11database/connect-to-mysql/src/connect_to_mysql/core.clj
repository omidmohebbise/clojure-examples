(ns connect-to-mysql.core
  (:require [clojure.java.jdbc :as sql])
  (:require [connect-to-mysql.dbconnection :as conn]))

(defn -main [& args]
  (println "Welcome to my project! These are your args:" args)

(sql/with-connection (conn/mysql-db)
                      (sql/insert-values :table_name
                      [:id, :name]
                      [2001,"ali"]))

  (println (sql/query conn/mysql-db
                      "select * from table_name")))






