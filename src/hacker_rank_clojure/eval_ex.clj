(ns hacker-rank-clojure.eval-ex)


(defn- factorial
  [n]
  (reduce * (range 1 (inc n))))

(defn eval-ex
  "https://www.hackerrank.com/challenges/eval-ex/problem"
  [x]
  (reduce + (map #(/ (Math/pow x %) (factorial %)) (range 10))))

;; entry point
(let [n (Integer/parseInt (read-line))]
 (loop [i n]
  (when (> i 0)
    (let [x (Float/parseFloat (read-line))]
      (println (eval-ex x)))
    (recur (- i 1)))))
