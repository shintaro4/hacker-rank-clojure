(ns hacker-rank-clojure.string-o-permute)


(defn string-o-permute
  "https://www.hackerrank.com/challenges/string-o-permute/problem"
  [s]
  (clojure.string/join (map #(str (last %) (first %)) (partition 2 s))))

;; entry point
(let [n (Integer/parseInt (read-line))]
  (loop [i 0]
    (when (< i n)
      (println (string-o-permute (read-line)))
      (recur (inc i)))))
