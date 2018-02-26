(ns hacker-rank-clojure.huge-gcd-fp)


(def P 1000000007N)

(defn factorization
  [n]
  (loop [i 2
         x n
         p []]
    (cond
      (> i x) p
      (= (rem x i) 0) (recur i (/ x i) (conj p i))
      :else (recur (inc i) x p))))

(defn factors
  [v]
  (->> v
       (map #(factorization %))
       (flatten)
       (sort)
       (vec)))

(defn common-factors
  [af bf]
  (loop [a af
         b bf
         c [1]]
    (if (or (empty? a) (empty? b)) c
        (let [x (first a)
              i (.indexOf b x)]
          (if (not= i -1)
            (recur (rest a)
                   (into [] (concat (subvec b 0 i)
                                    (subvec b (inc i))))
                   (conj c x))
            (recur (rest a) b c))))))

(defn huge-gcd-fp
  "https://www.hackerrank.com/challenges/huge-gcd-fp/problem"
  [a b]
  (let [c (common-factors (factors a) (factors b))]
    (reduce *' c)))

;; entry point
(let [_n (read-line)
      a (map #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      _m (read-line)
      b (map #(Integer/parseInt %)(clojure.string/split (read-line) #" "))
      v (huge-gcd-fp a b)
      m (rem v P)]
  (println (format "%d" (biginteger m))))
