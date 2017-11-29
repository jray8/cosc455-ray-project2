
def prime (n: Int) : Boolean = {
  if (n % 2 != 0 && n % 3 !=0 && n % 4 !=0 && n % 5 !=0 && n % 6 !=0 && n % 7 != 0 && n % 8 !=0 && n % 9 !=0)
    true
  else
    false
}

def twinprimes (i: Int, j: Int) : Boolean = {
  (prime(i), prime(j)) match {
    case (false, false) => false
    case (true, false) => false
    case (false, true) => false
    case (true, true) => primeHelp(i, j)
  }
}

def primeHelp(i: Int, j: Int) : Boolean = {
  math.abs(i - j) match {
    case 2 => true
    case _ => false
  }
}

def twinprimeslist (n: Int) : List[Int] = {

  if (twinprimes(n, n-1).equals(true)) {
    //put n into return list (couldnt figure out in scala)
    twinprimeslist(n - 1)
  }

  //some sort of reverse list

}








