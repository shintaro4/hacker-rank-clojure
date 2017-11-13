(ns hacker-rank-clojure.fp-filter-positions-in-a-list)

(defn fp-filter-positions-in-a-list
  "https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem"
  [lst]
  (keep-indexed #(if (odd? %1) %2) lst))

;; entry point
