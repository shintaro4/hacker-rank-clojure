(ns hacker-rank-clojure.common-divisors
  (:require [clojure.set :as cset]))


(defn divisors
  [n]
  (loop [i 2
         s #{1}]
    (cond
      (> i n) s
      (= (rem n i) 0) (recur (inc i) (conj s i))
      :else (recur (inc i) s))))

(defn gcd
  [a b]
  (.gcd (biginteger a) (biginteger b)))

(defn common-divisors
  "https://www.hackerrank.com/challenges/common-divisors/problem"
  [l m]
  (->> (gcd l m)
       (divisors)
       (count)))

;; entry point
(loop [i 0
       t (Integer/parseInt (read-line))]
  (when (< i t)
    (let [v (clojure.string/split (read-line) #" ")
          l (Integer/parseInt (first v))
          m (Integer/parseInt (second v))]
      (println (common-divisors l m)))
    (recur (inc i) t)))
