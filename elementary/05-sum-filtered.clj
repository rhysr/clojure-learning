(defn convert-to-int [n]
  (. Long parseLong n))

(defn looks-like-an-int? [n]
  (re-find #"^\d+$" n))

(defn divisible-by-3-or-5? [n] 
  (or 
    (= 0 (mod n 3)) 
    (= 0 (mod n 5))))

(defn sum-to-zero
  ([can-sum? n]
    (sum-to-zero can-sum? n 0))
  ([can-sum? n sum]
    (if (= n 0)
      sum
      (if (can-sum? n)
        (recur can-sum? (dec n) (+ n sum))
        (recur can-sum? (dec n) sum)))))

(defn sum-one-to-n [can-sum? n]
  (if (not (looks-like-an-int? n))
    (println "not a positive integer")
    (sum-to-zero can-sum? (convert-to-int n))))

(println "Please enter a number: ")
(println (sum-one-to-n divisible-by-3-or-5? (read-line)))
