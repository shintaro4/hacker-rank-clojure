(ns hacker-rank-clojure.missing-numbers-fp)


(defn missing-numbers-fp
  "https://www.hackerrank.com/challenges/missing-numbers-fp/problem"
  [a b]
  (loop [ta (vec a)
         tb (vec b)
         m #{}]
    (if (empty? tb) m
        (let [x (first tb)
              i (.indexOf ta x)]
          (if (= i -1)
            (recur ta (rest tb) (conj m x))
            (recur (into [] (concat (subvec ta 0 i)
                                    (subvec ta (inc i))))
                   (rest tb)
                   m))))))

;; entry point
(let [_n (read-line)
      a (map #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      _m (read-line)
      b (map #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      m (missing-numbers-fp a b)
      s (clojure.string/join " " (apply sorted-set m))]
  (println s))
