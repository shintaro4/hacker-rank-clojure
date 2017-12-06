(ns hacker-rank-clojure.area-under-curves-and-volume-of-revolving-a-curv
  (:require [clojure.string :as str]))


(def n 1000)
(def invert-n (double (/ 1 n)))

(defn area
  [a b x]
  (let [x (/ (Math/ceil (* n x)) n)]
    (reduce + (map #(* %1 (Math/pow x %2)) a b))))

(defn volume
  [a b x]
  (let [r (area a b x)]
    (* Math/PI r r)))

(defn summation
  "https://www.hackerrank.com/challenges/area-under-curves-and-volume-of-revolving-a-curv/problem"
  [f l r a b]
  (/ (reduce + (map #(f a b %) (range l r invert-n))) n))

(defn parse-line
  [l]
  (map #(Integer/parseInt %) (clojure.string/split l #" ")))

;; entry point
