var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":6459,"methods":[{"el":13,"sc":5,"sl":10},{"el":18,"sc":5,"sl":15},{"el":26,"sc":5,"sl":24},{"el":34,"sc":5,"sl":32},{"el":39,"sc":5,"sl":36}],"name":"ParseError","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_176":{"methods":[{"sl":10},{"sl":15},{"sl":36}],"name":"tracksLimitedErrorsWhenRequested","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":16},{"sl":17},{"sl":38}]},"test_239":{"methods":[{"sl":15}],"name":"testIsValidBodyHtml","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_314":{"methods":[{"sl":10},{"sl":36}],"name":"selfClosingOnNonvoidIsError","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":38}]},"test_436":{"methods":[{"sl":15}],"name":"cp1252EntitiesProduceError","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_805":{"methods":[{"sl":10},{"sl":24}],"name":"dropsDuplicateAttributes","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":25}]},"test_833":{"methods":[{"sl":10},{"sl":15},{"sl":36}],"name":"tracksErrorsWhenRequested","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":16},{"sl":17},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [176, 314, 833, 805], [176, 314, 833, 805], [176, 314, 833, 805], [], [], [176, 833, 239, 436], [176, 833, 239, 436], [176, 833, 239, 436], [], [], [], [], [], [], [805], [805], [], [], [], [], [], [], [], [], [], [], [176, 314, 833], [], [176, 314, 833], [], []]
