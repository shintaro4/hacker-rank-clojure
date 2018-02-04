(ns hacker-rank-clojure.pentagonal-numbers)


(def N 100000)

(defn pentagonal-numbers
  []
  "https://www.hackerrank.com/challenges/pentagonal-numbers/problem"
  (map #)
  (loop [i 1
         dp [1]]
    (if (= i 1000) dp
        (recur (inc i) (conj dp (+ (last dp) (- (* (inc i) 3) 2)))))))

;; entry point
(let [dp (pentagonal-numbers)]
  (loop [i 0
         t (Integer/parseInt (read-line))]
    (when (< i t)
      (println (get dp (dec (Integer/parseInt (read-line)))))
      (recur (inc i) t))))
