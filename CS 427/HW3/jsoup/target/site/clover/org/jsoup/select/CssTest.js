var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":221,"id":21889,"methods":[{"el":45,"sc":2,"sl":17},{"el":50,"sc":2,"sl":47},{"el":56,"sc":2,"sl":52},{"el":62,"sc":2,"sl":58},{"el":69,"sc":2,"sl":64},{"el":76,"sc":5,"sl":71},{"el":83,"sc":2,"sl":78},{"el":90,"sc":2,"sl":85},{"el":97,"sc":2,"sl":92},{"el":111,"sc":2,"sl":99},{"el":125,"sc":2,"sl":113},{"el":141,"sc":2,"sl":128},{"el":156,"sc":2,"sl":143},{"el":161,"sc":2,"sl":158},{"el":166,"sc":2,"sl":163},{"el":175,"sc":2,"sl":168},{"el":184,"sc":2,"sl":177},{"el":197,"sc":2,"sl":186},{"el":205,"sc":2,"sl":199},{"el":219,"sc":2,"sl":208}],"name":"CssTest","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_161":{"methods":[{"sl":85},{"sl":199}],"name":"nthOfType_simple","pass":true,"statements":[{"sl":87},{"sl":88},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_214":{"methods":[{"sl":52},{"sl":199}],"name":"firstChild","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_230":{"methods":[{"sl":113},{"sl":199}],"name":"nthOfType_advanced","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_260":{"methods":[{"sl":58},{"sl":199}],"name":"lastChild","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_3":{"methods":[{"sl":208}],"name":"root","pass":true,"statements":[{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":218}]},"test_319":{"methods":[{"sl":163},{"sl":199}],"name":"lastOfType","pass":true,"statements":[{"sl":165},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_359":{"methods":[{"sl":99},{"sl":199}],"name":"nthChild_advanced","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_43":{"methods":[{"sl":64},{"sl":199}],"name":"nthChild_simple","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_438":{"methods":[{"sl":158},{"sl":199}],"name":"firstOfType","pass":true,"statements":[{"sl":160},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_468":{"methods":[{"sl":143},{"sl":199}],"name":"nthLastOfType_advanced","pass":true,"statements":[{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":154},{"sl":155},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_485":{"methods":[{"sl":128},{"sl":199}],"name":"nthLastChild_advanced","pass":true,"statements":[{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":139},{"sl":140},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_735":{"methods":[{"sl":71},{"sl":199}],"name":"nthOfType_unknownTag","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_751":{"methods":[{"sl":168}],"name":"empty","pass":true,"statements":[{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174}]},"test_785":{"methods":[{"sl":186}],"name":"onlyOfType","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196}]},"test_877":{"methods":[{"sl":177},{"sl":199}],"name":"onlyChild","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":183},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_880":{"methods":[{"sl":92},{"sl":199}],"name":"nthLastOfType_simple","pass":true,"statements":[{"sl":94},{"sl":95},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]},"test_918":{"methods":[{"sl":78},{"sl":199}],"name":"nthLastChild_simple","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":200},{"sl":201},{"sl":202},{"sl":203}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [214], [], [214], [214], [], [], [260], [], [260], [260], [], [], [43], [], [43], [43], [], [], [], [735], [], [735], [735], [], [], [], [918], [], [918], [918], [], [], [], [161], [], [161], [161], [], [], [], [880], [], [880], [880], [], [], [], [359], [], [359], [359], [359], [359], [359], [359], [359], [359], [359], [359], [], [], [230], [], [230], [230], [230], [230], [230], [230], [230], [230], [230], [230], [], [], [], [485], [], [485], [485], [485], [485], [485], [485], [485], [485], [], [485], [485], [], [], [468], [], [468], [468], [468], [468], [468], [468], [468], [468], [], [468], [468], [], [], [438], [], [438], [], [], [319], [], [319], [], [], [751], [], [751], [751], [751], [751], [751], [], [], [877], [], [877], [877], [877], [], [877], [], [], [785], [], [785], [785], [785], [785], [785], [785], [785], [785], [785], [], [], [468, 214, 359, 230, 877, 485, 918, 319, 735, 161, 43, 880, 260, 438], [468, 214, 359, 230, 877, 485, 918, 319, 735, 161, 43, 880, 260, 438], [468, 214, 359, 230, 877, 485, 918, 319, 735, 161, 43, 880, 260, 438], [468, 214, 359, 230, 877, 485, 918, 319, 735, 161, 43, 880, 260, 438], [468, 214, 359, 230, 877, 485, 918, 319, 735, 161, 43, 880, 260, 438], [], [], [], [], [3], [], [3], [3], [3], [3], [], [3], [3], [3], [3], [], [], []]