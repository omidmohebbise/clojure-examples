;;Watchers are functions added to variable types such as atoms and reference variables which get invoked when a value of the variable type changes. 

 (def x (atom 0))
   (add-watch x :watcher
      (fn [key atom old-state new-state]
      (println "The value of the atom has been changed")
      (println "old-state" old-state)
      (println "new-state" new-state)))
(println "Watcher set for x Atom")
(reset! x 2)
(println "Remove Watcher..")
(remove-watch x :watcher)
(reset! x 4)
(println "End.")