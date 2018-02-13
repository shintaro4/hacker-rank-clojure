(ns hacker-rank-clojure.different-ways-fp)

(def N (+ 10000 1))
(def DP (atom [[][1N 1N]]))
(def P 100000007N)

(defn different-ways
  []
  "https://www.hackerrank.com/challenges/different-ways-fp/problem"
  (doseq [i (range 2 N)]
    (let [p (last @DP)
          c (into [] (map #(if (or (= % 0) (= % i)) 1N
                               (+ (nth p (dec %)) (nth p %)))
                          (range (inc i))))]
      (swap! DP conj c))))

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
