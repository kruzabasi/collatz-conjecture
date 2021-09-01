(ns core)

(defn colatz-fn
  [n]
  (print (str n " "))
  (if (<= n 1) (print-str "done here")
      (recur (if (even? n) (/ n 2) (+ (* n 3) 1)))))

(colatz-fn 99)
