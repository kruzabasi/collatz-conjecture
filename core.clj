(ns core)

(defn colatz-fn
  [n]
  (print (str n " "))
  (if (<= n 1) (print-str "done here")
      (recur (if (even? n) (/ n 2) (+ (* n 3) 1)))))

(colatz-fn 99)
; returns => 99 298 149 448 224 112 56 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 => "done here"

(defn collatz-con [n]
  (let [next-pos    (/ (last n) 2)
        next-neg    (+ (* (last n) 3) 1)]
    (if (<= (last n) 1) n
        (recur (cond (even? (last n)) (conj n next-pos)
                     :else (conj n next-neg))))))

(collatz-con [369])
; returns => [369 1108 554 277 832 416 208 104 52 26 13 40 20 10 5 16 8 4 2 1]

