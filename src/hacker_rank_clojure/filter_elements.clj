(ns hacker-rank-clojure.filter-elements)


(defn element-map
  [n v]
  (loop [i 0
         v v
         m {}]
    (if (>= i n)
      m
      (if (nil? (m (first v)))
        (recur (inc i) (rest v) (assoc m (first v) [1 i]))
        (recur (inc i) (rest v) (update m (first v) #(vector (inc (first %)) (second %))))))))

(defn filter-elements
  "https://www.hackerrank.com/challenges/filter-elements/problem"
  [n k v]
  (->> (element-map n v)
       (filter #(>= (first (val %)) k))
       (sort #(< (second (val %1)) (second (val %2))))
       (map #(key %))))

;; entry point
(loop
    [i 0
     t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [l (clojure.string/split (read-line) #" ")
          n (Integer/parseInt (first l))
          k (Integer/parseInt (second l))
          v (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))
          e (filter-elements n k v)]
      (if (empty? e)
        (println "-1")
        (println (clojure.string/join " " e))))
    (recur (inc i) t)))
