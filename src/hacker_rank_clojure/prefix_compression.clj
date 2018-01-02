(ns hacker-rank-clojure.prefix-compression)


(defn prefix-compression
  "https://www.hackerrank.com/challenges/prefix-compression/problem"
  [x y]
  (loop [i 0
         n (Math/min (count x) (count y))]
    (if (and (< i n) (= (nth x i) (nth y i)))
      (recur (inc i) n)
      (subs x 0 i))))

;; entry point
(let [x (read-line)
      y (read-line)
      p (prefix-compression x y)
      _x (subs x (count p))
      _y (subs y (count p))]
  (println (str (count p) " " p))
  (println (str (count _x) " " _x))
  (println (str (count _y) " " _y)))
