(ns clojure.omidmohebbi.hello
   (:gen-class))

;; This program displays Hello World
(defn Example []

;; Variable Definition
;;(def var-name var-value)

   ;; The below code declares a integer variable
   (def x 1)
   
   ;; The below code declares a float variable
   (def y 1.25)
   
   ;; The below code declares a string variable
   (def str1 "Hello")

     ;; The below code declares a boolean variable
   (def status true)

   (println x)
   (println y)
   (println str1)
   (println status))

(Example)