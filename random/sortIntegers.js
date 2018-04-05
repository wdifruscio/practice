//given a set of a bunch of random integers between 1 and 5, sort them so they appear in sorted buckets [1,2,3,4,5,1,2,3,4,5]

const arr = [];
const uniqueVals = [1, 2, 3, 4, 5];
var ans = [];

for (var i = 0; i < 100; i++) {
  arr.push(Math.floor(Math.random() * 5) + 1);
}

arr.sort();

var max = 0;

for (var i = 0; i < uniqueVals.length; i++) {
  var curr = 0;
  for (var j = 0; j < arr.length; j++) {
    if (uniqueVals[i] === arr[j]) curr++;
    if (curr > max) max = curr;
  }
}

for (var i = 0; i < max; i++) {
  ans.push(new Array());
}

var comparator = 1;
var bucketIndex = 0;

while (arr.length > 0) {
  if (arr[0] === comparator) {
    ans[bucketIndex].push(arr.shift());
    bucketIndex++;
  } else {
    comparator++;
    bucketIndex = 0;
  }
}

console.log(ans);
//join them
// ans = [].concat(...ans)
// console.log(ans);
