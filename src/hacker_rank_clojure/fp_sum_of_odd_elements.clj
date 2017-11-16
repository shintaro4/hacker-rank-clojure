(ns hacker-rank-clojure.fp-sum-of-odd-elements)

(defn fp-sum-of-odd-elements
  "https://www.hackerrank.com/challenges/fp-sum-of-odd-elements/problem"
  [lst]
  (reduce + (filter odd? lst)))

;; entry point
