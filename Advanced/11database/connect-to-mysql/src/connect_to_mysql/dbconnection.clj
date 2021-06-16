  (ns connect-to-mysql.dbconnection)
  
  (def mysql-db {:subprotocol "mysql"
                 :subname "//127.0.0.1:3306/db"
                 :user "user"
                 :password "password"})
  