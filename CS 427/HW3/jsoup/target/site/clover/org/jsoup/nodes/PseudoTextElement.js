var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":3661,"methods":[{"el":13,"sc":5,"sl":11},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"PseudoTextElement","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_200":{"methods":[{"sl":11}],"name":"matchTextAttributes","pass":true,"statements":[{"sl":12}]},"test_392":{"methods":[{"sl":11}],"name":"findBetweenSpan","pass":true,"statements":[{"sl":12}]},"test_694":{"methods":[{"sl":11},{"sl":15},{"sl":19}],"name":"splitOnBr","pass":true,"statements":[{"sl":12}]},"test_862":{"methods":[{"sl":11},{"sl":15},{"sl":19}],"name":"matchText","pass":true,"statements":[{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [392, 694, 862, 200], [392, 694, 862, 200], [], [], [694, 862], [], [], [], [694, 862], [], [], []]
