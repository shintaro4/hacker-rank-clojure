(ns hacker-rank-clojure.rotate-string)


(defn rotate-string
  [c]
  "https://www.hackerrank.com/challenges/rotate-string/problem"
  (loop [i 0
         t (count c)
         v []]
    (cond
      (= i t) v
      :else (let [r (concat (subvec c (inc i)) (subvec c 0 (inc i)))
                  s (clojure.string/join "" r)]
              (recur (inc i) t (conj v s))))))

;; entry point
(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [c (vec (read-line))
          v (rotate-string c)
          o (clojure.string/join " " v)]
      (println o))
    (recur (inc i) t)))
