(defn convert-to-int [n]
  (. Long parseLong n))

(defn looks-like-an-int? [n]
  (re-find #"^\d+$" n))

(println "Please enter a number: ")
(println
  (let [n (read-line)]
    (if (not (looks-like-an-int? n))
      "not a positive integer"
      (reduce
        +
        (range
          (convert-to-int n))))))
