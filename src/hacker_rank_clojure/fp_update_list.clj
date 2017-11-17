(ns hacker-rank-clojure.fp-update-list)

(defn fp-update-list
  "https://www.hackerrank.com/challenges/fp-update-list/problem"
  [lst]
  (map #(if (neg? %) (-' %) %) lst))

;; entry point
