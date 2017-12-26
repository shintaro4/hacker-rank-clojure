(ns hacker-rank-clojure.string-compression)

(defn string-compression
  "https://www.hackerrank.com/challenges/string-compression/problem"
  [t r i]
  (cond
    (empty? r)
    (if (> i 1) (str t i) t)

    (not= (last t) (first r))
    (if (> i 1)
      (recur (str t i (first r)) (rest r) 1)
      (recur (str t (first r)) (rest r) 1))

    :else (recur t (rest r) (inc i))))

;; entry point
(let [s (read-line)]
  (println (string-compression "" (vec s) 1)))
