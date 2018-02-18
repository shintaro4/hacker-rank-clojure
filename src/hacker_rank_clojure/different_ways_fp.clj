(ns hacker-rank-clojure.different-ways-fp)


(def N (+ 10000 1))
(def DP (atom [1N 1N]))
(def P 100000007N)

(defn different-ways
  []
  "https://www.hackerrank.com/challenges/different-ways-fp/problem"
  (doseq [i (range 2 N)]
    (let [p (- (/ (* i (inc i)) 2) 1)]
      (doseq [j (range (inc i))]
        (let [k (+ p j)
              q (- (/ (* (dec i) i) 2) 1)
              c (if (or (= j 0) (= j i)) 1N
                    (+ (nth @DP (+ q (dec j))) (nth @DP (+ q j))))]
          (swap! DP assoc k c))))))

;; entry point
(different-ways)
(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [l (clojure.string/split (read-line) #" ")
          n (Integer/parseInt (first l))
          k (Integer/parseInt (second l))
          c (nth @DP n)
          v (nth c k)
          m (rem v P)]
      (println (format "%d" (biginteger m))))
    (recur (inc i) t)))
