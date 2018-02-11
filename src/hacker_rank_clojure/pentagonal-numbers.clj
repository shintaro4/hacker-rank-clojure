(ns hacker-rank-clojure.pentagonal-numbers)


(def N (+ 100000 1))
(def DP (make-array Long/TYPE N))

(defn pentagonal-numbers
  []
  "https://www.hackerrank.com/challenges/pentagonal-numbers/problem"
  (aset DP 1 1)  ; set bottom
  (loop [i 2]
    (when (< i N)
      (aset DP i
            (+ (aget DP (dec i)) (- (* i 3) 2)))
      (recur (inc i)))))

;; entry point
(pentagonal-numbers)
(let [dp (into [] DP)]
  (loop [i 0
         t (Integer/parseInt (read-line))]
    (when (< i t)
      (println (get dp (Integer/parseInt (read-line))))
      (recur (inc i) t))))
