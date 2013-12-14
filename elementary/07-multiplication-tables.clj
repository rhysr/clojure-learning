(defn table-row [x y]
  (println (str x " * " y " = " (* x y))))

(loop [x 1 y 1]
  (table-row x y)
  (if
    (= 12 x)
    (if
      (= 12 y)
      nil
      (recur 1 (inc y)))
    (recur (inc x) y)))
