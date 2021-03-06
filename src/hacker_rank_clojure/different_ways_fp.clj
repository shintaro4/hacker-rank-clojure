(ns hacker-rank-clojure.different-ways-fp)


(def N 1000)
(def S (- (/ (* (+ N 1) (+ N 2)) 2) 1))
(def DP (atom (vec (repeat S 1N))))
(def P 100000007N)

(defn different-ways
  []
  "https://www.hackerrank.com/challenges/different-ways-fp/problem"
  (doseq [i (range 2 (inc N))]
    (let [p (- (/ (* i (inc i)) 2) 1)]
      (doseq [j (range 1 i)]
        (let [k (+ p j)
              q (- (/ (* (dec i) i) 2) 1)
              c (+ (nth @DP (+ q (dec j))) (nth @DP (+ q j)))]
          (swap! DP assoc k c))))))

;; entry point
(different-ways)

(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [l (clojure.string/split (read-line) #" ")
          n (Integer/parseInt (first l))
          k (Integer/parseInt (second l))
          p (- (/ (* n (inc n)) 2) 1)
          q (+ p k)
          v (nth @DP q)
          m (rem v P)]
      (println (format "%d" (biginteger m))))
    (recur (inc i) t)))
