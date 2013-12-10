(println "I'm clojure. What's your name?")
((fn [person]
  (if (#{"Alice" "Bob"} person)
    (println (str "Hi " person ", nice to meet you"))
    (println (str "Hi, nice to meet you"))))
 (read-line))
