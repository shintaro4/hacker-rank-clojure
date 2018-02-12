(ns hacker-rank-clojure.fibonacci-fp)


(def N (+ 10000 1))
(def DP (atom [0N 1N]))
(def P 100000007N)

(defn fibonacci
  []
  "https://www.hackerrank.com/challenges/fibonacci-fp/problem"
  (loop [i 2]
    (when (< i N)
      (swap! DP conj (+ (nth @DP (- i 1))
                        (nth @DP (- i 2))))
      (recur (inc i)))))

;; entry point
(fibonacci)
(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [n (nth @DP (Integer/parseInt (read-line)))
          m (rem n P)]
      (println (format "%d" (biginteger m))))
    (recur (inc i) t)))
