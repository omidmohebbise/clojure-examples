;; (def counter (agent 0))
;; (println @counter)

;; (send-off counter + 100)
;; (println (await-for 100 counter))
;; (println @counter)
;; (shutdown-agents)


(println "\n---------------------await---------------------\n")

(def counter8 (agent 0))
   (println @counter8)
   
   (send-off counter8 + 100)
   (await counter8)
   (println @counter8)
   
   (shutdown-agents)