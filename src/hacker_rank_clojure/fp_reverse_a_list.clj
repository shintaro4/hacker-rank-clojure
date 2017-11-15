(ns hacker-rank-clojure.fp-reverse-a-list)

(defn fp-reverse-a-list
  "https://www.hackerrank.com/challenges/fp-reverse-a-list/problem"
  [lst]
  (rseq (vec lst)))

;; entry point
