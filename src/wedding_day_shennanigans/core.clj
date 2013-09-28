(ns wedding-day-shennanigans.core)


(defn val-of-string 
    "recursively sum the ASCII values of the chars 
     that make up the passed in string and store 
     the value in acc."  
    [st acc] 
    (if 
      (empty? st) acc 
      (recur (rest st) (+ acc (int (first st))))))

(defn -main[]
  "For shits and giggles, the sum of the ASCII values or our initials."
  (println "Sum of ASCII string: " (val-of-string "djcs" 0)))




