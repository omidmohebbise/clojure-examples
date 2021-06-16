(ns clojure.omidmohebbi.hello
  (:gen-class))

;; This program displays Hello World
(defn Example []

;; Variable Definition
;;(def var-name var-value)

   ;; The below code declares a integer variable
  (def x 1)
  (println x)

   ;; The below code declares a float variable
  (def y 1.25)
  (println y)
   ;; The below code declares a string variable
  (def str1 "Hello")
  (println str1)

   ;; The below code declares a character variable
  (def char \H)
  (println char "ello")

   ;; The below code declares a Ratio variable
  (def ratio 3/2)
  (println (* 2 ratio))

     ;; The below code declares a boolean variable
  (def status true)
  (println status)
  (println #"^[a-z0-9_-]$")
  )

   












(Example)