(ns hacker-rank-clojure.functional-programming-sums-of-powers)


(defn combinations
  [n items]
  (cond
    (= n 0) '(())
    (empty? items) '()
    :else (concat (map
                   #(cons (first items) %)
                   (combinations (dec n) (rest items)))
                  (combinations n (rest items)))))

(defn functional-programming-sums-of-powers
  []
  "https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem"
  )

;; entry point
(let [x (Integer/parseInt) (read-line)
      n (Integer/parseInt) (read-line)]
  (println (functional-programming-sums-of-powers x n)))
