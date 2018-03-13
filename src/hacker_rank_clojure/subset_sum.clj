(ns hacker-rank-clojure.subset-sum)

(defn subset-sum
  "https://www.hackerrank.com/challenges/subset-sum/problem"
  [xs s]
  (loop [i (- (count xs) 1)
         n (long 0)
         c 0]
    (if (< i 0)
      -1
      (let [v (nth xs i)]
        (if (>= (+ n v) s)
          (inc c)
          (recur (dec i) (+ n v) (inc c)))))))

;; entry point
(let [_ (read-line)
      xs (->> (clojure.string/split (read-line) #" ")
              (map #(Long/parseLong %))
              (sort))]
  (loop [t (Integer/parseInt (read-line))
         i 0]
    (when (< i t)
      (println (subset-sum xs (Long/parseLong (read-line))))
      (recur t (inc i)))))
