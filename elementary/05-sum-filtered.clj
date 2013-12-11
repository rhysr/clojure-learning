(defn convert-to-int [n]
  (. Long parseLong n))

(defn looks-like-an-int? [n]
  (re-find #"^\d+$" n))

(defn divisible-by-3-or-5? [n]
  (or
    (= 0 (mod n 3))
    (= 0 (mod n 5))))


(println "Please enter a number: ")
(println
  (let [n (read-line)]
    (if (not (looks-like-an-int? n))
      "not a positive integer"
      (reduce
        +
        (filter
          divisible-by-3-or-5?
          (range
            1
            (+ 1 (convert-to-int n)))))))) ;range upper bound is exclusive
