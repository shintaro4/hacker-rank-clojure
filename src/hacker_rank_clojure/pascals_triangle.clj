(ns hacker-rank-clojure.pascals-triangle)


(defn factorial
  [n]
  (cond
    (= n 0) 1
    (= n 1) 1
    :else (* n (factorial (dec n)))))

(defn c
  "https://www.hackerrank.com/challenges/pascals-triangle/problem"
  [n k]
  (/ (factorial n) (* (factorial k) (factorial (- n k)))))


;; entry point
(let [n (Integer/parseInt (read-line))]
  (loop [i 1]
    (when (<= i n)
      (loop [k 1]
        (when (<= k i)
          (print (c (dec i) (dec k)))
          (print " ")
          (recur (inc k))))
      (println)
      (recur (inc i)))))
