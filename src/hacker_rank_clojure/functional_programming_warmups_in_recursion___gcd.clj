(ns hacker-rank-clojure.functional-programming-warmups-in-recursion---gcd)


(defn gcd
  "https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem"
  [a b]
  (cond
    (= a b) a
    (> a b) (gcd (- a b) b)
    :else (gcd a (- b a))))

;; entry point
