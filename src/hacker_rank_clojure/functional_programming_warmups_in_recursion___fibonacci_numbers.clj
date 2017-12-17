(ns hacker-rank-clojure.functional-programming-warmups-in-recursion---fibonacci-numbers)


(defn fibonacci
  "https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers/problem"
  [n]
  (cond
    (= n 1) 0
    (= n 2) 1
    :else (+ (fibonacci (- n 2))  (fibonacci (- n 1)))))

;; entry point
(let [n (Integer/parseInt (read-line))]
  (println (fibonacci n)))
