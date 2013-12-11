(defn convert-to-int [n]
  (. Long parseLong n))

(defn looks-like-an-int? [n]
  (re-find #"^\d+$" n))

(defn reduce-range [end operator]
  (reduce
    operator
    (range
      1
      (+ 1 end)))) ; upper bound of range is exclusive

(defn ask-for-number []
  (do
    (println "Please enter a number: ")
    (read-line)))

(defn ask-for-operator []
  (do
    (println "Would you like to calculate the sum or the product?")
    (read-line)))

(println
  (let [n (ask-for-number)]
    (if
      (not (looks-like-an-int? n))
      "not a positive integer"
      (let [operator (ask-for-operator)
            operatorsMap {"sum" + "product" *'}] ; *' auto promotes type to bigint if necessary
        (if
          (not (operatorsMap operator))
          "not \"sum\" or \"product\""
          (reduce-range
            (convert-to-int n)
            (operatorsMap operator)))))))
