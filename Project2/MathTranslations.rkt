#lang racket
(define chinese '(ling yi er san si wu liu qi ba jiu shi))
(define english '(zero one two three four five six seven eight nine ten))

(define (member atm lis)
  (cond
    ((null? lis) #f)
    ((eq? atm (car lis)) #t)
    ((member atm (cdr lis)))
     ))

(define (go alist)
  (lambda (x) (member x alist)))
