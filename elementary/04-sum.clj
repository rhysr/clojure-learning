(defn convert-to-int [n]
  (. Long parseLong n))

(defn looks-like-an-int? [n]
  (re-find #"^\d+$" n))

(defn sum-to-zero
  ([n]
    (sum-to-zero n 0))
  ([n sum]
    (if (= n 0)
      sum
      (recur (dec n) (+ n sum)))))

(defn sum-one-to-n [n]
  (if (not (looks-like-an-int? n))
    (println "not a positive integer")
    (sum-to-zero (convert-to-int n))))

(println "Please enter a number: ")
(println (sum-one-to-n (read-line)))
