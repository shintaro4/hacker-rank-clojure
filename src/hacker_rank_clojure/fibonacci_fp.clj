(ns hacker-rank-clojure.fibonacci-fp)


(def N (+ 10000 1))
(def DP (make-array Long/TYPE N))
(def P 100000007)

(defn fibonacci
  []
  "https://www.hackerrank.com/challenges/fibonacci-fp/problem"
  (aset DP 1 1)  ; set bottom
  (loop [i 2]
    (when (< i N)
      (aset DP i
            (+ (aget DP (- i 1)) (aget DP (- i 2))))
      (recur (inc i)))))

;; entry point
(fibonacci)
(let [dp (into [] DP)]
  (loop [i 0
         t (Integer/parseInt (read-line))]
    (when (< i t)
      (println (get dp (Integer/parseInt (read-line))))
      (recur (inc i) t))))
