(defn fib [x]
  (if (= x 0) 0
      (if (= x 1) 1
          (+ (fib (- x 1)) (fib (- x 2))))))

(println (fib 5) (fib 8))
