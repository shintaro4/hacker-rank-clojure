(ns hacker-rank-clojure.functions-or-not
  (:require [clojure.string :as str]))


(defn functions-or-not
  "https://www.hackerrank.com/challenges/functions-or-not/problem"
  [ps]
  (let [s (count (set ps))
        m (count (into {} (set ps)))]
    (if (= s m) "YES" "NO")))

;; entry point
(let [t (Integer/parseInt (read-line))]
  (loop [i t]
    (when (> i 0)
      (let [n (Integer/parseInt (read-line))
            ps (into [] (repeatedly n #(clojure.string/split (read-line) #" ")))]
        (println (functions-or-not ps)))
      (recur (- i 1)))))
