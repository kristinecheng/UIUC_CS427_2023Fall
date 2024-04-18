var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":22293,"methods":[{"el":26,"sc":5,"sl":12},{"el":41,"sc":5,"sl":28},{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47}],"name":"QueryParserTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_39":{"methods":[{"sl":28}],"name":"testParsesMultiCorrectly","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":34},{"sl":35},{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_482":{"methods":[{"sl":47}],"name":"testParsesSingleQuoteInContains","pass":true,"statements":[{"sl":48}]},"test_736":{"methods":[{"sl":12}],"name":"testOrGetsCorrectPrecedence","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24}]},"test_95":{"methods":[{"sl":43}],"name":"exceptionOnUncloseAttribute","pass":true,"statements":[{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [736], [], [], [736], [736], [736], [736], [736], [736], [736], [736], [736], [736], [], [], [], [39], [39], [39], [39], [39], [], [39], [39], [], [39], [39], [39], [39], [], [], [95], [95], [], [], [482], [482], [], []]
