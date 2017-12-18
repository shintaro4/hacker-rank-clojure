(ns hacker-rank-clojure.string-mingling)


(defn string-mingling
  "https://www.hackerrank.com/challenges/string-mingling/problem"
  [p q]
  (clojure.string/join (map #(str %1 %2) (vec p) (vec q))))

;; entry point
(let [p (read-line)
      q (read-line)]
  (println (string-mingling p q)))
