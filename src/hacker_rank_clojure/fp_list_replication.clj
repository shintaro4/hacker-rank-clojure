(ns hacker-rank-clojure.fp-list-replication)

(defn fp-list-replication
  "https://www.hackerrank.com/challenges/fp-list-replication/problem"
  [num lst]
  (flatten (map #(repeat num %) lst)))

;; entry point
