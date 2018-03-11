(ns hacker-rank-clojure.subset-sum)

(defn subset-sum
  "https://www.hackerrank.com/challenges/subset-sum/problem"
  [xs s]
  (loop [i 0
         l (count xs)
         n 0
         c 0]
    (cond
      (>= i l) -1
      (>= (+ n (nth xs i)) s) (inc c)
      :else (recur (inc i) l (+ n (nth xs i)) (inc c)))))

;; entry point
(let [_ (read-line)
      xs (->> (clojure.string/split (read-line) #" ")
              (map #(Integer/parseInt %))
              (sort >))]
  (loop [t (Integer/parseInt (read-line))
         i 0]
    (when (< i t)
      (println (subset-sum xs (Integer/parseInt (read-line))))
      (recur t (inc i)))))
