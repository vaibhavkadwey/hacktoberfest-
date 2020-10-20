function isPrime(n) {
  if (isNaN(n) || !Number.isInteger(n)) {
    throw 'Not an integer';
  } else if (n < 2 || n > Number.MAX_SAFE_INTEGER) {
    throw 'Number too big or too small';
  } else if (n === 2 || n === 3) {
    return true;
  } else if (n % 2 === 0 || n % 3 === 0) {
    return false;
  }
  for (let k = 5, w = 2; k * k <= n; k += w, w = 6-w) {
    if (n % k === 0) {
      return false;
    }
  }
  return true;
}
