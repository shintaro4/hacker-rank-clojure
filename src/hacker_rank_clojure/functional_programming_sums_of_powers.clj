(ns hacker-rank-clojure.functional-programming-sums-of-powers)


(defn candidates
  [x n]
  (for [k (range 1 x)
        :let [y (int (Math/pow k n))]
        :while (<= y x)]
    y))

(defn find-ways
  [n xs ys]
  (cond
    (< n 0) []
    (= n 0) [ys]
    :else (mapcat
           (fn [k]
             (find-ways (- n k)
                        (filter #(> % k) xs)
                        (cons k ys)))
           (take-while #(<= % n) xs))))

(defn functional-programming-sums-of-powers
  [x n]
  "https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem"
  (count (find-ways x (candidates x n) [])))

;; entry point
(let [x (Integer/parseInt (read-line))
      n (Integer/parseInt (read-line))]
  (println (functional-programming-sums-of-powers x n)))
