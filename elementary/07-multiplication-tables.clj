(defn table-row [x y]
  (println (str x " * " y " = " (* x y))))

(doseq
  [nums (for [x (range 1 13)
              y (range 1 13)]
          [x y])]
  (table-row
    (first nums)
    (second nums)))
