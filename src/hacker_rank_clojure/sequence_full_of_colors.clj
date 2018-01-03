(ns hacker-rank-clojure.sequence-full-of-colors)


(defn sequence-full-of-colors
  "https://www.hackerrank.com/challenges/sequence-full-of-colors/problem"
  [s]
  (loop [i 0
         m {\R 0 \G 0 \Y 0 \B 0}]
    (if (>= i (count s))
      (if (and (= (m \R) (m \G)) (= (m \Y) (m \B))) "True" "False")
      (cond
        (and (= \R (nth s i)) (> (m \R) (m \G))) "False"
        (and (= \G (nth s i)) (> (m \G) (m \R))) "False"
        (and (= \Y (nth s i)) (> (m \Y) (m \B))) "False"
        (and (= \B (nth s i)) (> (m \B) (m \Y))) "False"
        :else (recur (inc i) (update m (nth s i) inc))))))

;; entry point
(loop
    [i 0
     t (Integer/parseInt (read-line))]
  (when (< i t)
    (println (sequence-full-of-colors (read-line)))
    (recur (inc i) t)))
