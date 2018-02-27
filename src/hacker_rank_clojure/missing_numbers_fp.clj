(ns hacker-rank-clojure.missing-numbers-fp)


(defn missing-numbers-fp
  "https://www.hackerrank.com/challenges/missing-numbers-fp/problem"
  [a b]
  (loop [ta (sort a)
         tb (sort b)
         m #{}]
    (if (empty? tb) m
        (let [x (first tb)
              y (first ta)]
          (if (= x y)
            (recur (rest ta) (rest tb) m)
            (recur ta (rest tb) (conj m x)))))))

;; entry point
(let [_n (read-line)
      a (mapv #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      _m (read-line)
      b (mapv #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      m (missing-numbers-fp a b)
      s (clojure.string/join " " (apply sorted-set m))]
  (println s))
