(ns hacker-rank-clojure.fp-filter-array)

(defn fp-filter-array
  "https://www.hackerrank.com/challenges/fp-filter-array/problem"
  [delim lst]
  (flatten (filter #(< % delim) lst)))

;; entry point
