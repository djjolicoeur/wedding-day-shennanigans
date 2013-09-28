(ns wedding-day-shennanigans.core)


(defn val-of-string 
    [st acc] 
    (if 
      (empty? st) acc 
      (recur (rest st) (+ acc (int (first st))))))

(defn -main[]
  (println (val-of-string "djcs" 0)))




