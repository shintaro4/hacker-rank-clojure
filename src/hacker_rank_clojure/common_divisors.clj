(ns hacker-rank-clojure.common-divisors)

(defn divisors
  [n]
  (loop [i 1
         e (int (Math/sqrt n))
         t 0]
    (cond
      (> i e) t
      (not= (rem n i) 0) (recur (inc i) e t)
      :else (if (not= n (* i i))
              (recur (inc i) e (+ t 2))
              (recur (inc i) e (+ t 1))))))

(defn gcd
  [a b]
  (.gcd (biginteger a) (biginteger b)))

(defn common-divisors
  "https://www.hackerrank.com/challenges/common-divisors/problem"
  [l m]
  (divisors (gcd l m)))

;; entry point
(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [v (clojure.string/split (read-line) #" ")
          l (Integer/parseInt (first v))
          m (Integer/parseInt (second v))]
      (println (common-divisors l m)))
    (recur (inc i) t)))
