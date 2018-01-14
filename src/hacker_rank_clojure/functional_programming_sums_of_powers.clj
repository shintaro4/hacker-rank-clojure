(ns hacker-rank-clojure.functional-programming-sums-of-powers)


(defn sum-of-powers
  [n v]
  (reduce + (map #(Math/pow % n) v)))

(defn combinations
  [n items]
  (cond
    (= n 0) '(())
    (empty? items) '()
    :else (concat (map
                   #(cons (first items) %)
                   (combinations (dec n) (rest items)))
                  (combinations n (rest items)))))

(defn all-combinations
  [x n]
  (let [v (range 1 (Math/floor (inc (Math/pow x (/ 1 n)))))]
    (mapcat #(combinations % v) v)))

(defn functional-programming-sums-of-powers
  [x n]
  "https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem"
  (->> (all-combinations x n)
       (filter #(= x (int (sum-of-powers n %))))
       (count)))

;; entry point
(let [x (Integer/parseInt (read-line))
      n (Integer/parseInt (read-line))]
  (println (functional-programming-sums-of-powers x n)))
