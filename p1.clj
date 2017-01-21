; Problem 1 from Project Euler
; Multiples of 3 and 5

(defn modulo [x]
	(if 
		(or 
			(= (mod x 3) 0)
			(= (mod x 5) 0))
		true
		false))

(defn multiples [x]
	(loop [inc 1 sum 0]
		(if (>= inc x)
			sum
			(if
				(modulo inc)
				(recur (+ inc 1) (+ sum inc))
				(recur (+ inc 1) sum)))))