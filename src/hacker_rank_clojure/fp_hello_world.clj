(ns hacker-rank-clojure.fp-hello-world)

(defn fp-hello-world
  "https://www.hackerrank.com/challenges/fp-hello-world/problem"
  []
  "Hello World")

;; entry point
(let [_ (read-line)]
  (println (fp-hello-world)))
