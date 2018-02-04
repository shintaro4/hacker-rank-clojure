(ns hacker-rank-clojure.lists-and-gcd)


(defn string-to-map
  [s]
  (->>
   (clojure.string/split s #" ")
   (map #(Integer/parseInt %))
   (apply hash-map)))

(defn lists-and-gcd
  [m l]
  "https://www.hackerrank.com/challenges/lists-and-gcd/problem"
  (->> l
       (map (fn [[k v]]
              (if (get m k)
                (hash-map k (min (get m k) v)))))
       (filter #(some? %))
       (into {})))

(defn map-to-string
  [m]
  (->> (sort m)
   (map (fn [[k v]] (str k " " v)))
   (clojure.string/join " ")))

;; entry point
(loop [i 1
       q (Integer/parseInt (read-line))
       m (string-to-map (read-line))]
  (if (= i q) (println (map-to-string m))
      (recur (inc i) q
             (lists-and-gcd m (string-to-map (read-line))))))
