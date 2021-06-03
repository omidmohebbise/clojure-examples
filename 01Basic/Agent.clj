;;Agents provide independent, asynchronous change of individual locations.
(def counter (agent 0))
(println counter)
(println @counter)

(println "\n---------------------Send---------------------\n")
(send counter + 100)
(println @counter)
;;Since the send function is an asynchronous function, there is a time delay for when the value of the agent is updated
;; SO in out put it will be printed by 0 value.

(println "\n---------------------shutdown-agent---------------------\n")
;;This function is used to shut down any running agents.
(def myAgent (agent 0))
(send myAgent + 10)
(shutdown-agents)
(println @myAgent)


(println "\n---------------------send-off---------------------\n");;?????????
;;There are instances wherein an agent is assigned a function which is blocking in nature.
(def counter1 (agent 0))
   (println @counter1)
   
   (println (send-off counter1 + 100))
   (println @counter1)
   (println @counter1)
   (shutdown-agents)
(println "\n---------------------await-for---------------------\n") ;;???
;;(println @counter1)Since there is a delay when a value of an agent is updated, Clojure provided a ‘await-for’ function which is used to specify time in milliseconds to wait for the agent to be updated.
(def counter11 (agent 0))
   (println @counter11)
   
   (send-off counter11 + 100)
   (println (await-for 100 counter11))
   (println @counter11)
   
   (shutdown-agents)
