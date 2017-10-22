(ns hacker-rank-clojure.fp-solve-me-first)


(defn fp-solve-me-first
  "https://www.hackerrank.com/challenges/fp-solve-me-first"
  [a b]
  (+ a b))

;; entry point
(let [a (Integer/parseInt (read-line))
      b (Integer/parseInt (read-line))]
  (println (fp-solve-me-first a b)))
