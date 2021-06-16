;;StructMaps are used for creating structures in Clojure. For example,
;; if you wanted to create a structure which comprised of an Employee Name and Employeeid, you can do that with StructMaps.


(println "\n---------------------defstruct---------------------\n")
(println (defstruct Employee :EmployeeName :Employeeid))

(println "\n---------------------struct---------------------\n")
(def emp (struct Employee "ali" 1))
(println emp)

(println "\n---------------------struct-map---------------------\n")
(def emp1 (struct-map Employee :EmployeeName "omid" :Employeeid 2))
(println emp1)

(println "\n---------------------Accessing Individual Fields---------------------\n")
(def emp2 (struct-map Employee :EmployeeName "omid" :Employeeid 2))
(println (:Employeeid emp2))
(println (:EmployeeName emp2))

(println "\n---------------------Immutable Nature---------------------\n")
(def emp3 (struct-map Employee :EmployeeName "omid" :Employeeid 2))
 (assoc emp3 :EmployeeName "Naser")
(println emp3)
;; when use this code it create a new employee
(println (assoc emp3 :EmployeeName "Naser"))


(println "\n---------------------Adding a New Key to the Structure---------------------\n")
(def emp5 (struct-map Employee :EmployeeName "ehsan" :Employeeid 5))
(def newemp (assoc emp5 :EmployeeRank "A"))
(println newemp)
