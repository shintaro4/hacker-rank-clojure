(ns hacker-rank-clojure.string-compression)

(defn string-compression
  "https://www.hackerrank.com/challenges/string-compression/problem"
  [s]
  (clojure.string/replace s #"(\w)\1+" #(str (last %) (count (first %)))))

;; entry point
(let [s (read-line)]
  (println (string-compression s)))
