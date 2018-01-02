(ns hacker-rank-clojure.string-reductions)


(defn string-reductions
  "https://www.hackerrank.com/challenges/string-reductions/problem"
  [s]
  (loop [t ""
         s s
         a #{}]
    (if (empty? s)
      t
      (if (nil? (a (first s)))
        (recur (str t (first s)) (rest s) (conj a (first s)))
        (recur t (rest s) a)))))

;; entry point
(let [s (read-line)]
  (println (string-reductions s)))
